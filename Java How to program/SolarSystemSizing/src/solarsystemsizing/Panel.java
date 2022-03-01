/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author Kamadje Allen
 */
public class Panel {
    private int power;
    private int voltage;
    private int nominalVoltage;

    public Panel(int power, int voltage, int nominalVoltage) {
        this.power = power;
        this.voltage = voltage;
        this.nominalVoltage = nominalVoltage;
    }

    public int getPower() {
        return power;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getNominalVoltage() {
        return nominalVoltage;
    }
}
