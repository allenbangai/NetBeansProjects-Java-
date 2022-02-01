/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solarsystemsizing;

import java.util.ArrayList;
import java.lang.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SolarSizing {
    static int sizingType;
    //method for declaring scanner
    static Scanner ssScanner; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Total total;
        System.out.println("Enter value for sizing type");
        ssScanner = new Scanner(System.in);
        sizingType = ssScanner.nextInt();
        switch(sizingType){
            case 1:
                System.out.println("Here, you will have the sizing "
                        + "of your system from the total energy of the system inputed");
                break;
            case 2:
                System.out.println("Here, you will have the sizing of your system"
                        + " from the total power of the system and the total time of autonomy of all device inputed");
                System.out.println("round1 " + Math.round(2.7));
                System.out.println("round2 " + Math.round(2.3));
                System.out.println("round3 " + Math.round(2.5));
                break;
            case 3:
                System.out.println("Here, you will have the sizing of your system from the total individual"
                        + " power, number of loads and hours of autonomu for each device of the system inputed");
                total = new TEnergy(4000);
                break;
            case 4:
                System.out.println("here, you will have the sizing of your system"
                        + " from the total individual power and number of load for each device of the system inputed");
                total = new TPower(2000, 4);
                
                break;
        }
    }
    
}
