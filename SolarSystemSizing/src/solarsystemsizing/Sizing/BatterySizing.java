package solarsystemsizing.Sizing;

import solarsystemsizing.Model.*;
import java.util.*;

/**
 * 
 * @since 1.0
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class BatterySizing {
    private ArrayList<Battery> batteries = new ArrayList<>();
    private int stmMaxEnergy;
    private Inverter inverter;
    private int batteryVoltage = 0;

    public BatterySizing(){

    }

    public BatterySizing(ArrayList<Battery> batteries, int stmMaxEnergy, Inverter inverter) {
        this.batteries = batteries;
        this.stmMaxEnergy = stmMaxEnergy;
        this.inverter = inverter;
    }

    /**
     * @return ArrayList<Battery> return the batteries
     */
    public ArrayList<Battery> getBatteries() {
        return batteries;
    }

    /**
     * @return int return the stmMaxEnergy
     */
    public int getStmMaxEnergy() {
        return stmMaxEnergy;
    }

    /**
     * @return Inverter return the inverter
     */
    private Inverter getInverter() {
        return inverter;
    }

    /**
     * 
     * @return {@link #getStmMaxPower()} return {@link #getInverter()}.getRatedWatt()
     */
    public int getStmMaxPower(){
        return getInverter().getRatedWatt();
    }

    /**
     * 
     * @return {@link #getStmDCVoltage()} return {@link #getInverter()}.getDCinput()
     */
    public int getStmDCVoltage(){
        return getInverter().getDCinput();
    }

    /**
     * @return int return the batteryVoltage
     */
    public int getBatteryVoltage() {
        return findBatteryVoltage();
    }

    /**
     * @param batteryVoltage the batteryVoltage to set
     */
    public void setBatteryVoltage(int batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BatterySizing)) {
            return false;
        }
        BatterySizing batterySizing = (BatterySizing) o;
        return Objects.equals(batteries, batterySizing.batteries) && stmMaxEnergy == batterySizing.stmMaxEnergy && Objects.equals(inverter, batterySizing.inverter);
    }

    @Override
    public String toString() {
        return "{" +
            " batteries='" + getBatteries() + "'" +
            ", stmMaxEnergy='" + getStmMaxEnergy() + "'" +
            ", inverter DC Voltage='" + getInverter().getDCinput() + "'" +
            ", inverter RatedPower='" + getInverter().getRatedWatt() + "'" +
            ", batteryVoltage='" + getBatteryVoltage() + "'" +
            "}";
    }

    /**
     * 
     * @return
     */
    private int findBatteryVoltage(){
        if(getStmMaxPower() > 0 && getStmMaxPower() <= 10000 && batteryVoltage == 0){
            batteryVoltage = 24;
            if(batteryVoltage > getStmDCVoltage()){
                batteryVoltage = 12;
            }
        }else if (getStmMaxPower() > 10000 && batteryVoltage == 0) {
            batteryVoltage = 2;
        }
        return batteryVoltage;
    }

    /**
     * Return total set of batteries energy in ampere hour AH
     * @return
     */
    public int getBatteriesEnergy_AH(){
        return Math.round(getStmMaxEnergy()/getBatteryVoltage());
    }

    public int findBattery() {
        


        return 0;
    }

}
