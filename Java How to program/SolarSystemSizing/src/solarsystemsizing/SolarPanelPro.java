/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author Kamadje Allen
 */
public class SolarPanelPro extends SolarPanels{
    private int panelPower;

    public SolarPanelPro(float energy, float irradiance, int panelPower) {
        super(energy, irradiance);
        this.panelPower = panelPower;
        
        
    }
}
