
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
                testEmployeePay();
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
    
    private static void testEmployeePay(){
        // create subclass objects 
        SalariedEmployees salariedEmployee = new SalariedEmployees(800.00, "John", "Smith", "111-11-1111"); 
        HourlyEmployee hourlyEmployee = new HourlyEmployee(16.75, 40, "Karen", "Price", "222-22-2222");
        CommissionEmployee commissionEmployee = new CommissionEmployee(10000, .06, "Sue", "Jones", "333-33-3333"); 
        Base_CommissionEmployee baseCommissionEmployee = new Base_CommissionEmployee( 
          5000, .04, 300, "Bob", "Lewis", "444-44-4444");

        //create four element employee array
        Employee[] employees = new Employee[4];
        //initialize the four element employee array
        employees[1] = salariedEmployee;
        employees[2] = hourlyEmployee;
        employees[3] = commissionEmployee;
        employees[4] = baseCommissionEmployee;
        
        System.out.println("Employees process polymorphycally \n");
        
        //for each for processing every element in the employees array
        for (Employee employee : employees) {
            //invoke toString method of employee 
            System.out.println(employee);
            
            //determine if element is a base_commission employee
            if(employee instanceof Base_CommissionEmployee){
                Base_CommissionEmployee bce = (Base_CommissionEmployee) employee;
                bce .setBaseSalary(1.5 * bce.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", bce.getBaseSalary());
            }// ...end if...
            
            System.out.printf("earned $%,.2f%n%n", employee.earnings());
        }// ...end for...
        
    }
    
}
