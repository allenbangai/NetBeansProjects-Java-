/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author DELL
 */
public class MaxPower extends Total{
    private int tPower;
    private int thours;

    public MaxPower(int tPower, int thours) {
        this.tPower = tPower;
        this.thours = thours;
    }

    /**
     * return a total same number of hours of autonomy for all loads in the local
     * meaning all the loads will have the same number of autonomy
     * @return 
     */
    public int getThours() {
        return thours;
    }

    public void setThours(int thours) {
        this.thours = thours;
    }
    
    public int gettPower() {
        return tPower;
    }

    public void settPower(int tPower) {
        this.tPower = tPower;
    }

    @Override
    public double total() {
        return super.getVal() * gettPower() * getThours();
    }
    
}
