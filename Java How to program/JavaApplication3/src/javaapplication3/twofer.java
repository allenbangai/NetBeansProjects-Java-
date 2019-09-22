/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class twofer {
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        System.out.println("enter one if you wish to imput a name");
        int num1 = allen.nextInt();
        if(num1!=1){
            System.out.println("One for you, one for me");
            System.out.printf("num1 is :  %d",num1);
        }
        else{            
            String str1=allen.nextLine();
            /*
            my problem is that when it enter the else, it doesnt allow the user to enter a name
            */
            System.out.println("One for"+str1+", one for me");
        }
    }
    
}
