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
    
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be 0 or less.");
        
        this.baseSalary = baseSalary;
    }
    
    private int getBaseSalary() {
        return this.baseSalary;
    }
    
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        
        this.hourlyRate = hourlyRate;
    }
    
    private int getHourlyRate() {
        return this.hourlyRate;
    }
}
