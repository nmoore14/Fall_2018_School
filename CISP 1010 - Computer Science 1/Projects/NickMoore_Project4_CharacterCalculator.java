import java.util.Scanner;
/**
 * -------------------------------------------------
 * File name: NickMoore_Project4_CharacterCalculator.java
 * Project name: Character Calculator
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-1-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project4_CharacterCalculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // TODO Display Welcome message to the user
        System.out.println("====================================================");
        System.out.println("|      ______________________________________      |");
        System.out.println("|         /        Nick Moore Tech       \\         |");
        System.out.println("|        /         ***PRESENTS***         \\        |");
        System.out.println("|       /        Charcter Calculator       \\       |");
        System.out.println("|      ______________________________________      |");
        System.out.println("|                                                  |");
        System.out.println("====================================================");
        
        // TODO Ask the user to insert 1 character.
        System.out.print("Please enter a single character: ");
        String userInput = input.nextLine();
        String outputIndent = "        ";

        String userIO = outputIndent + "You entered: " + userInput;
        System.out.printf("%-10s %s%n", userIO, userIO);
        // TODO Check to see if the character is an Uppercase or Lowercase vowel.
        // TODO Output the ASCII value of the character that the user entered.
        // TODO Check to see if the character that the user entered is an integer.
        // TODO Check to see if the entered value is a space.
        // TODO Check to see if the character is a "SPECIAL CHARACTER"


        input.close();
        
    }
    
}