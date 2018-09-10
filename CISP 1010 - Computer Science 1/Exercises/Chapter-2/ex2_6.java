 import java.util.Scanner;
 
 /**
 * -------------------------------------------------
 * File name: ex2_6.java
 * Project name: Chapter 2 exercise 6
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-10-2018
 * -------------------------------------------------
 * 
 */
 public class ex2_6 
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // Ask the user to input a number between 0 and 1000 and then add all of the digits together.

        System.out.println("Please enter a whole number between 0 and 1000");
        int userNumber = input.nextInt();

        if(userNumber > 0 && userNumber <= 1000)
        {
            int lastDigit = userNumber % 10;
            System.out.println(lastDigit);
        }

        
        
    }
     
 }