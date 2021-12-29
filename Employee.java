/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author christopherii
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;
    
    public Employee(int baseSalary, int hourlyRate) {
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }
    
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be 0 or less.");
        
        this.baseSalary = baseSalary;
    }
    
    public int getBaseSalary() {
        return this.baseSalary;
    }
    
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        
        this.hourlyRate = hourlyRate;
    }
    
    public int getHourlyRate() {
        return this.hourlyRate;
    }
}
