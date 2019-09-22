/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4exercices;
import java.util.Scanner;
/**PALINDROME
 *
 * @author DELL
 */
public class exercise002 {
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        int num1, num2, num3=0, n;
        System.out.print("enter the number to check if it palindrome\n");
        num1=allen.nextInt();
        num2=num1;
        
        while(num1>0){
            n=num1%10;
            System.out.println("n :"+n);
            num3 = num3*10 + n;
            System.out.println("num3 :"+num3);
            num1=num1/10;            
            System.out.println("num1 :"+num1);
        }        
        System.out.println("num2 is :"+num2);
        System.out.println("num3 is :"+num3);
        if(num3==num2){
            System.out.print("number entered is a Palindrome\n");
        }
        else{
            System.out.print("number entered is not a palindrom a Palindrome\n");
        }
    }
}
