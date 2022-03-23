/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_pp2.pkg9_anthonygrieco;

/**
 * @author Anthony Grieco
 * CS 213 Data Structures and Algorithms

 * PP 2.9: Write an application that prompts for and reads a double value 
 * representing a monetary amount. Then determine the least number of each bill 
 * and coin needed to represent that amount, starting with the highest (assume
 * that a ten-dollar bill is the maximum size needed). For example, if the 
 * value entered is $47.63, then the program should print the equivalent 
 * amount as: 
 * 4 ten dollar bills
 * 1 five dollar bills
 * 2 one dollar bills
 * 2 quarters
 * 1 dimes
 * 0 nickels
 * 3 pennies
 */
import java.util.*;
public class Ch2_PP29_AnthonyGrieco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double inputtedMoney = 0;
        //double originalAmount= 0;
        int num10DollarBills = 0, num5DollarBills = 0, num1DollarBills = 0, numQuarters = 0, numDimes = 0, numNickels = 0, numPennies = 0;
        
        System.out.print("How much money would you like to convert into the smallest possible amount of change? $");
        inputtedMoney = userInput.nextDouble();
        double originalAmount = inputtedMoney;
        
        do{
            if(inputtedMoney >= 10){ //Ten Dollar Bills
                inputtedMoney -= 10;
                num10DollarBills++;
            }
            
            else if (inputtedMoney >= 5){ //Five Dollar Bills
                inputtedMoney -= 5;
                num5DollarBills++;
            }
            
            else if (inputtedMoney >= 1){ //One Dollar Bills
                inputtedMoney -= 1;
                num1DollarBills++;
            }
            
            else if (inputtedMoney >= 0.25){ //Quaters
                inputtedMoney -= 0.25;
                numQuarters++;
            }
            else if (inputtedMoney >= 0.10){ //Dimes
                inputtedMoney -= 0.10;
                numDimes++;
            }
            else if (inputtedMoney >= 0.05){ //Nickels
                inputtedMoney -= 0.05;
                numNickels++;
            }
            
            else if (inputtedMoney <= 0){ //Just in case a zero or negative number is inputted the program will return nothing
                break;
            }
            
            else{ //Pennies
                inputtedMoney -= 0.01;
                numPennies++;
            }
            
            inputtedMoney = (float) Math.round(inputtedMoney * 100)/100; //Used to round the value "inputtedMoney" back to 2 decimal places in order to remove a bug that would add 0.0000000028 to the total for an unknown reason - found error through debugging
        
        } while(inputtedMoney > 0.00);
        
        System.out.println("In the smallest bills possible (assuming that the 10 dollar bill is the largest),\nthe following is he equivalent to the inputted $" +originalAmount+":");
        System.out.println(num10DollarBills + " ten dollar bills\n"
                + num5DollarBills + " five dollar bills\n" 
                + num1DollarBills + " one dollar bills\n" 
                + numQuarters + " quarters\n" 
                + numDimes + " dimes\n" 
                + numNickels + " nickels\n" 
                + numPennies + " pennies");
    }
}