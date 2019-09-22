/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7exercises;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author DELL
 */
public class StudentPoll {
    public static void main(String[] args){
        // student response array (more typically, input at runtime)
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 1, 2, 3, 3, 2, 14 };
        int[] frequency = new int[6];
        
        for(int i=1; i<responses.length; i++){
            try{
                ++frequency[responses[i]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" response[%d] = %d%n%n", i, frequency[i]);
            }
        }
        
        System.out.printf("%s%10s%n","Rating","Frequency");
        for(int j=1; j<frequency.length; j++){
            System.out.printf("%5d%10d%n%n",j,frequency[j]);
        }
    }
    
}
