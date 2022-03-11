package solarsystemsizing;

import java.util.*;

import solarsystemsizing.Model.Panel;

/**
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
        SolarPanels solarPanels;
        /**
         * This variable comprises all the available solar panels objects
         * {100, 120, 150, 200, 220, 250, 275, 300, 350};
         */
        ArrayList<Panel> panelList = new ArrayList<>();
        panelList.add(new Panel(100, 12, 18));
        panelList.add(new Panel(110, 12, 18));
        panelList.add(new Panel(150, 12, 18));
        panelList.add(new Panel(200, 24, 36));
        panelList.add(new Panel(220, 24, 36));
        panelList.add(new Panel(275, 24, 36));
        panelList.add(new Panel(300, 24, 36));
        panelList.add(new Panel(350, 24, 36));
        
        //variables here
        float stmEnergy = 0;
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
                total = new TEnergy(4000);
                stmEnergy = total.total();
                solarPanels = new SolarPanels(stmEnergy, (float) 4.3, panelList);
                stmNumberOfPanels = solarPanels.getPanelNumber();
                stmPowerOfPanels = solarPanels.getPanel().getPower();
                break;
            case 4:
                System.out.println("here, you will have the sizing of your system from the total ");
                System.out.println("individual power and number of load for each device of the system inputed");
                total = new TPower(2000, 5);
                stmEnergy = total.total();
                solarPanels = new SolarPanelPro(stmEnergy, (float) 4.3, 300);
                stmNumberOfPanels = solarPanels.getPanelNumber();
                stmPowerOfPanels = solarPanels.getPanelPower();
                break;
        }
        System.out.println("System Energy is: "+ stmEnergy);
        System.out.println("System will have " + stmNumberOfPanels + " of " + stmPowerOfPanels + " each");
    }
}
