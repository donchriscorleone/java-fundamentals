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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat() / 100;
        float monthlyInterest = interest / 12;
        
        System.out.print("Period (Years): "); 
        byte years = scanner.nextByte();
        int months = years * 12;
        
        double upper = monthlyInterest * Math.pow(1 + monthlyInterest, months);
        double lower = Math.pow(1 + monthlyInterest, months) - 1;
        
        double mortgage = principal * (upper / lower);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
    
}
