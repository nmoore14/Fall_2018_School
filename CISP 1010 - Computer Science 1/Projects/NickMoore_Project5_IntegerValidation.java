import java.util.*;

/**
 * -------------------------------------------------
 * File name: NickMoore_Project5_IntegerValidation.java
 * Project name: Integer Validation
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-3-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project5_IntegerValidation
{

    public static void generateHeader() 
    {
        System.out.println("====================================================");
        System.out.println("|      ______________________________________      |");
        System.out.println("|         /        Nick Moore Tech       \\         |");
        System.out.println("|        /         ***PRESENTS***         \\        |");
        System.out.println("|       /     Integer Input Validation     \\       |");
        System.out.println("|      /          with Statistics           \\      |");
        System.out.println("|      ______________________________________      |");
        System.out.println("|                                                  |");
        System.out.println("====================================================");
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Create an array to store user input
        List<String> userInts = new ArrayList<String>();
        String userInput = "";
        boolean keepGoing = true;

        // Create variables to store average , sum, and total length of array.
        int totalCount = 0;
        int sum = 0;
        double avg = 0;

        // Display the header information
        generateHeader();

        // Display a message to tell the user what to do.
        System.out.println("Please enter a positive interger. Enter 'D' or 'd' if you are done.");

        // Create a while loop for the user to enter an int to add to their running array.

        while(keepGoing)
        {
            if(userInput == "d" || userInput == "D")
            {
                keepGoing = false;
            }
            else
            {
                totalCount++;
                System.out.printf("%-4sInterger %s: ", "", totalCount);
                userInput = input.nextLine();
                userInts.add(userInput);
            }
        }

        System.out.println(userInts);

        input.close();
    }
    
}