package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Inverter {
    private int ratedWatt;
    private int ratedVAR;
    private int ratedVA;
    private double powerFactor;
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
    public Inverter(int ratedVAR, double powerFactor, int DCinput){
        this.ratedVAR = ratedVAR;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
        this.ratedWatt =  (int)(( ratedVAR * powerFactor) / (1 - powerFactor));
    }

    /**
     * 
     * @param ratedVA
     * @param powerFactor
     * @param DCinput
     * @param bool
     */
    public Inverter(int ratedVA, double powerFactor, int DCinput, Boolean bool){
        this.ratedVA = ratedVA;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
        this.ratedWatt =  (int)( ratedVA * powerFactor);
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
    public double getPowerFactor() {
        return powerFactor;
    }

    /**
     * @return int return the DCinput
     */
    public int getDCinput() {
        return DCinput;
    }

    //TODO 1: Additional doucmentation needed for class and methods    
}
