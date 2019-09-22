/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercises;
import java.util.*;
/**
 *
 * @author DELL
 */


public class exercise003 {
    float factorial(float fac){
        while(fac >= 1){
            int num1 = 1;
            for(int i=1; i<=fac; i++){
                num1 = num1 * i;                
                System.out.println("the factorial of "+i+" is "+num1);
            }
            System.out.println("\n\n");
            fac--;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        exercise003 bangai = new exercise003();
        float num3 = allen.nextFloat();
        float factorial = bangai.factorial(num3);
    }
}
