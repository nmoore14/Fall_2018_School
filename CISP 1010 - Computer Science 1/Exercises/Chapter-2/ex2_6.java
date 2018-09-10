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
            if(userNumber == 0)
            {
                int finalTotal = 0;
                System.out.println("The total of all the digits in your number is: " + finalTotal);
            } 
            else 
            {
                if(userNumber == 1000)
                {
                    int finalTotal = 1;
                    System.out.println("The total of all the digits in your number is: " + finalTotal);
                } 
                else 
                {
                    int digit1 = userNumber % 10;

                    int digit2 = userNumber / 10;
                    int finalDigit2 = digit2 % 10;

                    int digit3 = userNumber / 100;

                    int finalTotal = digit1 + finalDigit2 + digit3;
                    System.out.println("The total of all the digits in your number is: " + finalTotal);

                }
            }
            
        }

        input.close();
    }
     
 }