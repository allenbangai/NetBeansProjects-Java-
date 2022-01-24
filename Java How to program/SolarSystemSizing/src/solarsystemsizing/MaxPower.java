/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author DELL
 */
public class MaxPower extends Tot{
    private int tPower;

    public MaxPower(int tPower) {
        this.tPower = tPower;
    }

    public int gettPower() {
        return tPower;
    }

    public void settPower(int tPower) {
        this.tPower = tPower;
    }
    
}
