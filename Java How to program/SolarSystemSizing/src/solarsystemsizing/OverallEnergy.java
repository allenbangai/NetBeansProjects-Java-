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
public class OverallEnergy extends OverallPower{
    private ArrayList<TEnergy> tEnergys;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    public OverallEnergy(int hours, ArrayList<TPower> tPowers) {
        super(tPowers);
        this.hours = hours;
    }

    public OverallEnergy(ArrayList<TPower> tPowers) {
        this.tEnergys = tEnergys;
    }
    
    
}
