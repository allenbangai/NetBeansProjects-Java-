/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8exercises;

/**
 *
 * @author DELL
 */
public class ComplexNumbers {
    float realNum;
    float imaginaryNum;

    public ComplexNumbers() {
        this.realNum = 0;
        this.imaginaryNum = 0;
    }

    public ComplexNumbers(float realNum, float imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    public float getRealNum() {
        return realNum;
    }

    public float getImaginaryNum() {
        return imaginaryNum;
    }
    
    public void add(ComplexNumbers complex1, ComplexNumbers complex2){
        this.realNum = complex1.realNum + complex2.realNum;
        this.imaginaryNum = complex1.imaginaryNum + complex2.imaginaryNum;
    }
    
    public void substract(ComplexNumbers complex1, ComplexNumbers complex2){
        this.realNum = complex1.realNum - complex2.realNum;
        this.imaginaryNum = complex1.imaginaryNum - complex2.imaginaryNum;        
    }
    
   public void printComplex(ComplexNumbers complex){
       System.out.println(Float.toString(complex.getRealNum()) + " + " + Float.toString(complex.imaginaryNum) + "j\n");
   }
   
   public void printComplex(){
       float real = realNum;
       float imaginary = imaginaryNum;
       System.out.println(Float.toString(real) + " + " + Float.toString(imaginary) + "j\n");
   }
   
   static ComplexNumbers complex1, complex2;
   public static void main(String[] args) {
        // TODO code application logic here
        //implementation of complex numbers class
        //print default complex number
        ComplexNumbers complex = new ComplexNumbers();
        complex.printComplex(); 
        
        //create two complex numbers
        complex1 = new ComplexNumbers(12, 6);
        complex2 = new ComplexNumbers(4, 5);
        
        //add the two complex numbers
        complex.add(complex1, complex2);
        complex.printComplex();
        
        //...substract the two cmoplex number
        complex.substract(complex1, complex2);
        complex.printComplex();        
    }
    
}
