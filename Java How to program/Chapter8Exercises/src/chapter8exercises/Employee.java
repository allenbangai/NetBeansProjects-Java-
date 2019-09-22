/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8exercises;

/**
 *
 * @author DELL
 */
public class Employee {
    public static int count = 0;
    private String firstName, lastName;
    
    // initialize Employee, add 1 to static count and
    // output String indicating that constructor was called
    public Employee(String FirstName, String LastName){
        this.firstName = FirstName;
        this.lastName = LastName;
        
        ++count;
        System.out.printf(" Employee constructor has : %s %s; count = %d%n", firstName, lastName, count);
        
    }
    
    //get fistName;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    //public static methid to return count value
    public static int getCount(){
        return count;
    }
}
