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
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) (readNumber("Principal (1k - 1M): ", 1_000, 1_000_000));
        float annualInterest = (float) (readNumber("Annual Interest Rate: ", 1, 30));
        short years = (short)(readNumber("Period (Years): ", 1, 30));
        
        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(years, principal, annualInterest);
    }

    private static void printMortgage(int principal, float annualInterest, short years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMORTGAGE\n-----");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(short years, int principal, float annualInterest) {
        System.out.println("\nPAYMENT SCHEDULE\n----------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            String result = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(result);
        }
    }
    
    public static double calculateBalance(int principal,
            float annualInterest, 
            short years,
            short numberOfPaymentsMade) {
                
            short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                
        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
    
    public static double readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        
        while(true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            
            if (value >= min && value <= max)
                break;
            
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
    
    public static double calculateMortgage(int principal,
            float annualInterest, 
            short years) {
                short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
                float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
                double mortgage = principal * 
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) 
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
            
                return mortgage;
        }
}
