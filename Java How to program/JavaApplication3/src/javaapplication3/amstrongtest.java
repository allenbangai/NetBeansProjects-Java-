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
public class amstrongtest {
    public static void main(String[] args){
        Scanner allen, input = new Scanner(System.in);
        
        int num1, num2, num3, num4=0;
        int i, j=0, n, num5=1;
        num1=input.nextInt();
        num2=num3=num1;
        for(i=0; i>=0; i--){
            num1=num1/10;
            if(num1>0){
                i++;
            }
            else{
                continue;
            }
            num5++;
        }
        float k = 0, m;
        k=(float)num5;
        //number of digit is i
        System.out.println("number of digits is(are) :"+num5);
        while(j!=num5){
            n=num2%10;
            m=(float)n;
            num4 = num4 + (int)Math.pow(m, k);
            num2=num2/10;
            j++;            
        }
        System.out.println("num4 is :"+num4);
        if(num3==num4){
            System.out.println("Number enetered is an Amstrong, thanks for finding out an amstrong number");
        }
        else{
            System.out.println("Number entered is not an amstrong number");
        }
    }
}
