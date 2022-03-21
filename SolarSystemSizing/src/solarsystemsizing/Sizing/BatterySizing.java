package solarsystemsizing.Sizing;

import solarsystemsizing.Model.*;
import java.util.*;

/**
 * This class is used to sizing everything concerning batteries
 * @since year 2022
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
    private int batteryAmpereHour = 0;

    /**
     * Constructor for sizing Battery sizing
     * @param {@link #batteries}
     * This is a least of all posiible batteries that the class will use to set a battery from
     * to size the sistem.
     * @param {@link #stmMaxEnergy}
     * The system mazimum energy because the total set of batteries energy is suppose to be equal to 
     * or greater than the system energy consumption in hours. 
     * @param {@link #inverter}
     * This inverter gives use the inverter object that was used in sizing the system for reason which
     * can be found in our algorithm.
     */
    public BatterySizing(ArrayList<Battery> batteries, int stmMaxEnergy, Inverter inverter) {
        this.batteries = batteries;
        this.stmMaxEnergy = stmMaxEnergy;
        this.inverter = inverter;
    }

    /**
     * Return the possible list of batteries that can be used by the user to size the system
     * given the user choice among them.
     * @return
     */
    public ArrayList<Battery> getBatteries() {
        ArrayList<Battery> batteryList1 = new ArrayList<>();
        int batteryVoltage = getBatteryVoltage();
        for(Battery battery: batteries){
            if(batteryVoltage == battery.getVoltage()){
                batteryList1.add(battery);
            }
        }
        return batteryList1;
    }

    /**
     * @return int return the max energy that willbe used per day
     */
    public int getStmMaxEnergy() {
        return stmMaxEnergy;
    }

    /**
     * Return the an object of the inverter used in sizing the system.
     * @return 
     */
    private Inverter getInverter() {
        return inverter;
    }

    /**
     * 
     * @return {@link #getStmMaxPower()} return {@link #getInverter()}.getRatedWatt() that is the
     * ivnerter output power rating in Watts. 
     */
    public int getStmMaxPower(){
        return getInverter().getRatedWatt();
    }

    /**
     * 
     * @return {@link #getStmDCVoltage()} return {@link #getInverter()}.getDCinput() that is 
     * the inverter system DC voltage used in the system.
     */
    public int getStmDCVoltage(){
        return getInverter().getDCinput();
    }

    /**
     * @return int return the batteryVoltage that will be use to size the system.
     */
    public int getBatteryVoltage() {
        return findBatteryVoltage();
    }

    /**
     * @param {@link #batteryVoltage} the batteryVoltage to set.
     */
    public void setBatteryVoltage(int batteryVoltage) {
        this.batteryVoltage = batteryVoltage;
    }

    /**
     * Return the default battery ampereHour needed by the system. This ampereHour value can either be
     * programmatically chosen by the algorithm or manually chosen by the user.
     * @return
     */
    public int getBatteryAmpereHour(){
        if(batteryAmpereHour == 0){
            for(Battery battery: getBatteries()){
                if(batteryAmpereHour <= battery.getAmpereHour()){
                    batteryAmpereHour = battery.getAmpereHour();
                }
            }
        }
        return batteryAmpereHour;
    }

    /**
     * 
     * @param ampereHour Set the battery ampereHour needed for sizing the batteries chosen 
     * from the list of available batteries available for sizing o batteries.
     */
    public void setBatteryAmpereHour(int ampereHour) {
        this.batteryAmpereHour = ampereHour;
    }

    /**
     * This methd will you determine if two instance of BatterySizing are equal and return
     * true if they are equal else return false.
     */
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

    /**
     * The override {@link #toString()} prints you know everything you need to know about
     * the class BattterySizing.java.
     * @return
     */
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
     * Returns the required battery voltage that will be used for sizing the system.
     * @return
     */
    private int findBatteryVoltage(){
        if(getStmMaxPower() > 0 && getStmMaxPower() <= 10000 && batteryVoltage == 0){
            batteryVoltage = 12;
        }else if (getStmMaxPower() > 10000 && batteryVoltage == 0) {
            batteryVoltage = 2;
        }
        return batteryVoltage;
    }

    /**
     * Return total set of batteries energy in amperehour (Ah).
     * @return
     */
    public int getBatteriesEnergy_AH(){
        return Math.round(getStmMaxEnergy()/getBatteryVoltage());
    }

    /**
     * Return the required number of batteries needed for sizing the system.
     * @return
     */
    public int findBatteryNum() {
        return getBatteriesEnergy_AH()/getBatteryAmpereHour();
    }

    /**
     * Return the number of series connection for batteries array connection.
     * @return
     */
    public int getSeriesConnection(){
        return getStmDCVoltage()/getBatteryVoltage();
    }

    /**
     * Return the number of parallel connections for batteries array connection.
     * @return
     */
    public int getParallelConnection(){
        return findBatteryNum()/getSeriesConnection();
    }

}
