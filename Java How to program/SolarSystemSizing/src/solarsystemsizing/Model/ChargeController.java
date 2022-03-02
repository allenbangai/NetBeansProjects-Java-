package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class ChargeController{
    int minInputCurrent;
    int maxInputCurrent;
    int maxInputVoltage;
    int ratedVoltage1;
    int ratedVoltage2;
    int ratedVoltage3;

    public ChargeController(int minInputCurrent, int maxInputCurrent, int maxInputVoltage, int ratedVoltage1) {
        this.minInputCurrent = minInputCurrent;
        this.maxInputCurrent = maxInputCurrent;
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage1 = ratedVoltage1;
    }

    public ChargeController(int minInputCurrent, int maxInputCurrent, int maxInputVoltage, int ratedVoltage1, int ratedVoltage2) {
        this.minInputCurrent = minInputCurrent;
        this.maxInputCurrent = maxInputCurrent;
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage1 = ratedVoltage1;
        this.ratedVoltage2 = ratedVoltage2;
    }

    public ChargeController(int minInputCurrent, int maxInputCurrent, int maxInputVoltage, int ratedVoltage1, int ratedVoltage2, int ratedVoltage3) {
        this.minInputCurrent = minInputCurrent;
        this.maxInputCurrent = maxInputCurrent;
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage1 = ratedVoltage1;
        this.ratedVoltage2 = ratedVoltage2;
        this.ratedVoltage3 = ratedVoltage3;
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

    public int getRatedVoltage1() {
        return ratedVoltage1;
    }

    public int getRatedVoltage2() {
        return ratedVoltage2;
    }

    public int getRatedVoltage3() {
        return ratedVoltage3;
    }
}
