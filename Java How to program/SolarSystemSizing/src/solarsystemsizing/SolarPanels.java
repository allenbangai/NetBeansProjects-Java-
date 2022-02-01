/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

import java.util.ArrayList;

/**
 *
 * @author kamadje Allen
 */
public class SolarPanels {
    private float energy;
    private float irradiance;
    /**
     * This variable comprises all the available solar panels 
     * and their respective power
     */
    int[] panelsPower = {100, 120, 150, 200, 220, 250, 275, 300, 350};
    private ArrayList<Integer> panelList = new ArrayList<>();   
    private int panelNumber;
    private int panelPower;
    private int position;

    /**
     * Constructor Solar panel
     * @param energy
     * @param irradiance 
     */
    public SolarPanels(float energy, float irradiance) {
        this.energy = energy;
        this.irradiance = irradiance;
        
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

    public int getPanelNumber() {
        return panelNumber;
    }

    public int getPanelPower() {
        return panelPower;
    }
    
    private void findPanelPower(){
       pa
    }
    
    /**
     * Private method to get the smallest number of panels needed for sizing the system
     * @return 
     */
    private void findPanelNumber(){        
        float val;
        for(int panel : panelsPower){
            val = (float)panel;
            int panelNum = Math.round(energy/(val*irradiance));
            if (!isEven(panelNum)) {
                panelNum++;
            }
            panelList.add(panelNum);            
        }
        panelNumber = panelList.get(0);
        for (int i = 0; i < panelList.size(); i++) {
            int num = panelList.get(i);
            if (num < panelNumber) {
                panelNumber = num;
                position = i;
            }
        }        
    } 
    
    /**
     * Function is to return true if input @param is even
     * @param 
     * val is of type int
     * @return 
     * It return either a true or false
     */
    private boolean isEven(int val){
        if(val%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
