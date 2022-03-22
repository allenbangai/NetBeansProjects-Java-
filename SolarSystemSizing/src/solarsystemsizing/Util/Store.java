package solarsystemsizing.Util;

import solarsystemsizing.Model.*;
import java.util.ArrayList;
/**
 * This class store samples of each object use in the sizing of our system
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Store {
    
    public Store(){

    }

    /**
     * This method returns a storage of the available list of panels object in store in the app
     * @return
     */
    public static ArrayList<Panel> getPanels(){
        ArrayList<Panel> panels = new ArrayList<>();
        panels.add(new Panel(100, 12, 18));
        panels.add(new Panel(110, 12, 18));
        panels.add(new Panel(150, 12, 18));
        panels.add(new Panel(200, 24, 36));
        panels.add(new Panel(220, 24, 36));
        panels.add(new Panel(275, 24, 36));
        panels.add(new Panel(300, 24, 36));
        panels.add(new Panel(350, 24, 36));
        return panels;
    }

    /**
     * This method returns a storage of the available list of inverters object in store in the app
     * @return
     */
    public static ArrayList<Inverter> getInverters(){
        ArrayList<Inverter> inverters = new ArrayList<>();
        inverters.add(new Inverter(300, 12));
        inverters.add(new Inverter(200, 12));
        inverters.add(new Inverter(400, 12));
        inverters.add(new Inverter(500, 12));
        inverters.add(new Inverter(600, 12));
        inverters.add(new Inverter(1000, 24));
        inverters.add(new Inverter(1000, 12));
        inverters.add(new Inverter(1000, 24));
        inverters.add(new Inverter(1200, 12));
        inverters.add(new Inverter(1500, 12));
        inverters.add(new Inverter(1500, 24));
        inverters.add(new Inverter(2000, 12));
        inverters.add(new Inverter(2000, 24));
        inverters.add(new Inverter(2500, 12));
        inverters.add(new Inverter(2500, 24));
        inverters.add(new Inverter(3000, 12));
        inverters.add(new Inverter(3000, 24));
        inverters.add(new Inverter(3500, 12));
        inverters.add(new Inverter(3500, 24));
        inverters.add(new Inverter(4000, 12));
        inverters.add(new Inverter(4000, 24));
        inverters.add(new Inverter(4000, 48));
        inverters.add(new Inverter(4500, 12));
        inverters.add(new Inverter(4500, 24));
        inverters.add(new Inverter(4500, 48));
        inverters.add(new Inverter(5000, 12));
        inverters.add(new Inverter(5000, 24));
        inverters.add(new Inverter(5000, 48));
        inverters.add(new Inverter(5500, 48));
        inverters.add(new Inverter(6000, 48));
        inverters.add(new Inverter(10000, 48));
        inverters.add(new Inverter(15000, 48));
        return inverters;
    }

    /**
     * This method returns a storage of the available list of batteries object in store in the app
     * @return
     */
    public ArrayList<Battery> getBatteries() {
        ArrayList<Battery> batteries = new ArrayList<>();
        batteries.add(new Battery(12, 110));
        batteries.add(new Battery(12, 100));
        batteries.add(new Battery(12, 140));
        batteries.add(new Battery(12, 145));
        batteries.add(new Battery(12, 200));
        batteries.add(new Battery(12, 210));
        batteries.add(new Battery(12, 225));
        batteries.add(new Battery(12, 240));
        batteries.add(new Battery(12, 250));
        batteries.add(new Battery(12, 300));
        batteries.add(new Battery(12, 175));
        batteries.add(new Battery(12, 150));
        batteries.add(new Battery(12, 180));
        batteries.add(new Battery(12, 120));
        batteries.add(new Battery(12, 130));
        batteries.add(new Battery(12, 160));
        batteries.add(new Battery(12, 70));
        batteries.add(new Battery(12, 75));
        batteries.add(new Battery(12, 80));
        batteries.add(new Battery(12, 85));
        batteries.add(new Battery(12, 90));
        //batteries.add(new Battery(12, 225));
        batteries.add(new Battery(24, 40));
        batteries.add(new Battery(24, 55));
        batteries.add(new Battery(24, 50));
        batteries.add(new Battery(24, 200));
        batteries.add(new Battery(24, 150));
        batteries.add(new Battery(24, 60));
        batteries.add(new Battery(24, 70));
        batteries.add(new Battery(24, 75));
        //batteries.add(new Battery(24, 70));
        batteries.add(new Battery(2, 200));
        batteries.add(new Battery(2, 300));
        batteries.add(new Battery(2, 400));
        batteries.add(new Battery(2, 500));
        batteries.add(new Battery(2, 600));
        batteries.add(new Battery(2, 700));
        batteries.add(new Battery(2, 800));
        batteries.add(new Battery(2, 1000));
        batteries.add(new Battery(2, 1200));
        batteries.add(new Battery(2, 1500));
        batteries.add(new Battery(2, 2000));
        batteries.add(new Battery(2, 2500));
        batteries.add(new Battery(2, 3000));
        return batteries;
    }
}