/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

import java.util.ArrayList;

/**
 * Class to get the total energy of the system from a fix time and variable power of the System
 * @author Kamadje Allen
 */
public class TPower extends Total{
    private ArrayList<Power> powers = new ArrayList<>();
    private int tPower;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    public TPower(ArrayList<Power> powers, int hours) {
        this.powers = powers;
        this.hours = hours;
    }

    public TPower(int tPower, int hours) {
        this.tPower = tPower;
        this.hours = hours;
    }

    public int gettPower() {
        return tPower;
    }

    public void settPower(int tPower) {
        this.tPower = tPower;
    }

    /**
     * return a total same number of hours of autonomy for all loads in the local
     * meaning all the loads will have the same number of autonomy
     * @return 
     */
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setPowers(ArrayList<Power> tPowers) {
        this.powers = tPowers;
    }

    public ArrayList<Power> getPowers() {
        return powers;
    }
    
    private int returnTEnergy(){
        ArrayList<Power> powers = getPowers();
        if (powers.isEmpty()) {
            return gettPower() * getHours();
        } else {
            int val = 0;
            for(Power power : powers){
                val = val + power.getPower();
            }
            return val * getHours();
        }
    }
    
    @Override
    public float total() {
        return (float) (super.getVal() * returnTEnergy());
    }
}
