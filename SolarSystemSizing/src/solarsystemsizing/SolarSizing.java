package solarsystemsizing;

import java.util.*;

import solarsystemsizing.Model.*;
import solarsystemsizing.Sizing.*;
import solarsystemsizing.Util.Store;

/**
 *
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class SolarSizing {
    static int sizingType;
    //method for declaring scanner
    static Scanner ssScanner; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Total total;
        PanelSizing panelSizing = new PanelSizing();
        InverterSizing inverterSizing =  new InverterSizing();
        BatterySizing batterySizing = new BatterySizing();

        //variables here
        double stmMaxEnergy = 0;
        double stmMaxPower = 0;
        Inverter stmInverter = new Inverter();
        System.out.println("Enter value for sizing type");
        ssScanner = new Scanner(System.in);
        sizingType = ssScanner.nextInt();

        switch(sizingType){
            case 1:
                System.out.println("Here, you will have the sizing "
                        + "of your system from the total energy of the system inputed");
                break;
            case 2:
                System.out.println("Here, you will have the sizing of your system"
                        + " from the total power of the system and the total time of autonomy of all device inputed");
                break;
            case 3:
                System.out.println("Here, you will have the sizing of your system from the total individual"
                        + " power, number of loads and hours of autonomu for each device of the system inputed");
                total = new TEnergy(4000, 5);
                stmMaxEnergy = total.totalE();
                stmMaxPower = total.totalP();
                panelSizing = new PanelSizing(stmMaxEnergy, 4.3, Store.getPanels());
                inverterSizing = new InverterSizing(Store.getInverters(), (int) stmMaxPower);
                batterySizing = new BatterySizing(Store.getBatteries(), stmMaxEnergy, stmInverter);
                break;
            case 4:
                System.out.println("Here, you will have the sizing of your system from the total ");
                System.out.println("Individual power and number of load for each device of the system inputed");
                total = new TPower(2000, 5);
                stmMaxEnergy = total.totalE();
                stmMaxPower = total.totalP();
                Panel panel = new Panel(300, 24, 36);
                panelSizing = new PanelSizingPro(stmMaxEnergy, (float) 4.3, panel);
                inverterSizing = new InverterSizing(Store.getInverters(), (int) stmMaxPower);
                inverterSizing.setInverterVoltage(24);
                batterySizing = new BatterySizing(Store.getBatteries(), stmMaxEnergy, inverterSizing.getInverter());
                batterySizing.setBatteryVoltage(12);
                break;
        }
        System.out.println("\nSystem Energy is: "+ stmMaxEnergy + "Ah and System power is: "+stmMaxPower + "W.");
        System.out.println(panelSizing.toString());
        System.out.println(inverterSizing.toString());
        System.out.println(batterySizing.toString());
    }
}
