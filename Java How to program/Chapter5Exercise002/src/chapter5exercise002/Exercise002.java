/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercise002;

/**
 *
 * @author DELL
 */
public class Exercise002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat to autopolicy objects
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
        
        //display whether each policy is in a no-fault state
        policyisinnofaultstate(policy1);
        policyisinnofaultstate(policy2);
    }

    private static void policyisinnofaultstate(AutoPolicy policy1) {
        System.out.println("The auto policy :");System.out.printf("Account #: %d: car: %s: State %s %s a no-fault state%n%n",
                           policy1.getaccountnumbmer(), policy1.getmakeandmodel(),
                           policy1.getstate(),
                           (policy1.isinnofaultstate()?"is":"is not"));
    }                                           
}//end of exercis002 chapter 5 java
