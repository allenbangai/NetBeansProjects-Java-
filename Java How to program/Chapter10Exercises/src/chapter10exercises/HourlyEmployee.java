/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10exercises;

/**
 *
 * @author DELL
 */
public class HourlyEmployee extends Employee{
    private double wages; //wages per hour
    private double hours; //number of worked hours per week

    public HourlyEmployee(double wages, double hours, String firstName, String secondname, String SSN) {
        super(firstName, secondname, SSN);
        
        if (wages < 0.0) {
            throw new IllegalArgumentException("Wages must be above 0");
        }
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Work hours must be valid");
        }
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        
        if (wages < 0.0) {
            throw new IllegalArgumentException("Wages must be above 0");
        }
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Work hours must be valid");
        }
        this.hours = hours;
    }

    @Override
    public String toString(){
        return String.format("Hourly Employee: %s%n%s: $%,.2f: %n%s: $%,.2f", 
                super.toString(), "hourly wage", getWages(), "hours worked", getHours());
    }
    
    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWages()*getHours();
        }else{
            return  40*getWages() + (getHours()-40)*getWages()*1.5;
        }
    }
    
    
    
}
