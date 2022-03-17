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
    ArrayList<Battery> batteries = new ArrayList<>();
    int stmMaxEnergy;
    int stmMaxPower;
    int stmVoltage = 0;

    public BatterySizing(){

    }

    public BatterySizing(ArrayList<Battery> batteries, int stmMaxEnergy, int stmMaxPower) {
        this.batteries = batteries;
        this.stmMaxEnergy = stmMaxEnergy;
        this.stmMaxPower = stmMaxPower;
    }

    public ArrayList<Battery> getBatteries() {
        return this.batteries;
    }

    public int getStmMaxEnergy() {
        return this.stmMaxEnergy;
    }

    public int getStmMaxPower() {
        return this.stmMaxPower;
    }

    public void setStmMaxPower(int stmMaxPower) {
        this.stmMaxPower = stmMaxPower;
    }

    public int getStmVoltage() {
        return this.stmVoltage;
    }

    public void setStmVoltage(int stmVoltage) {
        this.stmVoltage = stmVoltage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BatterySizing)) {
            return false;
        }
        BatterySizing batterySizing = (BatterySizing) o;
        return Objects.equals(batteries, batterySizing.batteries) && stmMaxEnergy == batterySizing.stmMaxEnergy && stmMaxPower == batterySizing.stmMaxPower;
    }

    @Override
    public String toString() {
        return "{" +
            " batteries='" + getBatteries() + "'" +
            ", stmMaxEnergy='" + getStmMaxEnergy() + "'" +
            ", stmMaxPower='" + getStmMaxPower() + "'" +
            ", stmVoltage='" + getStmVoltage() + "'" +
            "}";
    }
}
