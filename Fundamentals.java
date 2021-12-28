/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.util.Arrays;


/**
 *
 * @author christopherii
 */
public class Fundamentals {

    public static void main(String[] args) {
        // Array is for listing items
        int[] numbers = new int[5]; // older way for instancing an array
        numbers[0] = 1;
        numbers[1] = 2;
        
        // use this if we know ahead of time the items of an array
        int[] numberss = {1,2,3,4};
 
        //numbers[10] = 3; // Exception will raise
        System.out.println(numbers); // printing array will return string calculated based of address in memory
        System.out.println(Arrays.toString(numbers)); // Arrays class and method to print arrays
    }
    
}
