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
    private ArrayList<Energy> energys = new ArrayList<>();
    int tEnergy;

    public TEnergy(ArrayList<Energy> energys) {
        this.energys = energys;
    }

    public TEnergy(int tEnergy) {
        this.tEnergy = tEnergy;
    }

    public int gettEnergy() {
        return tEnergy;
    }

    public void settEnergy(int tEnergy) {
        this.tEnergy = tEnergy;
    }

    public ArrayList<Energy> getEnergys() {
        return energys;
    }

    public void setEnergys(ArrayList<Energy> tEnergys) {
        this.energys = tEnergys;
    }
    
    private int returnTotalEnergy(){
        if (getEnergys().isEmpty()) {
            return gettEnergy();
        } else {
            int val = 0;
            for (Energy energy : energys) {
                val = val + energy.getPower();
            }
            return val;
        }
    }

    @Override
    public float total() {
        return (float) (super.getVal() * (double)returnTotalEnergy());
    }    
}
