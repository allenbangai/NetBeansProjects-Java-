/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4exercices;
import java.util.Scanner;
/**
A person invests $1,000 in a savings account yielding 5% interest. Assuming that all
the interest is left on deposit, calculate and print the amount of money in the account
at the end of each year for 10 years. Use the following formula to determine the
amounts:
a = p (1 + r)n
where
p is the original amount invested (i.e., the principal)
r is the annual interest rate (e.g., use 0.05 for 5%)
n is the number of years
a is the amount on deposit at the end of the nth year.  
* 
* @author DELL
*/
public class compoundinterest {
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        System.out.println("Enter the amount invested");
        double p = allen.nextDouble();
        double a;
        double r=0.05, n;
        System.out.println("Enter the number of years of deposit :");
        n = allen.nextDouble();
        System.out.println("the amount of deposite at the end of nth years is :");
        
        System.out.println("year(s)           amount deposit");
        for(int i=0; i<=(int)n; i++){
             a = p*Math.pow(1+r, i);
             System.out.println(i+"     "+a);
        }        
    }
}
