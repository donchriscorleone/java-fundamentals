/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.awt.Point;

/**
 *
 * @author christopherii
 */
public class Fundamentals {

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        // point1 and point2 are referencing the exact same object in memory
        point1.x = 5;
        System.out.println(point2.x);
    }
    
}
