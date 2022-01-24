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
public class OverallPower extends Total{
    private ArrayList<TPower> tPowers;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    public OverallPower(ArrayList<TPower> tPowers, int hours) {
        this.tPowers = tPowers;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void settPowers(ArrayList<TPower> tPowers) {
        this.tPowers = tPowers;
    }

    public ArrayList<TPower> gettPowers() {
        return tPowers;
    }
    
    private int returnTotal(){
        ArrayList<TPower> powers = gettPowers();
        int val = 0;
        for(TPower power : powers){
            val = val + power.getTPower();
        }
        return val * getHours();
    }

    @Override
    public double total() {
        return super.getVal() * returnTotal();
    }
}
