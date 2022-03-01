/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author Kamadje Allen
 */
public class Battery {
    int voltage;
    int ampereHour;

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
