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

        boolean isSpecial = false;

        int[] asciiUppercase = {65, 69, 73, 79, 85};
        int[] asciiLowercase = {97, 101, 105, 111, 117};
        int[] asciiSpecialChar = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96, 123, 124, 125, 126};

        // Display Welcome message to the user
        System.out.println("====================================================");
        System.out.println("|      ______________________________________      |");
        System.out.println("|         /        Nick Moore Tech       \\         |");
        System.out.println("|        /         ***PRESENTS***         \\        |");
        System.out.println("|       /        Charcter Calculator       \\       |");
        System.out.println("|      ______________________________________      |");
        System.out.println("|                                                  |");
        System.out.println("====================================================");
        
        // Ask the user to insert 1 character.
        System.out.print("Please enter a single character: ");
        String userInput = input.nextLine();

        // TODO Check to make sure the user entered just 1 character.
        if (userInput.length() != 1)
        {
            System.out.println("Invalid Response.  Must be one character");
            System.exit(0);
        } 
        else
        {
            // TODO Start the counter to see how long the application runs
            double startTime = System.nanoTime();

            // TODO Output the ASCII value of the character that the user entered.
            char userChar = userInput.charAt(0);
            System.out.println(userChar);
            int ascii = userChar;
            System.out.println("ASCII: " + ascii);

            // TODO Check to see if the character is an Uppercase or Lowercase vowel.
            for (int i = 0; i < asciiUppercase.length; i++)
            {
                if(ascii == asciiUppercase[i])
                {
                    System.out.println("Uppercase Vowel");
                }
            }

            for (int i = 0; i < asciiLowercase.length; i++) {
                if (ascii == asciiLowercase[i]) {
                    System.out.println("Lowercase Vowel");
                }
            }

            // TODO Check to see if the character that the user entered is an integer.
            if (ascii >= 48 && ascii <= 57)
            {
                System.out.println("Character is an interger.");
            }
            else
            {
                System.out.println("Character is not an integer");
            }

            // TODO Check to see if the entered value is a space.
            if (ascii == 32)
            {
                System.out.println("Character is a space.");
            }
            else
            {
                System.out.println("Character is not a space.");
            }

            // TODO Check to see if the character is a "SPECIAL CHARACTER"
            for (int i = 0; i < asciiSpecialChar.length; i++) {
                if (ascii == asciiSpecialChar[i]) {
                    isSpecial = true;
                }
            }

            if (isSpecial)
            {
                System.out.println("Character is a SPECIAL CHARACTER");
            }
            else
            {
                System.out.println("Character is not a SPECIAL CHARACTER");
            }

            // TODO Get the application end time and display the total time.
            double endTime = System.nanoTime();
            double duration = endTime - startTime;
            double finalDuration = duration / 1000000000;

            System.out.printf("Runtime in seconds: %.4f\n", finalDuration);

        }

        input.close();
        
    }
    
}