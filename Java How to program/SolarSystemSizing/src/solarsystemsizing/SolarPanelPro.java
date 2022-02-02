/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 * Class SolarPanelPro which extends class SolarPanels...
 * Has two methods, one to get the number of solar panels needed
 * and another to return the power of the desired solar panel...
 * @author Kamadje Allen
 */
public class SolarPanelPro extends SolarPanels{
    private int panelPower;

    /**
     * Constructor Solar Panel Pro take the following @param...
     * @param energy
     * Total of the system per day of variable float and is rated in wattHour...
     * @param irradiance
     * Solar irradiance of a particular location e.i is total time of sunlight per day...
     * @param panelPower 
     * Desired or available solar panel power intended to size the system...
     * In this case, the power of the available solar panel will be used to size the system
     * and might not be the most optimum choice...
     */
    public SolarPanelPro(float energy, float irradiance, int panelPower) {
        super(energy, irradiance);
        this.panelPower = panelPower;       
    }

    /**
     * Method getPanelNumber...
     * @return 
     * This method return an integer number of the total number of solar panels 
     * needed to size your system...
     */
    @Override
    public int getPanelNumber() {
        float power = (float)panelPower;
        int panelNumber = Math.round(super.getEnergy()/(super.getIrradiance()*power));
        if(!super.isEven(panelNumber)){
            panelNumber++;
        }
        return super.getPanelNumber(); 
    }

    /**
     * @return 
     * This method return the desired power of the available solar panels need to size you systems
     */
    @Override
    public int getPanelPower() {
        return panelPower;
    }
    
    
    
    
}
