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

    public void setNumOfLoad(int numOfLoad) {
        this.numOfLoad = numOfLoad;
    }

    public int getPowerOfLoad() {
        return powerOfLoad;
    }

    public void setPowerOfLoad(int powerOfLoad) {
        this.powerOfLoad = powerOfLoad;
    }
}
