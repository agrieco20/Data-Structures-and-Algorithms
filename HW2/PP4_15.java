/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg4_15;

/**
 * Data Structures and Algorithms
 * @author Anthony Grieco
 * 
 * Create a program that simulates a simple slot machine with three numbers 
 * between 0 and 9. Print out whether 2 or 3 of the numbers matched and continue
 * playing until the user no longer wants to play.
 */
import java.util.*;
public class PP4_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        String userInput;
        
        do{
            int slot1 = generator.nextInt(10);
            int slot2 = generator.nextInt(10);
            int slot3 = generator.nextInt(10);
            
            System.out.println("Slot 1: " + slot1);
            System.out.println("Slot 2: " + slot2);
            System.out.println("Slot 3: " + slot3);
            
            if (slot1 == slot2 && slot2 == slot3){
                System.out.println("All 3 Slots Matched!");
            }
            
            else if (slot1 == slot2 && slot1 != slot3){
                System.out.println("Slots 1 and 2 Matched!");
            }
            
            else if (slot1 == slot3 && slot1 != slot2){
                System.out.println("Slots 1 and 3 Matched!");
            }
            
            else if (slot2 == slot3 && slot2 != slot1){
                System.out.println("Slots 2 and 3 Matched!");
            }
            
            else{
                System.out.println("None of the Slots Matched...");
            }

            System.out.print("Would you like to keep playing?");
            userInput = scan.nextLine();
//        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("ye") || userInput.equalsIgnoreCase("yes")){
        } while(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("ye") || userInput.equalsIgnoreCase("yes"));
        
    }
    
}
