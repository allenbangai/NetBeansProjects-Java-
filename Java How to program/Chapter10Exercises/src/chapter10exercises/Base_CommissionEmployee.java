/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10exercises;

/**
 *
 * @author DELL
 */
public class Base_CommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public Base_CommissionEmployee(double grossSales, double commissionRate, double baseSalary, 
            String firstName, String secondname, String SSN) {
        super(grossSales, commissionRate, firstName, secondname, SSN);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), 
                "base salary", getBaseSalary());
    }
    
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
        
}
