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
}
