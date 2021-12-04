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
    
   public String printComplex(ComplexNumbers complex){
       return Float.toString(complex.getRealNum()) + " j" + Float.toString(complex);
   }
    
    
}
