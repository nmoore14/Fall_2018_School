 import java.util.*;
 
 /**
 * -------------------------------------------------
 * File name: NickMoore_Project6_DateConverter.java
 * Project name: Date Converter
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10/10/2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project6_DateConverter
{
    public static void generateHeader() {
        System.out.println("\t====================================================");
        System.out.println("\t|      ______________________________________      |");
        System.out.println("\t|         /        Nick Moore Tech       \\         |");
        System.out.println("\t|        /         ***PRESENTS***         \\        |");
        System.out.println("\t|       /          Date Converter          \\       |");
        System.out.println("\t|      ______________________________________      |");
        System.out.println("\t|                                                  |");
        System.out.println("\t====================================================");
    }

    public static boolean characterCheck(char a) 
    {
        int value = a;
        boolean keepGoing = true;

        if (value == 68 || value == 100) 
        {
            keepGoing = false;
        }

        return keepGoing;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        boolean keepGoing = true;
        
        // Display the welcome message
        generateHeader();

        // Loop to keep going until the user enters 'd' or 'D'.
        while(keepGoing)
        {
            // Ask the user for their date.
            System.out.print("Please enter a date(i.e. 01/01/1989) or d / D to exit : ");

            // Create a variable to store the users date.
            String userDate = input.nextLine();
            System.out.println(userDate);

            // Check the length of user input to see if it could possibly be the exit character
            if(userDate.length() == 1)
            {
                char userChar = userDate.charAt(0);
                keepGoing = characterCheck(userChar);
                
                if (keepGoing) {
                    System.out.println("Incorrect format.  Enter date as MM/DD/YYYY");
                }
            }
            else
            {
                if (userDate.indexOf('/') > 0 && userDate.indexOf('/') < 3)
                {
                    int firstSlash = userDate.indexOf('/');

                    if(firstSlash == 1)
                    {
                        if(userDate.indexOf('/', 2) == 3 || userDate.indexOf('/', 2) == 4)
                        {
                            System.out.println(firstSlash + " | " + userDate.indexOf('/',2));
                        }
                    }
                    else
                    {
                        if (userDate.indexOf('/', 3) == 4 || userDate.indexOf('/', 3) == 5) 
                        {
                            System.out.println(firstSlash + " | " + userDate.indexOf('/', 3));
                        }
                    }
                    System.out.println(userDate.indexOf('/', 3));
                } 
                else
                {
                    System.out.println("Incorrect format.  Enter date as MM/DD/YYYY");
                }
            }


            // Look for the first / in the string
            
            

        }
        
        // Close the input
        input.close();
    }
    
}