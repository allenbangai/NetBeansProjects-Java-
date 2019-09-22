/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8exercises;
import java.math.BigDecimal;
import java.text.NumberFormat;
/**
 *
 * @author DELL
 */
public class Interest {
    
    public static void main(String args[]){
        //initial decimal amount before interst
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);//interest rate
        
        //display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        //calculate the amount of deposit of each of the ten years...
        for(int year = 1; year<=10; year++){
            //calculate new amount for specified year
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            
            //Display the year and the amount
            System.out.printf("%4d%20s%n", year,NumberFormat.getCurrencyInstance().format(amount));
            
        }
    }//end class
    
}
