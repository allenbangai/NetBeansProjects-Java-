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
        PanelSizing solarPanels;
        InverterSizing inverterSizing;
        BatterySizing batterySizing = new BatterySizing();
        ArrayList<Panel> panelList = Store.getPanels();
        ArrayList<Inverter> inverterList = Store.getInverters();

        
        //variables here
        double stmMaxEnergy = 0;
        double stmMaxPower = 0;
        Panel stmPanel;
        Inverter stmInverter = new Inverter();
        int stmNumberOfPanels = 0;
        int stmPowerOfPanels = 0;
        
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
                solarPanels = new PanelSizing(stmMaxEnergy, 4.3, panelList);
                stmNumberOfPanels = solarPanels.getPanelNumber();
                stmPowerOfPanels = solarPanels.getPanel().getPower();
                stmPanel = solarPanels.getPanel();
                inverterSizing = new InverterSizing(inverterList, (int) stmMaxPower);
                stmInverter = inverterSizing.getInverter();
                batterySizing = new BatterySizing(Store.getBatteries(), stmMaxEnergy, stmInverter);
                break;
            case 4:
                System.out.println("Here, you will have the sizing of your system from the total ");
                System.out.println("Individual power and number of load for each device of the system inputed");
                total = new TPower(2000, 5);
                stmMaxEnergy = total.totalE();
                stmMaxPower = total.totalP();
                Panel panel = new Panel(300, 24, 36);
                solarPanels = new PanelSizingPro(stmMaxEnergy, (float) 4.3, panel.getPower());
                stmNumberOfPanels = solarPanels.getPanelNumber();
                stmPowerOfPanels = solarPanels.getPanelPower();
                stmPanel = panel;
                inverterSizing = new InverterSizing(inverterList, (int) stmMaxPower);
                inverterSizing.setInverterVoltage(24);
                stmInverter = inverterSizing.getInverter();
                batterySizing = new BatterySizing(Store.getBatteries(), stmMaxEnergy, stmInverter);
                batterySizing.setBatteryVoltage(24);
                break;
        }
        System.out.println("System Energy is: "+ stmMaxEnergy + "and System power is: "+stmMaxPower);
        System.out.println("System will have " + stmNumberOfPanels + " panels of " 
        + stmPowerOfPanels + "W each");
        System.out.println("System Inverter with rated output of " + stmInverter.getRatedWatt()
        + "W and DC rated input of " + stmInverter.getDCinput() + "V");
        System.out.println(batterySizing.toString());
    }
}
