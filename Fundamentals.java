/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.text.NumberFormat;
import java.util.Scanner;


/**
 *
 * @author christopherii
 */
public class Fundamentals {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setHourlyRate(150);
        employee.setBaseSalary(10);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
