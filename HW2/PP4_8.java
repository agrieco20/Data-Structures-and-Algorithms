/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.pkg4_8;

/**
 * Data Structures and Algorithms
 * @author Anthony Grieco
 * 
 * Create a program that plays the Hi-Lo guessing game with numbers 1-10 
 * (inclusive) and then repeatedly prompt the user to guess the number.
 */

import java.util.*;
public class PP4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner quitScan = new Scanner(System.in);
        int userInput;
        String continuePlaying;
        
        boolean gameOver = false;
        
        Random generator = new Random();
        
        do{
            int secretNum = generator.nextInt(99) + 1;
            int counter = 0;
            do{
                counter++; //Does not count guesses that were out of bounds
                do { //Data Validation (Input must be between 1 and 100)
                System.out.print("My secret number is between 1 and 100. What do you think it is? ");
                userInput = scan.nextInt();
                System.out.println();
                } while (userInput < 1 || userInput > 100);

                if (secretNum == userInput){ //If Correct
                    gameOver = true;
                    System.out.println("Congratulations! You picked my number!");
                    System.out.println("It took you " + counter + " guesses to win!");
                    break;
                }

                else if (userInput > secretNum){ //Guess was too high
                    System.out.println("My number is lower.");
                }

                else {// (userInput < secretNum){ //Guess was too low
                    System.out.println("My number is higher.");
                }

                //Asks whether user wants to keep playing the current game
                System.out.print("Would you like to keep playing this game (Y/N)? ");
                continuePlaying = quitScan.nextLine();
                System.out.println();
                if (continuePlaying.equalsIgnoreCase("y") || continuePlaying.equalsIgnoreCase("ye") || continuePlaying.equalsIgnoreCase("Yes")) {
                    gameOver = false;
                }
                else{
                    gameOver = true;
                    System.out.println("It took you " + counter + " guesses before you gave up!");
                }

            }while(gameOver == false);

            System.out.println("My number was " + secretNum + "!");
//            System.out.println("It took you " + counter + " guesses!");

            gameOver = false; //Resets in case user wants to play game again
            System.out.print("Would you like to play again (Y/N)? ");
            continuePlaying = quitScan.nextLine();
            if (continuePlaying.equalsIgnoreCase("y") || continuePlaying.equalsIgnoreCase("Yes")) {
                gameOver = false;
                }
            else{
                gameOver = true;
                }
        } while(gameOver == false);
        
    }
    
}
