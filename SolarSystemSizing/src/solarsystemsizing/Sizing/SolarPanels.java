/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.Panel;

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
    private ArrayList<Panel> panels = new ArrayList<>();
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
    }    

    /**
     * 
     * @param energy
     * @param irradiance
     * @param panels
     */
    public SolarPanels(double energy, double irradiance, ArrayList<Panel> panels) {
        this.energy = energy;
        this.irradiance = irradiance;
        this.panels = panels;
        //initializing method to find panelNumber and panel power position
        this.findPanelNumber();
    }
    

    /**
     * Setter for initiating private variable energy
     * @param energy 
     */
    public void setEnergy(float energy) {
        this.energy = energy;
    }

    /**
     * Setter for initiating private variable irradiance
     * @param irradiance 
     */
    public void setIrradiance(float irradiance) {
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
     * Method {@link #getPanelPower()}
     * @return
     * This method returns the selected panel power for sizing the system
     * Returned value is of type Integer
     */
    public int getPanelPower() {
        panelPower = panelsPower[position];
        return panelPower;
    }

    /**
     * Method {@link #getPanel()}
     * @return
     * This method returns the selected panel object for sizing the system
     * The returned value is of type Panel giving you the panelVoltage, panelPower, and 
     * panelNominalVoltage.
     */
    public Panel getPanel(){
        return panels.get(position);
    }
    
    /**
     * Private method to get the smallest number of panels needed for sizing the system.
     * This method also helps to determine to determine the type of panel object needed for sizing the object
     */
    private void findPanelNumber(){        
        float val;
        for(Panel panel : panels){
            val = (float)panel.getPower();
            panelNumber = (int) Math.round(energy/(val*irradiance));
            if (!isEven(panelNumber)) {
                panelNumber++;
            }
            panelList.add(panelNumber);         
        }
        panelNumber = panelList.get(0);
        //this for loop is to get the smallest number of panels needed possible as well as the position of the
        //panel power in the panel list
        for (int i = 0; i < panelList.size(); i++) {
            int num = panelList.get(i);
            if (panelNumber >= num) {
                panelNumber = num;
                position = i;
            }
        }
    } 
    
    /**
     * Function is to return true if input value is even.
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