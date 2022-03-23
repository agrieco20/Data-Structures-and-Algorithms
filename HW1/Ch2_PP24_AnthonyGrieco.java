/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_pp2.pkg4_anthonygrieco;

/**
 * @author Anthony Grieco
 * CS 213 Data Structures and Algorithms

 * PP 2.4: Create a version of the TempConverter application to convert from
 * Fahrenheit to Celsius. Read the Fahrenheit temperature from the user.
*/
import java.util.*;
public class Ch2_PP24_AnthonyGrieco {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        
        System.out.print("Temperature you want converted (in Fahrenheit) to Celsius: ");
        
        double fahrenheitTemp = userInput.nextFloat();
        double celsiusTemp = (fahrenheitTemp - BASE)*CONVERSION_FACTOR;
        
        System.out.println("\nFarenheit Temperature: "+fahrenheitTemp+" Degrees\nCelsius Equivalent: " +celsiusTemp+ " Degrees");
    }   
}