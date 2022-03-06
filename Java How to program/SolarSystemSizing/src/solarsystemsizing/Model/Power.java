package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Power {
    private int numOfLoad;
    private int powerOfLoad;

    /***
     * Instantiates parameters for a load so the total number of load can be return from object
     * S.I.U of Load is Watt(W).
     * @param numOfLoad
     * @param powerOfLoad 
     */
    public Power(int numOfLoad, int powerOfLoad) {
        this.numOfLoad = numOfLoad;
        this.powerOfLoad = powerOfLoad;
    }

    /**
     * @return 
     * Return the available number of load.
     */
    public int getNumOfLoad() {
        return numOfLoad;
    }

    /**
     * @param numOfLoad 
     * Set available number of load for a given load.
     */
    public void setNumOfLoad(int numOfLoad) {
        this.numOfLoad = numOfLoad;
    }

    /**
     * @return 
     * Return the power of particular load.
     */
    public int getPowerOfLoad() {
        return powerOfLoad;
    }

    /**
     * @param powerOfLoad 
     * Set the power of a given load in Watt.
     */
    public void setPowerOfLoad(int powerOfLoad) {
        this.powerOfLoad = powerOfLoad;
    }
    
    /**
     * @return 
     * Implementation to return the total power (W) from the load of a single device 
     * and number of load available.
     */
    public int getPower(){
        return (numOfLoad * powerOfLoad);
    }
}
