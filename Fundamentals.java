/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.text.NumberFormat;
import java.util.Arrays;


/**
 *
 * @author christopherii
 */
public class Fundamentals {

    public static void main(String[] args) {
        int price = 123456; // $123456
        
        String result = NumberFormat.getPercentInstance().format(.17); // method chaining
        System.out.println(result);
    }
    
}
