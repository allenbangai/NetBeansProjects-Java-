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
     * This constructor represents the charateristics that the objects of the class 
     * will have when instantiated 
     * @param minInputCurrent
     * The minimum possible current the charge controller can take in other to function
     * properly. This current is entered in Ampere (A).
     * @param maxInputCurrent
     * The maximum possible curent the charge controller can take in other to function 
     * properly. This current is entered in Ampere (A).
     * @param maxInputVoltage
     * The maximum input voltge is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param ratedVoltage
     * This is the output rated voltage released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     */
    public ChargeController(int minInputCurrent, int maxInputCurrent, int maxInputVoltage, int ratedVoltage) {
        this.minInputCurrent = minInputCurrent;
        this.maxInputCurrent = maxInputCurrent;
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage = ratedVoltage;
    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #minInputCurrent} in DC.
     */
    public int getMinInputCurrent() {
        return minInputCurrent;
    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #maxInputCurrent} in DC.
     */
    public int getMaxInputCurrent() {
        return maxInputCurrent;
    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #maxInputVoltage} in DC which the
     * total solar panel open circuit conection wll supply.
     */
    public int getMaxInputVoltage() {
        return maxInputVoltage;
    }

    /**
     * 
     * This is the output rated voltage released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. 
     * @return
     * This method returns the output {@link #ratedVoltage} that the charge controller supplies to or 
     * rerceives from the batery.
     */
    public int getRatedVoltage() {
        return ratedVoltage;
    }
}