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
        
        System.out.print("Number: ");
        int value = scanner.nextInt();
        
        if (value % 3 == 0 && value % 5 == 0)
            System.out.println("FizzBuzz");
        else if (value % 3 == 0)
            System.out.println("Buzz");
        else if (value % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(value);
    }
    
}
