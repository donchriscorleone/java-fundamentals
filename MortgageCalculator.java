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
public class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    
    private int principal;
    private float annualInterest;
    private short years;
    
    public MortgageCalculator(int principal, float annualInterest, short years) {
        this.setPrincipal(principal);
        this.setAnnualInterest(annualInterest);
        this.setYears(years);
    }
    
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        return principal
            * (Math.pow(1 + monthlyInterest, getNumberOfPayments()) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
            / (Math.pow(1 + monthlyInterest, getNumberOfPayments()) - 1);
    }
    
    public double calculateMortgage() {
        double mortgage = principal * 
            (getMonthlyInterest() * Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()) 
            / (Math.pow(1 + getMonthlyInterest(), getNumberOfPayments()) - 1));

        return mortgage;
    }
    
    public double[] getRemainingBalances() {
        double[] balances = new double[this.getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = this.calculateBalance(month);
        
        return balances;
    }
    
    private short getNumberOfPayments() {
       return (short) (years * MONTHS_IN_YEAR);
    }
    
    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
    
    private void setPrincipal(int principal) {
        if (principal <= 0) throw new IllegalArgumentException();
        
        this.principal = principal;
    }
    
    private void setAnnualInterest(float annualInterest) {
        if (annualInterest <= 0) throw new IllegalArgumentException();
        
        this.annualInterest = annualInterest;
    }
    
    private void setYears(short years) {
        if (years <= 0) throw new IllegalArgumentException();
        
        this.years = years;
    } 
    
}
