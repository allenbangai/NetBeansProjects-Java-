/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10exercises;

/**
 *
 * @author DELL
 */
public class SalariedEmployees extends Employee{
    private double weeklySalary;

    public SalariedEmployees(double weeklySalary, String firstName, String secondname, String SSN) {
        super(firstName, secondname, SSN);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly Salary cannot be a negative number");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly Salary cannot be a negative number");
        }
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "Weekly Salary", getWeeklySalary());
    }
    
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    
    
}
