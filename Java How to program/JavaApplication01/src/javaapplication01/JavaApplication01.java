/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class JavaApplication01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner floating = new Scanner(System.in);
        Scanner integer = new Scanner(System.in);
        
        System.out.println("enter the number of real numbers you which to enter");
        int NumOfRealNum = integer.nextInt();
        
        System.out.println("Enter your real numbers");
        float[] RealNum = new float[NumOfRealNum];
        for(int i=0; i<NumOfRealNum; i++){
            RealNum[i] = floating.nextFloat();
        }
        
        int[] m = new int[NumOfRealNum], n = new int[NumOfRealNum];
        //Arrays.fill(m,0);
        for(int l=0; l<NumOfRealNum; l++){
            RealNum[l] = n[l];
        }
        for(int j=0; j<NumOfRealNum; j++){
            for(int k=0; k<NumOfRealNum; k++){
                if(RealNum[j]>n[k]){
                    m[j]++;
                }
            }
            System.out.printf(j+"   "+m[j]+"\n");
        }
    }
    
}
