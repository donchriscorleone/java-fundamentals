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
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        int principal = 0;
        float annualInterest = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        byte years = 0;
        
        Scanner scanner = new Scanner(System.in);
            
        while(true) {
            System.out.print("Principal (1k - 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            
            System.out.println("Enter a number between " + numberFormat.format(1_000) + " and " + numberFormat.format(1_000_000));
        }
        
        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            
            System.out.println("Enter a value greater than " + numberFormat.format(0) + " and less than or equal to " + numberFormat.format(30));
        }
        
        while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            
            System.out.println("Enter a value between " + numberFormat.format(0) + " and " + numberFormat.format(30));
        }
        

        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    
    public static double calculateMortgage(int principal,
            float annualinterest, 
            byte years) {
        
            double mortgage = principal * 
            (monthlyInterest * Math.pow(1 + monthlyInterest, months) 
            / (Math.pow(1 + monthlyInterest, months) - 1));
            
            return mortgage;
    }
    
}
