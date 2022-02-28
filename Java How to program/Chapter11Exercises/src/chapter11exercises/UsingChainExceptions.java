/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter11exercises;

/**
 *
 * @author Kamadje Allen
 * 
 * @description
 * Sometimes a method responds to an exception by throwing a different exception type
 * that’s specific to the current application. If a catch block throws a new exception,
 * the original exception’s information and stack trace are lost. Earlier Java versions 
 * provided nomechanism to wrap the original exception information with the new exception’s
 * information to provide a complete stack trace showing where the original problem occurred.
 * Thismade debugging such problems particularly difficult. Chained exceptions enable an
 * exception object to maintain the complete stack-trace information from the original 
 * exception.
 */
public class UsingChainExceptions {
    public static void method1() throws Exception{
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Exception thrown in method1()", e);
        }
    }

    public static void method2() throws Exception{
        try {
            method3();
        } catch (Exception e) {
            throw new Exception("Exception thrown in mwthod2()", e);
        }
    }

    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3()");
    }
}// end class UsingChainedExceptions