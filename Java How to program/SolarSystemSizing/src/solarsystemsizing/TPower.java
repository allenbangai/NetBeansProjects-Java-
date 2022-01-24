/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author DELL
 */

public class TPower {
    private int numOfLoad;
    private int powerOfLoad;

    /***
     * instantiates parameters for a load so the total number of load can be return from object
     * S.I.U of Load is Watt(W)
     * @param numOfLoad
     * @param powerOfLoad 
     */
    public TPower(int numOfLoad, int powerOfLoad) {
        this.numOfLoad = numOfLoad;
        this.powerOfLoad = powerOfLoad;
    }

    
    public int getNumOfLoad() {
        return numOfLoad;
    }

    /**
     * Set available number of load for a given load
     * @param numOfLoad 
     */
    public void setNumOfLoad(int numOfLoad) {
        this.numOfLoad = numOfLoad;
    }

    /**
     * return the power of particular load
     * @return 
     */
    public int getPowerOfLoad() {
        return powerOfLoad;
    }

    /**
     * Set the power of a given load in Watt
     * @param powerOfLoad 
     */
    public void setPowerOfLoad(int powerOfLoad) {
        this.powerOfLoad = powerOfLoad;
    }
    
    /**
     * implementation to return the total power (W) from the load of a single device and number of load available
     * @return 
     */
    public int getTPower(){
        return (numOfLoad * powerOfLoad);
    }
}
