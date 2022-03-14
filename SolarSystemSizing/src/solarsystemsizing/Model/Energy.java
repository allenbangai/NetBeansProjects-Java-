package solarsystemsizing.Model;

/**
 * Energy stands for Total Energy
 * @author Kamadje Allen
 */
public class Energy extends Power{
    private int numOfHours;//hours of utilization of load per day

    /**
     * Instantiate parameters for a load from class Tpower.
     * Instantiate parameters for total hours of use of load per day in Hours (H).
     * S.I.U of hours is H.
     * @param numOfHours
     * @param numOfLoad
     * @param powerOfLoad 
     */
    public Energy(int numOfHours, int numOfLoad, int powerOfLoad) {
        super(numOfLoad, powerOfLoad);
        this.numOfHours = numOfHours;
    }

    /**
     * @return 
     * Return the total number of hours the load is used per day
     */
    public int getNumOfHours() {
        return numOfHours;
    }
    
    /**
     * @param numOfHours 
     * Set the total number of hours of load per day in H
     */
    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }
    
    /**
     * @return 
     * Return the total energy consumed by a particular load in a day
     */
    public int getEnergy(){
        return (super.getPower() * getNumOfHours());
    }
    
}
