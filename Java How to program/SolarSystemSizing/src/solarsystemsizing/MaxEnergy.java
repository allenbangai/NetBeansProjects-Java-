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
public class MaxEnergy {
    private ArrayList<TPower> tPowers;
    private ArrayList<TEnergy> tEnergys;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    public MaxEnergy(ArrayList<TPower> tPowers, int hours) {
        this.tPowers = tPowers;
        this.hours = hours;
    }
    
    
    
}
