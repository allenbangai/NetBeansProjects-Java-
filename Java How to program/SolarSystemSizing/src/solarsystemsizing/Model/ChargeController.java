package solarsystemsizing.Model;

/**
 * This class ChargeController describes the characteristics of a Solar Charge Controller.
 * This characteristics describes the behavior of a charge controller an the way they 
 * behave. This characteristics are the input voltage, min an max current with the output
 * rate voltage.
 * @author Kamadje Allen
 */
public class ChargeController{
    private int minInputCurrent;
    private int maxInputCurrent;
    private int maxInputVoltage;
    private int ratedVoltage;

    /**
     * 
     * @param minInputCurrent
     * @param maxInputCurrent
     * @param maxInputVoltage
     * @param ratedVoltage
     */
    public ChargeController(int minInputCurrent, int maxInputCurrent, int maxInputVoltage, int ratedVoltage) {
        this.minInputCurrent = minInputCurrent;
        this.maxInputCurrent = maxInputCurrent;
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage = ratedVoltage;
    }

    public int getMinInputCurrent() {
        return minInputCurrent;
    }

    public int getMaxInputCurrent() {
        return maxInputCurrent;
    }

    public int getMaxInputVoltage() {
        return maxInputVoltage;
    }

    public int getRatedVoltage() {
        return ratedVoltage;
    }
    //TODO 2: Document code
}