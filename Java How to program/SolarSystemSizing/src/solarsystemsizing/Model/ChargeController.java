package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class ChargeController{
    int minInputCurrent;
    int maxInputCurrent;
    int maxInputVoltage;
    int ratedVoltage;

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
}