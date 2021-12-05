/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

    //...getter methods for private variables of the class
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    //setter methods for private variables of the the class
    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
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
    
    
    /**
     * The following methods are for addition, subtraction, division, and multiplication of two rational numbers
     * 
     * ...Each rational number is an object and the returned computation is an abject......Hence, the each methods takes two objects and returns and object...
     * @param rational1
     * @param rational2
     * @return 
     */
    
    //...Method to add two rational number from tqo different instatiated object nd return the addition...
    public static Ex8_15_Rational add(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getNumerator();
        int newNum = rational1.getNumerator()*rational2.getDenominator() 
                + rational2.getNumerator()*rational1.getDenominator();
        
        return new Ex8_15_Rational(newNum, newDenum);
    }
    
    //...Method to subtract two rational number from tqo different instatiated object nd return the addition...
    public static Ex8_15_Rational subtraction(Ex8_15_Rational rational1, Ex8_15_Rational rational2){
        int newDenum = rational1.getDenominator() * rational2.getNumerator();
        int newNum = rational1.getNumerator()*rational2.getDenominator() 
                - rational2.getNumerator()*rational1.getDenominator();
        
        return new Ex8_15_Rational(newNum, newDenum);        
    }
}
