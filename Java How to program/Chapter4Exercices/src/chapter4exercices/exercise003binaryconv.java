/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4exercices;
import java.util.Scanner;
import java.lang.Math;
/**
 *        

 * @author DELL
 */
public class exercise003binaryconv {
    //public static int powerof2(int p, int q);
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        
        float i=0;
        int num1, num2, num3, num4=0;
        num1=allen.nextInt();
        num2=num3=num1;
        
        while(num2>0){
            num2=num2/10;
            i++;
        }
        System.out.println("number of digit are :"+i);
        float j=0;
        int n, m;
        while(j!=i){
            n = num3%10;
            num4 = (int) (num4 + Math.pow(2.0, j));
            num3 = num3/10;
            j++;            
        }
        System.out.printf("The decimal value of %d is %d thanks\n", num1, num4);
    }
}
