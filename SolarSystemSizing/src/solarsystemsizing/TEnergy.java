/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

import solarsystemsizing.Model.Energy;
import java.util.ArrayList;

/**
 * @since 1.0
 *
 * @author Kamadje Allen
 */
public class TEnergy extends Total{
    private ArrayList<Energy> energys = new ArrayList<>();
    private int tEnergy;
    private int hours;

    public TEnergy(ArrayList<Energy> energys) {
        this.energys = energys;
    }

    public TEnergy(int tEnergy, int hours) {
        this.tEnergy = tEnergy;
        this.hours = hours;
    }

    public int getHours(){
        return hours;
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

    private int val1 = 0, val2 = 0;
    private void toHelp(){
        for (Energy energy : energys) {
            val1 = val1 + energy.getEnergy();
            val2 = val2 + energy.getPower();
        }

    }
    
    private int returnTotalEnergy(){
        if (getEnergys().isEmpty()) {
            return gettEnergy();
        }else {
            toHelp();
            return val1;
        }
    }

    @Override
    public double totalE() {
        return (double) (getVal() * returnTotalEnergy());
    }
    
    @Override
    public double totalP(){
        if(getEnergys().isEmpty()){
            return (double) (getVal() * (gettEnergy()/getHours()));
        }else{
            toHelp();
            return (double) (getVal() * val2);
        }
    }
}
