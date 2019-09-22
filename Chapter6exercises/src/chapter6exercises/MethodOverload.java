/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6exercises;

/**
 *
 * @author DELL
 */
public class MethodOverload {
    public static void main(String[] args){
        //test overload squre methods
        System.out.println("Square of integer 7 is"+square(7));
        System.out.println();
        System.out.println("Square of integer 7.5 is"+square(7.5));
        
    }
    public static int square(int intvalue){
        System.out.println("call square with int argurment "+intvalue);
        return intvalue*intvalue;
    }
    public static double square(double doublevalue){
        System.out.println("call square with double argurment "+doublevalue);
        return (doublevalue * doublevalue);
    }
}
