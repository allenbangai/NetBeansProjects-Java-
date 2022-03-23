package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.Inverter;

/**
 * 
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
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

    public InverterSizing() {
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
        if(systemMaxPower > 0 && systemMaxPower <= 2000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage1;
        }else if (systemMaxPower > 2000 && systemMaxPower <= 10000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage2;
        }else if(systemMaxPower > 10000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage3;
        }
        return inverterVoltage;
    }

    /**
     * 
     * @return
     */
    private Inverter findInverter(){
        Inverter actualInverter = new Inverter();
        ArrayList<Inverter> inverList = new ArrayList<>();
        int inverterRatedWatt;
        int init;
        int diff = 0;
        int i;

        //part 1
        i = 0;
        for(Inverter inverter: inverters){
            inverterRatedWatt = inverter.getRatedWatt();
            if(inverterRatedWatt > systemMaxPower){
                init = inverterRatedWatt - systemMaxPower;
                if(i == 0){
                    diff = init;
                }
                i++;
                if(diff >= init){
                    diff = init;
                }
            }
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
        }

        //part 3
        i = 0;
        for(Inverter inverter: inverList){
            if(getInverterVoltage() == inverter.getDCinput()){
                actualInverter = inverter;
                break; //we break here because we have already obtained our desired inverter
                // rated DC input voltage
            }else{
                /**
                 * This condition is excuted if and only if an inverter is not found with
                 * the system voltage dicided by the system or by the user.
                 * Hence an inverter with the highest voltage is selected for sizing the system
                 */
                Inverter obj = inverter;
                if(i == 0){
                    actualInverter = inverter;
                }
                i++;
                if(obj.getDCinput() >= actualInverter.getDCinput()){
                    actualInverter = obj;
                }
            }
        }
        return actualInverter;
    }

    /**
     * 
     * @return
     */
    public Inverter getInverter(){
        return findInverter();
    }

}
