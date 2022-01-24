/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class TPower extends Total{
    private ArrayList<Power> powers;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    public TPower(ArrayList<Power> powers, int hours) {
        this.powers = powers;
        this.hours = hours;
    }

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
    
    private int returnTotal(){
        ArrayList<Power> powers = getPowers();
        int val = 0;
        for(Power power : powers){
            val = val + power.getPower();
        }
        return val * getHours();
    }

    @Override
    public double total() {
        return super.getVal() * returnTotal();
    }
}
