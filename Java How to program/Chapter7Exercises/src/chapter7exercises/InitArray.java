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
public class InitArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int array_length = 10;
        int[] array = new int[array_length];
                
        //calc the value of each array element
        for(int i=0; i<array.length; i++){
            array[i] = 2 + 2*i;
        }
        //column of heading
        System.out.printf("%s%8s%n","Index","Value");
        for(int j=0; j<array.length; j++){
            System.out.printf("%5d%8d%n",j,array[j]);
        }
    }
    
}
