import java.util.*;
import java.lang.*;

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

    public static boolean characterCheck(char a)
    {
        int value = a;
        boolean keepGoing = true;
        
        if(value == 68 || value == 100)
        {
            keepGoing = false;
        }

        return keepGoing;
    }

    public static boolean numberCheck(char a) 
    {
        int value = a;
        boolean notANumber = false;

        if (value < 48 || value > 57) {
            notANumber = true;
            return notANumber;
        }

        return notANumber;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Create an array to store user input
        List<String> userInts = new ArrayList<String>();
        String userInput = "";
        boolean keepGoing = true;
        boolean notANumber = false;

        // Create variables to store average , sum, and total length of array.
        float totalCount = 0;
        int itemCount = 0;
        float sum = 0;
        float avg = 0;
        int highValue = 0;

        // Display the header information
        generateHeader();

        // Display a message to tell the user what to do.
        System.out.println("Please enter a positive, whole interger. Enter 'D' or 'd' if you are done.");

        // Create a while loop for the user to enter an int to add to their running array.

        while(keepGoing)
        {
            itemCount++;
            System.out.printf("%-4sInterger %s: ", "", itemCount);
            userInput = input.nextLine();
            char[] chars = userInput.toCharArray();
            
            for(int i = 0; i < chars.length; i++)
            {
                keepGoing = characterCheck(chars[i]);
                notANumber = numberCheck(chars[i]);
                if(notANumber)
                {
                    break;
                }
            }

            if(keepGoing)
            {
                if (notANumber) 
                {
                    itemCount--;
                    System.out.println("Please enter a positive, whole number.");
                } 
                else 
                {
                    userInts.add(userInput);
                }
            }
        }

        input.close();

        // Remove the last item from the list since this is a alphanumeric character and not an integer
        // userInts.remove(userInts.size() - 1);
        totalCount = userInts.size();

        // Create an array to hold the list items
        String[] strArray = new String[userInts.size()];

        // Convert the new list to an array
        strArray = userInts.toArray(strArray);

        // Create an int array to hold the new converted int numbers
        int[] intArray = new int[strArray.length];

        for (int j = 0; j < strArray.length; j++) {
            intArray[j] = Integer.parseInt(strArray[j]);
        }

        System.out.println("\nStatistics:");
        for(int q = 0; q < intArray.length; q++)
        {
            sum += intArray[q];
        }

        System.out.printf("%-10sTotal: %.1f\n", "", sum);

        // Calculate the average of the entered values.
        avg = sum / totalCount;
        System.out.printf("%-10sAverage: %.2f\n", "", avg);

        // Sort the array to find the highest value in the array
        Arrays.sort(intArray);
        int arrayPoint = intArray.length - 1;
        highValue = intArray[arrayPoint];
        System.out.printf("%-10sHighest Value: %s\n", "", highValue);
        
    }
    
}