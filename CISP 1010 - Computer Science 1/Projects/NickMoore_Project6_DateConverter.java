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

    public static String dateOutput(String userDate)
    {
        // Split the string into 3 arrays with the breakpoints being the '/'
        String array1[]= userDate.split("/");

        // set the appropriate array index to the coresponding int value
        int monthNum = Integer.parseInt(array1[0]);
        int day = Integer.parseInt(array1[1]);
        int year = Integer.parseInt(array1[2]);

        // Create the month and dateFinal string to store the values after the switch case method.
        String month;
        String dateFinal;


        // See what month the user entered.
        switch (monthNum)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "Feburary";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
        }

        if (monthNum > 12 || monthNum < 1 || day < 1 || day > 31 || year < 0 || year > 9999)
        {
            dateFinal = "Please check your month, day, or year number and re-enter.";
        }
        else
        {
            dateFinal = month + " " + day + ", " + year;

        }
    
        return dateFinal;
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
                // Look for the first / in the string
                if (userDate.indexOf('/') > 0 && userDate.indexOf('/') < 3)
                {
                    int firstSlash = userDate.indexOf('/');

                    if(firstSlash == 1)
                    {
                        if(userDate.indexOf('/', 2) == 3 || userDate.indexOf('/', 2) == 4)
                        {
                            System.out.println(dateOutput(userDate));
                        }
                    }
                    else
                    {
                        if (userDate.indexOf('/', 3) == 4 || userDate.indexOf('/', 3) == 5) 
                        {
                            System.out.println(dateOutput(userDate));
                        }
                    }
                } 
                else
                {
                    System.out.println("Incorrect format.  Enter date as MM/DD/YYYY");
                }
            }    

        }
        
        // Close the input
        input.close();
    }
    
}