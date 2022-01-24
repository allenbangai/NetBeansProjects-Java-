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

    public OverallPower(ArrayList<TPower> tPowers) {
        this.tPowers = tPowers;
    }

    public void settPowers(ArrayList<TPower> tPowers) {
        this.tPowers = tPowers;
    }

    public ArrayList<TPower> gettPowers() {
        return tPowers;
    }
    
    private double returnTotal(){
        ArrayList<TPower> powers = gettPowers();
        int val
        for(TPower power : powers){
            
        }
    }

    @Override
    public double total() {
        return super.getVal();
    }
}
