/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4exercices;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class exercise001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner allen = new Scanner(System.in);
        System.out.printf("enter the size of your square \n");
        int size=allen.nextInt();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                 System.out.print("*");
            }
            System.out.printf("\n");
        }
        
    }
    
}
