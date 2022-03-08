package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Battery {
    private int voltage;
    private int ampereHour;

    /**
     * 
     * @param voltage
     * @param ampereHour
     */
    public Battery(int voltage, int ampereHour) {
        this.voltage = voltage;
        this.ampereHour = ampereHour;
    }

    /**
     * 
     * @return
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * 
     * @return
     */
    public int getAmpereHour() {
        return ampereHour;
    }
    
    /**
     * 
     * @return
     */
    public int getEnergy(){
        return voltage * ampereHour;
    }

    //TODO 4: Document code in this class
}
