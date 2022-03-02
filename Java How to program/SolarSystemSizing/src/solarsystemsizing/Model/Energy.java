/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Model;

/**
 * Energy stands for Total Energy
 * @author Kamadje Allen
 */
public class Energy extends Power{
    private int numOfHours;//hours of utilization of load per day

    /**
     * instantiate parameters for a load from class Tpower
     * instantiate parameters for total hours of use of load per day in Hours (H)
     * S.I.U of hours is H
     * @param numOfHours
     * @param numOfLoad
     * @param powerOfLoad 
     */
    public Energy(int numOfHours, int numOfLoad, int powerOfLoad) {
        super(numOfLoad, powerOfLoad);
        this.numOfHours = numOfHours;
    }

    /**
     * return the total number of hours the load is used per day
     * @return 
     */
    public int getNumOfHours() {
        return numOfHours;
    }
    
    /**
     * set the total number of hours of load per day in H
     * @param numOfHours 
     */
    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }
    
    /**
     * return the total energy consumed by a particular load in a day
     * @return 
     */
    public int getEnergy(){
        return (super.getPower() * getNumOfHours());
    }
    
}
