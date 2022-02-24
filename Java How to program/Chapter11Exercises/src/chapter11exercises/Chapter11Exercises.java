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
        do{
            try{
                loop = false;
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();
                new Division();
                int result = Division.quotient(numerator, denominator);
                System.out.println("Result of "+numerator+"/"+denominator+" = "+ result);
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
    }
    
}
