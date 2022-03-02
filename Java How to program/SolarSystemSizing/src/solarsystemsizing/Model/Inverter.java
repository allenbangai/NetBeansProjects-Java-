/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Inverter {
    private int ratedWatt;
    private int ratedVAR;
    private int ratedVA;
    private int powerFactor;
    private int DCinput;

    public Inverter(int ratedWatt, int DCinput){
        this.ratedWatt = ratedWatt;
        this.DCinput = DCinput;
    }
}
