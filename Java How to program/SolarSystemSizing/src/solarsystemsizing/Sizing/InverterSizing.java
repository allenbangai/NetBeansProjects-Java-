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
    private static final int inverterVoltage1 = 12;
    private static final int inverterVoltage2 = 24;
    private static final int inverterVoltage3 = 48;

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
            inverterVoltage = inverterVoltage1;
        }else if (systemMaxPower > 3000 && systemMaxPower <= 10000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage2;
        }else if(systemMaxPower > 10000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage3;
        }
        return inverterVoltage;
    }

    private Inverter findInverter(){
        Inverter inverter1;
        ArrayList<Inverter> inverList = new ArrayList<>();
        int inverterRatedWatt;
        int init;
        int diff = 0, i=0;

        //part 1
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

        //part 2
        for(Inverter inverter: inverters){
            inverterRatedWatt = inverter.getRatedWatt();
            if(inverterRatedWatt > systemMaxPower){
                init = inverterRatedWatt - systemMaxPower;
                if(diff == init){
                    inverList.add(inverter);
                }
            }
            i++;
        }

        //part 3
        for(Inverter inverter: inverList){

        }
        return inverter1;
    }

    public Inverter getInverter(){
        return new Inverter(1000, 24);
    }

}
