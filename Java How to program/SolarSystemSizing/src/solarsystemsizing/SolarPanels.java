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
     * Constructor Solar panel
     * @param energy
     * @param irradiance 
     */
    public SolarPanels(float energy, float irradiance) {
        this.energy = energy;
        this.irradiance = irradiance;
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
    
    private int getPanelNumber(float systemeEnergy){
        int[] panelsPower = {100, 120, 150, 200, 220, 250, 275, 300, 350};
        float panels;
        ArrayList<Integer> panelList = new ArrayList();
        for(int panel : panelsPower){
            panels = systemeEnergy/panel;
            int panelNum = Math.round(panels);
            if (!isEven(panelNum)) {
                panelNum++;
            }
            panelList.add(panelNum);
        }
        return 0;
    }
    
}
