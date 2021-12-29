/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.util.Scanner;

/**
 *
 * @author christopherii
 */
public class Console {
    private static Scanner scanner = new Scanner(System.in);
    
    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }
    
    public static double readNumber(String prompt, int min, int max) {
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
}
