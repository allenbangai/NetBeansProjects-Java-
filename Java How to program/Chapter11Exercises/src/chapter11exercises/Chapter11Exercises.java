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
                new UsingExceptions(); 
                try {
                    UsingExceptions.throwException();                    
                } catch (Exception e) {
                    System.err.println("Exception handled in main");
                }              
                try {
                    UsingExceptions.doesNotThrowException();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3:{
                try {
                    new UsingExceptions();
                    UsingExceptions.method1();
                } catch (Exception e) {
                    System.err.printf("%s%n%n", e.getMessage());
                    e.printStackTrace();

                    // obtain the stack-trace information
                    StackTraceElement[] traceElements = e.getStackTrace();

                    System.out.printf("%nStack trace from getStackTrace:%n");
                    System.out.println("Class\t\tFile\t\t\tLine\tMethod");

                    // loop through traceElements to get exception description
                    for(StackTraceElement element: traceElements){
                        System.out.println("element.getClassName(): "+ element.getClassName());
                        System.out.println("element.getFileName(): "+ element.getFileName());
                        System.out.println("element.getLineNumber(): "+ element.getLineNumber());
                        System.out.println("element.getMethodName(): "+ element.getMethodName());
                    }
                }
                break;
            }
            case 4:{
                try {
                    new UsingChainExceptions();
                    UsingChainExceptions.method1();                    
                } catch (Exception e) { // exceptions thrown from method1
                    e.printStackTrace();
                }
                break;
            }
            case 5:{
                System.out.print("Enter a number between 0 and 10: ");
                int number = scanner.nextInt();

                // assert that the value is >= 0 and <= 10
                assert(number >0 && number <= 10) : "bad number "+ number;
                System.out.printf("You entered %d%n", number);
                break;
            }
        }
    }
    
}
