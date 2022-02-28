/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7exercises;

/**
 *
 * @author DELL
 */
public class InitArray2 {
    public static void main(String[] args){
        int[][] array1 = {{1,2,3,4}, {5,6,7,8}};
        int[][] array2 = {{1,2,3,}, {4}, {5,6}, {7,8}};
        
        System.out.println("Values in array1 by row are");
        outputArray(array1);
        System.out.println();
        System.out.println("Values of array2 by row are ");
        outputArray(array2);//display array2 by row
        
    }

    private static void outputArray(int[][] array) {
        for(int row=0; row<array.length; row++){
            //loop through columns for current row
            for(int column=0; column<array[row].length; column++){
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}//ens class InitArray2
