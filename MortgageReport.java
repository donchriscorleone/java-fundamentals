/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.text.NumberFormat;

/**
 *
 * @author christopherii
 */
public class MortgageReport {
    private MortgageCalculator mortgageCalculator;
    private final NumberFormat currencyInstance;
    
    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        this.currencyInstance = NumberFormat.getCurrencyInstance();
    }
    
    public void printMortgage() {
        double mortgage = mortgageCalculator.calculateMortgage();
        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println("\nMORTGAGE\n-----");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE\n----------");
        for (double balance: mortgageCalculator.getRemainingBalances())
            System.out.println(currencyInstance.format(balance));
    }
}
