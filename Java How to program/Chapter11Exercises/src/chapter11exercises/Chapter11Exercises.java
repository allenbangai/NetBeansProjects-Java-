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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to chapter 11");
        Scanner scanner = new Scanner(System.in);

        do{
            try{
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();
            }catch(InputMismatchException inputMismatchException){

            }catch(ArithmeticException arithmeticException){
                
            }
        }while(true);
    }
    
}
