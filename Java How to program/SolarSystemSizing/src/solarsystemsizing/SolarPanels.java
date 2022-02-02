/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

import java.util.ArrayList;

/**
 * Class solar panel
 * @author kamadje Allen
 */
public class SolarPanels {
    private double energy;
    private double irradiance;
    /**
     * This variable comprises all the available solar panels 
     * and their respective power
     */
    private int[] panelsPower = {100, 120, 150, 200, 220, 250, 275, 300, 350};
    private ArrayList<Integer> panelList = new ArrayList<>();   
    private int panelNumber;
    private int panelPower;
    private int position;

    /**
     * Constructor Solar panel
     * @param energy
     * @param irradiance 
     */
    public SolarPanels(double energy, double irradiance) {
        this.energy = energy;
        this.irradiance = irradiance;
        //initializing method to find panelNumber and panel power position
        this.findPanelNumber();
    }

    /**
     * Setter for initiating private variable energy
     * @param energy 
     */
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    /**
     * Setter for initiating private variable irradiance
     * @param irradiance 
     */
    public void setIrradiance(double irradiance) {
        this.irradiance = irradiance;
    }

    /** 
     * @return 
     * Method returns the system energy
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * @return 
     * Method returns the system solar irradiance for the particular location
     */
    public double getIrradiance() {
        return irradiance;
    }

    /**
     * Method getPanelNumber
     * @return
     * This method returns the number of panels needed from the selected panel power
     * Return value is of type int
     */
    public int getPanelNumber() {
        return panelNumber;
    }

    /** 
     * Method getPanelPower()
     * @return panelPower
     * This method returns the selected panel power for sizing the system
     * Returned value is of type Integer
     */
    public int getPanelPower() {
        panelPower = panelsPower[position];
        return panelPower;
    }    
    
    /**
     * Private method to get the smallest number of panels needed for sizing the system
     * @return 
     */
    private void findPanelNumber(){        
        double val;
        for(int panel : panelsPower){
            val = (double)panel;
            int panelNum = (int) Math.round(energy/(val*irradiance));
            if (!isEven(panelNum)) {
                panelNum++;
            }
            panelList.add(panelNum);            
        }
        panelNumber = panelList.get(0);
        //this for loop is to get the smallest number of panels needed possible as well as the position of the
        //panel power in the panel list
        for (int i = 0; i < panelList.size(); i++) {
            int num = panelList.get(i);
            if (num < panelNumber) {
                num = panelNumber;
                position = i;
            }
        }  
        System.out.println("position is: "+position);
    } 
    
    /**
     * Function is to return true if input @param is even
     * @param 
     * val is of type int
     * @return 
     * It return either a true or false
     */
    protected boolean isEven(int val){
        if(val%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
