/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercises;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class exercise002 {
    public static void main(String[] args){
	Scanner allen = new Scanner(System.in);
	int num1 = allen.nextInt();
	int[] num2 = new int[num1];

	for(int i=0; i<num1; i++){
        	num2[i] = allen.nextInt();
		//num1=num2[0];
	}
	int j=0;
	int num3=0;
	int k=0;
	while(num3<num1){
            if(num2[j]<=num2[k]){
                k++;
                num3++;
            }
            else if(k==num1){
                break;
            }
            else{
                j++;
                k=0;
            }
	}
        System.out.println("the smallest number that you inputed is "+num2[j]);
    }
}
