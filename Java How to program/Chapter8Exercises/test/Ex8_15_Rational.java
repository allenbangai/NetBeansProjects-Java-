/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.Integer;
/**
 *
 * @author DELL
 */
public class Ex8_15_Rational {
    private int numerator;
    private int denominator;

    //...empty contructor with default parameters...
    public Ex8_15_Rational() {
        simplifyRational(1, 2);
    }

    public Ex8_15_Rational(int numerator, int denominator) {
        simplifyRational(numerator, denominator);
    }
    
    //setter methods for private variables of the the class
    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //...getter methods for private variables of the class
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    private void simplifyRational(int numerator, int denominator){
        //...for loop for simplifying rational number to it simplest form...
        int i;
        for(i = 2; i <= numerator; i++){
            if((numerator%i) == 0 && (denominator%i) == 0){
                numerator = numerator/i;
                denominator = denominator/i;
                i = 1;
            }
        }
        
        /*...setting the simplifies values using the setters methods of the class 
         so they can be called in their simplifies form by theor getter methods...*/
        setNumerator(numerator);
        setDenominator(denominator);        
    }
    
    //...method to return fration or ratio value of rational number in string format...
    public static String printfr(Ex8_15_Rational rational){
        return Integer.toString(rational.getNumerator()) + "/" + Integer.toString(rational.getDenominator());
    }
    
    //...method to return decimal value of rational number in string format...
    public static String printfl(Ex8_15_Rational rational){
        //converting integer to string by typecasting
        float value1 = rational.getNumerator();
        float value2 = rational.getDenominator();
        
        return Float.toString(value1/value2);
    } 
    
    //print any data to console
    public static void println(String data){
        System.out.println(data);
    }
    
    /**
     * The following methods are for addition, subtraction, division, and multiplication of two rational numbers
     * 
     * ...Each rational number is an object and the returned computation is an abject......Hence, the each methods takes two objects and returns and object...
     * @param rational1
     * @param rational2
     * @return 
     */
    
    //...Method to add two rational number from tqo different instatiated object and return the addition...
    public static Ex8_15_Rational add(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getDenominator();
        int newNum = rational1.getNumerator()*rational2.getDenominator() 
                + rational2.getNumerator()*rational1.getDenominator();
        
        return new Ex8_15_Rational(newNum, newDenum);
    }
    
    //...Method to subtract two rational number from tqo different instatiated object and return the subtaction...
    public static Ex8_15_Rational subtract(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getDenominator();
        int newNum = rational1.getNumerator()*rational2.getDenominator() 
                - rational2.getNumerator()*rational1.getDenominator();
        
        return new Ex8_15_Rational(newNum, newDenum);        
    }
    
    //...Method to multiply two rational number from tqo different instatiated object and return the multiplication...
    public static Ex8_15_Rational product(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getDenominator();
        int newNum = rational1.getNumerator() * rational2.getNumerator();
        
        //...return product
        return new Ex8_15_Rational(newNum, newDenum);        
    }
    
    //...Method to devide two rational number from tqo different instatiated object and return the multiplication...
    public static Ex8_15_Rational quotient(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getNumerator();
        int newNum = rational1.getNumerator() * rational2.getDenominator();
        
        //...return quotient
        return new Ex8_15_Rational(newNum, newDenum);      
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        println(printfr(new Ex8_15_Rational(2, 4)) + " " + printfl(new Ex8_15_Rational(2, 4)));
        
        //...addition...
        println("fraction value " + printfr(add(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7)) )
            + " decimal value " + printfl(add(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7))));
        
        //...substraction...
        println("fraction value " + printfr(subtract(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7)) )
            + " decimal value " + printfl(subtract(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7))));
        
        //...multiplication...
        println("fraction value " + printfr(product(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7)) )
            + " decimal value " + printfl(product(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7))));
        
        //...division...
        println("fraction value " + printfr(quotient(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7)) )
            + " decimal value " + printfl(quotient(new Ex8_15_Rational(2, 4), new Ex8_15_Rational(5, 7))));
    }
}
