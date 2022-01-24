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
public class MaxEnergy extends Total{
    int tEnergy;

    public MaxEnergy(int tEnergy) {
        this.tEnergy = tEnergy;
    }

    public int gettEnergy() {
        return tEnergy;
    }

    public void settEnergy(int tEnergy) {
        this.tEnergy = tEnergy;
    }

    @Override
    public double total() {
        return super.getVal() * gettEnergy();
    }
    
   
    
    
    
}
