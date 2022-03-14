package solarsystemsizing.Util;

import solarsystemsizing.Model.*;
import java.util.ArrayList;

public class Store {
    public Store(){

    }

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

    public static ArrayList<Inverter> getInverter(){
        ArrayList<Inverter> inverters = new ArrayList<>();
        inverters.add(new Inverter(1000, 12));
        inverters.add(new Inverter(1000, 24));
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
        inverters.add(new Inverter(4000, 24));
        inverters.add(new Inverter(4000, 48));
        inverters.add(new Inverter(4500, 24));
        inverters.add(new Inverter(4500, 48));
        inverters.add(new Inverter(5000, 24));
        inverters.add(new Inverter(5000, 48));
        inverters.add(new Inverter(5500, 48));
        inverters.add(new Inverter(6000, 48));
        inverters.add(new Inverter(10000, 48));
        inverters.add(new Inverter(15000, 48));
        return inverters;
    }
}