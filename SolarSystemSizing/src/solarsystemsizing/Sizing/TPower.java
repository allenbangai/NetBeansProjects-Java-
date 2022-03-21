/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Sizing;

import solarsystemsizing.Total;
import solarsystemsizing.Model.Power;
import java.util.ArrayList;

/**
 * Class to get the total energy of the system from a fix time and variable power of the System
 * 
 * @since year 2022
 * 
 * @version 1.0
 * 
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

    private int val1 = 0;
    private void toHelp(){
        for(Power power : powers){
            val1 = val1 + power.getPower();
        }
    }
    
    private int returnTEnergy(){
        ArrayList<Power> powers = getPowers();
        if (powers.isEmpty()) {
            return gettPower() * getHours();
        } else {
            toHelp();
            return val1 * getHours();
        }
    }
    
    @Override
    public double totalE() {
        return (double) (super.getVal() * returnTEnergy());
    }

    @Override
    public double totalP() {
        if(getPowers().isEmpty()){
            return (double) (getVal() * gettPower());
        }else{
            toHelp();
            return (double) (getVal() * val1);
        }
    }
}
