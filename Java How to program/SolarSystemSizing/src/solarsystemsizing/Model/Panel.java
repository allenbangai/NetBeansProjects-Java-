package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Panel {
    private int power;
    private int voltage;
    private int nominalVoltage;

    public Panel(int power, int voltage, int nominalVoltage) {
        this.power = power;
        this.voltage = voltage;
        this.nominalVoltage = nominalVoltage;
    }

    public int getPower() {
        return power;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getNominalVoltage() {
        return nominalVoltage;
    }

    //TODO 4: Document code in this class Panel.java
}