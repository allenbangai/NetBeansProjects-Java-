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
     * This give the rated output Real Power or to say the power in Watt.
     * It is usually denoted in KW but here, the return power is in W.
     */
    public int getRatedWatt() {
        return ratedWatt;
    }

    /**
     * @return int return the ratedVAR
     * This give the rated output Reactive power of the inverter.
     * It is usually denoted in KVAR but here, the value is in VAR.
     */
    public int getRatedVAR() {
        return ratedVAR;
    }

    /**
     * @return int return the ratedVA
     * This give the rated output Apparent power of the inverter.
     * It is usually denoted in KVA but here, the value is in VA.
     */
    public int getRatedVA() {
        return ratedVA;
    }

    /**
     * @return int return the powerFactor
     * The inverter being a AC appliance has a power factor.
     * This power factor give the amount of reactive to real power consumed.
     * It doesn't have any unit and must be less than one.
     */
    public double getPowerFactor() {
        return powerFactor;
    }

    /**
     * @return int return the DCinput
     * The DC input is takes in a particular input rated voltage in VDC.
     * The DC input is in volt.
     */
    public int getDCinput() {
        return DCinput;
    }

    //TODO 1: Additional doucmentation needed for class and methods    
}
