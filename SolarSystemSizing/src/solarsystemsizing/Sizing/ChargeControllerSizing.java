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

    public void setInverterSizing(InverterSizing inverterSizing) {
        this.inverterSizing = inverterSizing;
    }

    public int getStmDCVoltage() {
        return this.stmDCVoltage;
    }

    public void setStmDCVoltage(int stmDCVoltage) {
        this.stmDCVoltage = stmDCVoltage;
    }

    public ChargeControllerSizing inverterSizing(InverterSizing inverterSizing) {
        setInverterSizing(inverterSizing);
        return this;
    }

    public ChargeControllerSizing stmDCVoltage(int stmDCVoltage) {
        setStmDCVoltage(stmDCVoltage);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ChargeControllerSizing)) {
            return false;
        }
        ChargeControllerSizing chargeControllerSizing = (ChargeControllerSizing) o;
        return Objects.equals(inverterSizing, chargeControllerSizing.inverterSizing) && stmDCVoltage == chargeControllerSizing.stmDCVoltage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inverterSizing, stmDCVoltage);
    }

    @Override
    public String toString() {
        return "{" +
            " inverterSizing='" + getInverterSizing() + "'" +
            ", stmDCVoltage='" + getStmDCVoltage() + "'" +
            "}";
    }

}
