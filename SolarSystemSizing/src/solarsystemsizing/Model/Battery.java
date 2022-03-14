package solarsystemsizing.Model;

/**
 * This class Battery.java describes the characteristics of a battery used in sizing 
 * solar systems... As we all know, a battery both has the Energy it stores in Ampere hour
 * (Ah) and the voltage at which it is either charged or discharged measured in volts (VDC).
 * This characteristics are used to describe an object of a battery so we could this class to 
 * describe different types of objects of batteries. This characteristics are {@link #voltage} 
 * and {@link #ampereHour}.
 * @author Kamadje Allen
 */
public class Battery {
    private int voltage;
    private int ampereHour;

    /**
     * This constructor descibes the only possible object that can be instantiated from the 
     * class Battery and takes bothe the {@link #voltage} and {@link #ampereHour}.
     * @param voltage
     * The {@link #voltage} parameter here is entered in volts (VDC) and cannot be zerro.
     * @param ampereHour
     * The {@link #ampereHour} parameter here is entered in ampere hour (AH) and value cannot be 
     * zero but must be and interger
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
