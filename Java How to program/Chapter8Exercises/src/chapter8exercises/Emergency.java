/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter8exercises;

/**
 *
 * @author DELL
 */
public class Emergency {
    //declaring private vriables of class emergency
    private String firstName;
    private String lastName;
    private String location;
    private String time;
    private String phoneNumber;
    private String info;

    //declaring contructor that instantiate all the private parameters of the class
    public Emergency(String firstName, String lastName, String location, String time, String phoneNumber, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.time = time;
        this.phoneNumber = phoneNumber;
        this.info = info;
    }

    
    
    /***
     * Declaring setters and getter methods for private variable of class Emergency
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    
}
