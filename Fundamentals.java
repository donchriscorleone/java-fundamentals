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
        int principal = (int) (Console.readNumber("Principal (1k - 1M): ", 1_000, 1_000_000));
        float annualInterest = (float) (Console.readNumber("Annual Interest Rate: ", 1, 30));
        short years = (short)(Console.readNumber("Period (Years): ", 1, 30));
        
        MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);
        
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
