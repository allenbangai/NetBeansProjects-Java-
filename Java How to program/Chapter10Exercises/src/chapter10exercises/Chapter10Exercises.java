
import chapter10exercises.*;

import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Chapter10Exercises {

    private static Scanner value = new Scanner(System.in);
    private static int val;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Select 1 for PolymorphysmTest");
        val = value.nextInt();
        switch (val) {
            case 1:{
                
                break;
            }
                
            case 2:{

                break;
            }

            case 3:{

                
                break;
            }
            
            case 4:
                
                break;
            default:
                break;
        }
        System.out.println("className.methodName()");
        System.err.println("How you doing today");
    }
    
    private void TestEmployeePay(){
        // create subclass objects 
        SalariedEmployees salariedEmployee = new SalariedEmployees(800.00, "John", "Smith", "111-11-1111"); 
        HourlyEmployee hourlyEmployee = new HourlyEmployee(16.75, 40, "Karen", "Price", "222-22-2222");
        CommissionEmployee commissionEmployee = new CommissionEmployee(10000, .06, "Sue", "Jones", "333-33-3333"); 
        Base_CommissionEmployee basePlusCommissionEmployee = new Base_CommissionEmployee( 
          5000, .04, 300, "Bob", "Lewis", "444-44-4444");

    }
    
}
