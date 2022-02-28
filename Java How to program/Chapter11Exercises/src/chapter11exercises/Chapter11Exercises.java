/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter11exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Kamadje Allen
 */
public class Chapter11Exercises {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean loop;
    static UsingExceptions exceptions = new UsingExceptions();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to chapter 11");
        System.out.println("In this chapter, there are a set of exercises, make\n"+
        "a choice to view the implementation on any of the exercises or examples in this chapter");
        System.out.println("Enter the implementatio of your choice: ");
        int choice = scanner.nextInt();       
        
        switch(choice){
            case 1:{
                do{
                    try{
                        System.out.println("Please enter an integer numerator");
                        int numerator = scanner.nextInt();
                        System.out.println("Please enter an integer denominator");
                        int denominator = scanner.nextInt();
                        new Division();
                        int result = Division.quotient(numerator, denominator);
                        System.out.println("Result of "+numerator+"/"+denominator+" = "+ result);
                        loop = false;
                    }catch(InputMismatchException inputMismatchException){
                        loop = true;
                        System.err.printf("%nException: %s%n", inputMismatchException);
                        scanner.nextLine();
                        System.out.println("You must enter integers. Please try again.");
                    }catch(ArithmeticException arithmeticException){
                        loop = true;
                        System.err.printf("%nException: %s%n", arithmeticException);
                        System.out.println("Zero is an invalid denominator. Please try again");
                    }
                }while(loop);
                break;
            }
            case 2:{
                try {
                    exceptions.throwException();                    
                } catch (Exception e) {
                    System.err.println("Exception handled in main");
                }  
                new UsingExceptions();              
                try {
                    UsingExceptions.doesNotThrowException();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
            }
            case 3:{
                break;
            }
            case 4:{
                break;
            }
            case 5:{
                break;
            }
        }
    }
    
}
