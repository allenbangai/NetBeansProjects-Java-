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
public class OverallEnergy extends Total{
    private ArrayList<TEnergy> tEnergys  ;

    public OverallEnergy(ArrayList<TEnergy> tEnergys) {
        this.tEnergys = tEnergys;
    }    

    public ArrayList<TEnergy> gettEnergys() {
        return tEnergys;
    }

    public void settEnergys(ArrayList<TEnergy> tEnergys) {
        this.tEnergys = tEnergys;
    }
    
    private int returnTotal(){
        ArrayList<TEnergy> energys = gettEnergys();
        int val = 0;
        for (TEnergy energy : energys) {
            val = val + energy.getTPower();
        }
        return val;
    }

    @Override
    public double total() {
        return super.getVal() * returnTotal();
    }
    
    
    
    
}
