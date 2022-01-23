/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing;

/**
 *
 * @author DELL
 */
public abstract class Employee {
    private final String firstName;
    private final String secondname;
    private final String SSN;

    public Employee(String firstName, String secondname, String SSN) {
        this.firstName = firstName;
        this.secondname = secondname;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getSSN() {
        return SSN;
    }
    
    @Override
    public String toString(){
        return  String.format("%s %s %nSocial Security number is: %s", getFirstName(), getSecondname(), getSSN());
    }
    
    /***
     * ...abstract method must be overridden by concrete subclasses...
     */
    public abstract double earnings();
}//end abstract class
