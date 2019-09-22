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
public class EmployeeImplementation {
    public static void main(String[] args){
        System.out.printf("Employees before instantiation: %d%n",Employee.getCount());
        
        //creat tow employee constructor
        Employee employee1 = new Employee("Susan", "Baker");
        Employee employee2 = new Employee("Bob","Blue");
        
        // show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.println("via employee1.getCount "+employee1.getCount());
        System.out.println("via employee2.getCount "+employee2.getCount());
        
        System.out.printf("via Employee.getCount(): %d%n",Employee.getCount());
        
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",employee1.getFirstName(), employee1.getLastName(),employee2.getFirstName(), employee2.getLastName());
    }
    
}
