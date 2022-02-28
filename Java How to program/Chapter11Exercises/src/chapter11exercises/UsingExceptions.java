/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter11exercises;

/**
 *
 * @author Kamadje Allen
 */
public class UsingExceptions {
    public static void throwException() throws Exception{
        try{
            System.out.println("Method throwException");
            throw new Exception(); // generate exception
        }catch(Exception exception){
            System.err.println("Exception handled in method throwException");
            throw exception; // rethrow for further processing

            // code here would not be reached; would cause compilation errors
        }finally{ // executes regardless of what occurs in try...catch
            System.err.println("Finally executed in throwException");
        }

        // code here would not be reached; would cause compilation errors
    }
    
    // demonstrate finally when no exception occurs
    public static void doesNotThrowException() throws Exception{
        try{ // try block does not throw an exception
            System.out.println("Method does not throw exeption");
        }catch(Exception exception){ //does not execute
            System.err.println(exception);
        }finally{ //execute regardless of what happens
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }

    public static void method1() throws Exception{
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
    
}// end class UsingExceptions
