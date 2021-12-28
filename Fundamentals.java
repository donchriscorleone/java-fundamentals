/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author christopherii
 */
public class Fundamentals {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
        System.out.print("Period (Years): "); 
        byte years = scanner.nextByte();
        int months = years * MONTHS_IN_YEAR;
        
        double mortgage = principal * 
                (monthlyInterest * Math.pow(1 + monthlyInterest, months) 
                / (Math.pow(1 + monthlyInterest, months) - 1));
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
    
}
