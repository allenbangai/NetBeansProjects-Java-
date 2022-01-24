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
public class TEnergy extends Total{
    private ArrayList<Energy> energys  ;

    public TEnergy(ArrayList<Energy> energys) {
        this.energys = energys;
    }    

    public ArrayList<Energy> getEnergys() {
        return energys;
    }

    public void setEnergys(ArrayList<Energy> tEnergys) {
        this.energys = tEnergys;
    }
    
    private int returnTotal(){
        ArrayList<Energy> energys = getEnergys();
        int val = 0;
        for (Energy energy : energys) {
            val = val + energy.getPower();
        }
        return val;
    }

    @Override
    public double total() {
        return super.getVal() * returnTotal();
    }    
}
