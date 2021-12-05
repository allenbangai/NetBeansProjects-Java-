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

    public Ex8_15_Rational() {
        numerator = 1;
        denominator = 2;
    }

    public Ex8_15_Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int getNumerator() {
        return numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    private void simplifyRational(int numerator, int denominator){
        //for loop for simplifying rational number to it simplest form
        int i;
        for(i = 2; i <= numerator; i++){
            if((numerator%i) == 0 && (denominator%i) == 0){
                numerator = numerator/i;
                denominator = denominator/i;
                i = 1;
            }
        }
        
        seNumerator
        
        
        int[] rationalNum = {2, 3};
    }
}
