/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10exercises;

/**
 *
 * @author DELL
 */
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate, String firstName, String secondname, String SSN) {
        super(firstName, secondname, SSN);
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("grossSales cannot be negative");
        }
        if (commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("commissionRate cannot be negative");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("grossSales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0.0 || commissionRate > 1.0) {
            throw new IllegalArgumentException("commissionRate cannot be negative");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
                "commission employee", super.toString(), 
                "gross sales", getGrossSales(), 
                "commission rate", getCommissionRate());
    }
    
    @Override
    public double earnings() {
        return getCommissionRate()*getGrossSales();
    }
}
