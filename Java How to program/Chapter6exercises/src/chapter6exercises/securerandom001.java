/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6exercises;
import java.security.SecureRandom;
/**
 *
 * @author DELL
 */
public class securerandom001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //securerandom001 object will produce secure random numbers
       SecureRandom allen = new SecureRandom();
       
       //loop 20 times
       for(int i=1; i<=20; i++){
           //pick random integer from 1 to 6
           int face = 1 + allen.nextInt(6);
           System.out.printf("%d", face);
           //if counter is divisible by 5, start a new line
           if(i%5==0){
               System.out.println();
           }
       }
    }
    
}//end class

