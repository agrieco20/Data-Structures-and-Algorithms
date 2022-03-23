/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg3_3;

/**
 * Data Structures and Algorithms
 * @author Anthony Grieco
 * 
 * Create a program that creates and prints a random phone number in the form XXX-XXX-XXXX.
 * Do not let the first 3 digits contain an 8 or 9.
 */
import java.util.*;
public class PP3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random();
        
        System.out.println("Your randomly generated phone is: ");
        
        //Digits 1-3
        System.out.print((int)(generator.nextFloat()*8)); //Digit 1
        System.out.print((int)(generator.nextFloat()*8)); //Digit 2
        System.out.print((int)(generator.nextFloat()*8)); //Digit 3
        
        System.out.print("-");
        
        //Digits 4-6
        int digits4_6 = generator.nextInt(743);
        
        if (digits4_6 < 10){
            System.out.print("00" + digits4_6);
        }
        
        else if (digits4_6 < 100){
            System.out.print("0" + digits4_6);
        }
        
        else{
            System.out.print(digits4_6);
        }
        
        System.out.print("-");
        
        //Digits 7-10
        int digits7_10 = (int)(generator.nextFloat()*9999);
        
        if (digits7_10 < 1000){
            System.out.println("0" + digits7_10);
        }
        else{
            System.out.println(digits7_10);
        }
    }
    
}
