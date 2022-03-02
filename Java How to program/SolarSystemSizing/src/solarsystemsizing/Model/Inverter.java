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

    /**
     * 
     * @param ratedWatt
     * @param DCinput
     */
    public Inverter(int ratedWatt, int DCinput){
        this.ratedWatt = ratedWatt;
        this.DCinput = DCinput;
    }

    /**
     * 
     * @param ratedVAR
     * @param powerFactor
     * @param DCinput
     */
    public Inverter(int ratedVAR, int powerFactor, int DCinput){
        this.ratedVAR = ratedVAR;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
    }

    /**
     * 
     * @param ratedVA
     * @param powerFactor
     * @param DCinput
     * @param bool
     */
    public Inverter(int ratedVA, int powerFactor, int DCinput, Boolean bool){
        this.ratedVA = ratedVA;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
    }    

    /**
     * @return int return the ratedWatt
     */
    public int getRatedWatt() {
        return ratedWatt;
    }

    /**
     * @return int return the ratedVAR
     */
    public int getRatedVAR() {
        return ratedVAR;
    }

    /**
     * @return int return the ratedVA
     */
    public int getRatedVA() {
        return ratedVA;
    }

    /**
     * @return int return the powerFactor
     */
    public int getPowerFactor() {
        return powerFactor;
    }

    /**
     * @return int return the DCinput
     */
    public int getDCinput() {
        return DCinput;
    }
    
}
