package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.Inverter;

/**
 * @since
 * version 1.0
 * @author
 * Kamadje Allen
 */
public class InverterSizing {
    private ArrayList<Inverter> inverters = new ArrayList<>();
    private int systemMaxPower;
    private int inverterVoltage = 0;

    /**
     * 
     * @param inverters
     * @param systemMaxPower
     */
    public InverterSizing(ArrayList<Inverter> inverters, int systemMaxPower) {
        this.inverters = inverters;
        this.systemMaxPower = systemMaxPower;
    }    

    /**
     * @return ArrayList<Inverter> return the inverters
     */
    public ArrayList<Inverter> getInverters() {
        return inverters;
    }

    /**
     * @param inverters the inverters to set
     */
    public void setInverters(ArrayList<Inverter> inverters) {
        this.inverters = inverters;
    }

    /**
     * @return int return the systemMaxPower
     */
    public int getSystemMaxPower() {
        return systemMaxPower;
    }

    /**
     * @param systemMaxPower the systemMaxPower to set
     */
    public void setSystemMaxPower(int systemMaxPower) {
        this.systemMaxPower = systemMaxPower;
    }

    /***
     * 
     * @param inverterVoltage
     */
    public void setInverterVoltage(int inverterVoltage){
        this.inverterVoltage = inverterVoltage;
    }

    /**
     * 
     * @return
     */
    private int getInverterVoltage(){
        if(systemMaxPower > 0 && systemMaxPower <= 3000){
            inverterVoltage = 12;
        }else if (systemMaxPower > 3000 && systemMaxPower <= 10000){
            inverterVoltage = 24;
        }else{
            inverterVoltage = 48;
        }
        return inverterVoltage;
    }

    public Inverter getInverter(){
        return new Inverter(1000, 24);
    }

}
