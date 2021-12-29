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
    public int hourlyRate = 150;
    public int baseSalary = 10_000;
    
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    
}
