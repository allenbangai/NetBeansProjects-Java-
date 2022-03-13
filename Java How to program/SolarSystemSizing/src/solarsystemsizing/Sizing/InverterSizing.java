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
        if(systemMaxPower > 0 && systemMaxPower <= 3000 && inverterVoltage == 0){
            inverterVoltage = 12;
        }else if (systemMaxPower > 3000 && systemMaxPower <= 10000 && inverterVoltage == 0){
            inverterVoltage = 24;
        }else if(systemMaxPower > 10000 && inverterVoltage == 0){
            inverterVoltage = 48;
        }
        return inverterVoltage;
    }

    private Inverter findInverter(){
        Inverter inverter1;
        int inverterRatedWatt;
        int init, diff = 0, i=0;

        for(Inverter inverter: inverters){
            inverterRatedWatt = inverter.getRatedWatt();
            if(inverterRatedWatt > systemMaxPower){
                init = inverterRatedWatt - systemMaxPower;
                if(i == 0){
                    diff = init;
                }
                if(diff >= init){
                    diff = init;
                }
            }
            i++;
        }




        return inverter1;
    }

    public Inverter getInverter(){
        return new Inverter(1000, 24);
    }

}
