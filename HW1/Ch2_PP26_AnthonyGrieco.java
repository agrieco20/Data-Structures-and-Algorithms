/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_pp2.pkg6_anthonygrieco;

/**
 * @author Anthony Grieco
 * CS 213 Data Structures and Algorithms

 * PP 2.6: Write an application that reads values representing a time duration
 * in hours, minutes, seconds, and then prints the equivalent total number of
 * seconds. (For example, 1 hour, 28 minutes, and 42 seconds is equivalent to 
 * 5322 seconds.)
 */

import java.util.*;
public class Ch2_PP26_AnthonyGrieco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int hourCount, minuteCount, secondsCount, totalNumSeconds = 0;
        
        System.out.print("Hours You Want Converted Into Total Seconds: ");
        hourCount = userInput.nextInt();
        
        System.out.print("\nMinutes You Want Converted Into Total Seconds: ");
        minuteCount = userInput.nextInt();
        
        System.out.print("\nSeconds You Want Converted Into Total Seconds: ");
        secondsCount = userInput.nextInt();
        
        totalNumSeconds = (hourCount*3600) + (minuteCount*60) + secondsCount; //There are 3600 seconds in an hour and 60 seconds in a minute
        System.out.println(hourCount + " Hour(s) "+minuteCount+" Minute(s) and "+secondsCount+" Second(s) converts to a total of "+totalNumSeconds+ " Seconds.");
    }
    
}
