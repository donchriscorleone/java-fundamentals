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
public class Fundamentals {

    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
