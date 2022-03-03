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
     * This constructor discribes an object of the class inverter with rated output
     * parameters giving as Reactive Power which account for the reactive power 
     * consume by the load which the inverter will supply, denoted as VAR and the Power 
     * Factor of the inverter with no SI unit.
     * @param ratedVAR
     * The ratedVAR symbolises the reactive power of the inverter and the value inputed 
     * should be in VAR and not KVAR or any other type.
     * @param powerFactor
     * The power factor gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput
     * The DCinput symbolises the DC input voltage of the inverter and inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     */
    public Inverter(int ratedVAR, double powerFactor, int DCinput){
        this.ratedVAR = ratedVAR;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
        this.ratedWatt =  (int)(( ratedVAR * powerFactor) / (1 - powerFactor));
    }

    /**
     * This constructor discribes an object of the class inverter with rated output
     * parameters giving as Apparent Power of inverter denoted as VA and the Power Factor
     * of the inverter with no SI unit.
     * @param ratedVA
     * The ratedVA symbolises the apparent power of the inverter and the value inputed 
     * should be in VA and not KVA or any other one.
     * @param powerFactor
     * The power factor gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput
     * The DCinput symbolises the DC input voltage of the inverter and inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @param bool
     * This boolean value is redundant and is used by the program to characterise this 
     * particular constructor. The value inputed must be @true or the program won't consider
     * this constructor instantiation.
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
