package solarsystemsizing.Sizing;

/**
 * 
 * @since 1.0
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class ChargeControllerSizing {
    private InverterSizing inverterSizing;
    private int stmDCVoltage;
    public ChargeControllerSizing(){

    }

    public ChargeControllerSizing(InverterSizing inverterSizing, int stmDCVoltage) {
        this.inverterSizing = inverterSizing;
        this.stmDCVoltage = stmDCVoltage;
    }

    public InverterSizing getInverterSizing() {
        return this.inverterSizing;
    }

    public int getStmDCVoltage() {
        return this.stmDCVoltage;
    }

    @Override
    public String toString() {
        return "\n{" +
            "\n inverterSizing= '" + getInverterSizing() +
            "',\n stmDCVoltage= '" + getStmDCVoltage() +
            "'}";
    }

}
