/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg3_5;

/**
 * Data Structures and Algorithms
 * @author Anthony Grieco
 * 
 * Create a program that reads the radius of a sphere and prints its volume 
 * and surface area. Print output to 4 Decimal Places.
 */

import java.util.Scanner;
public class PP3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double radius, volume, surfaceArea;
        
        System.out.print("Please input the radius of the circle you would like the Volume and Surface Area of: ");
        radius = userInput.nextFloat();
        System.out.println();
        
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        surfaceArea = 4*Math.PI*Math.pow(radius, 2);
        
        System.out.print("Volume: ");
        System.out.printf("%.4f", volume); //Prints the Volume to 4 decimal places
        System.out.println();
        
        System.out.print("Surface Area: ");
        System.out.printf("%.4f", surfaceArea); //Prints the Surface Area to 4 decimal places
        System.out.println();
        
    }
    
}
