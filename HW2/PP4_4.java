/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg4_4;

/**
 * Data Structures and Algorithms
 * @author Anthony Grieco
 * 
 * Create a program that reads a string from the user and prints it one character at a time.
 */

import java.util.Scanner;
public class PP4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        
        System.out.print("Please type a String and I will seperate it into individual characters: ");
        userInput = scan.nextLine();
        
        for (int i = 0; i<userInput.length(); i++){
            System.out.println(userInput.charAt(i));
        }
        
    }
    
}
