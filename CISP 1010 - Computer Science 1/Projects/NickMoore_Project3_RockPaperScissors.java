 import java.util.Random;
import java.util.Scanner;
 
 /**
 * -------------------------------------------------
 * File name: NickMoore_Project3_RockPaperScissors
 * Project name: Rock Paper Scissors
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-24-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project3_RockPaperScissors
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Display welcome message to the user
        System.out.println("*********************************************");
        System.out.println("**********                         **********");
        System.out.println("********** ROCK - PAPER - SCISSORS **********");
        System.out.println("**********                         **********");
        System.out.println("*********************************************");

        // Ask the user to pick rock, paper, or scissors based on numerical value
        // Rock - 1
        // Paper - 2
        // Scissors - 3
        System.out.println("Please select a numerical value for ROCK - 1, PAPER- 2, or SCISSORS - 3");
        int user = input.nextInt();

        
        // Make sure the user picks a number in the correct range, 1-2-3.
        // Display a message if the user picks an invalid number

        if (user < 1 || user > 3)
        {
            System.out.println("Your entry is invalid, please pick 1, 2, or 3.");
            System.exit(1);
        } else
        {
            // If the user has picked correctly, have the computer randomly select a number.
            Random r = new Random();
            int min = 1;
            int max = 4;
            int computer = r.nextInt(max-min) + min;

            // Print the computer and user guesses
            System.out.println("Your guess: " + user);
            System.out.println("HALs guess: " + computer);

            // Compare user vs computer and print the appropriate winner message.
            // Same for both => TIE
            // ROCK > SCISSORS => Rock wins
            // PAPER > ROCK => Paper wins
            // SCISSORS > PAPER => Scissors wins
            if (user == computer)
            {
                System.out.println("It's a TIE!!!");
            } else if (user == 1) // User has chosen rock and it is not a tie
            {
                if (computer == 3) // Computer selects scissors and loses
                {
                    System.out.println("ROCK beats SCISSORS...YOU WIN!!!");
                } else
                {
                    System.out.println("ROCK losses to PAPER...HAL WINS!!!");
                }
            } else if (user == 2) // User has chosen paper and it is not a tie.
            {
                if (computer == 1) // Computer selects rock.
                {
                    System.out.println("PAPER beats ROCK...YOU WIN!!!");
                } else
                {
                    System.out.println("PAPER losses to SCISSORS...HAL WINS!!!");
                }

            } else // User has selected Scissors and it is not a tie
            {
                if (computer == 2 ) // If computer has selected paper
                {
                    System.out.println("SCISSORS beat PAPER...YOU WIN!!!");
                } else
                {
                    System.out.println("SCISSORS lose to ROCK...HAL WINS!!!");
                }
            }
        } 
        input.close();
    }
    
}