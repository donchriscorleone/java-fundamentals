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
        int principal = (int) (readNumber("Principal (1k - 1M): ", 1_000, 1_000_000));
        float annualInterest = (float) (readNumber("Annual Interest Rate: ", 1, 30));
        short years = (short)(readNumber("Period (Years): ", 1, 30));
        double mortgage = calculateMortgage(principal, annualInterest, years);
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
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
        
                final byte MONTHS_IN_YEAR = 12;
                final byte PERCENT = 100;
                
                short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
                float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        
            double mortgage = principal * 
            (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) 
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
            
            return mortgage;
    }
    
}
