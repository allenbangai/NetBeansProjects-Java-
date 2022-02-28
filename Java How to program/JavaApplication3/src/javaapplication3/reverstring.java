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
public class reverstring {
    public static void main(String[] args){
        System.out.println("Please enter the statement you wish to reverse");
        Scanner allen = new Scanner(System.in);
        String str1, str2, str3;
        str1=allen.nextLine();
        
        /* 
        THE easiest way to reverse a given string is to use reverse() method of java class.
        reverse method returns the StringBuffer object so we need to cast it back to String using 
        toString() method of StringBuffer
        */
        str1 = new StringBuffer(str1).reverse().toString();
        
        System.out.println("The reverse of the statement above is :");
        System.out.println(str1);
    }
    
}
