/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 *Write an app that reads an interger communicating if the number
 *is negative or +ve and visualize on separate Lines its numbers from
 *the least significant to the most
 */
package chapter5exercises;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        
        //promt user to enter number
        int num1 = allen.nextInt();
         
        //condition to check wether number is positive or negative
        int num2=num1, num3, num4, num5;
        if(num1>=0){
            System.out.println("the number entered is positive"+num1);
        }
        else{
            System.out.println("the number entered is negative"+num1);
        }
        int j=1;
        //visualize on seperate ligne it number from least to most ignificant bit
        //first write an algorithm that calculate the number of digit that they are
        for(int i=0; i>=0; i--){
            num1=num1/10;
            if(num1>0){
                i++;                
            }
            else{
                continue;
            }
            j++;
        }   
        System.out.println("number of digit is : "+j);
        
        System.out.println("You can visualize the digits from least significant to most significant");
        //now that you can determine the number of digit, you can now write another algorithm 
        //to dislpay each digit from most significant bit to significant bit
        for(int k=0; k<j; k++){
            num3=num2;//creating another variable with the number u entered
            num4 = num2%10;//having the least significant bit of the digit you are dividing
            System.out.println(num4);//printing the least significant bit
            num2 = num2/10;//eleminating the most significant bit to creat a new most significant bit                       
        }
    }    
}
