/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Battery {
    private int voltage;
    private int ampereHour;

    public Battery(int voltage, int ampereHour) {
        this.voltage = voltage;
        this.ampereHour = ampereHour;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getAmpereHour() {
        return ampereHour;
    }
    
    public int getEnergy(){
        return voltage * ampereHour;
    }
}