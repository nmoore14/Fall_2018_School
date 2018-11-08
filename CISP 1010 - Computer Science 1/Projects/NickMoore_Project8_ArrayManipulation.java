import java.util.*;

/**
 * -------------------------------------------------
 * File name: NickMoore_Project8_ArrayManiputlation
 * Project name: Array Manipulation
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 11-07-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project8_ArrayManipulation
{
	public static boolean checkGoing(String userInputList)
	{
		boolean going = true;
		char a = userInputList.charAt(0);
		int b = a;

		if(b == 68 || b == 100)
		{
			going = false;
		}

		return going;
	}

    public static void main(String[] args) 
    {
			// Create the new scanner input object
			Scanner input = new Scanner(System.in);

			// Variables
			boolean keepGoing = true;
			
			while(keepGoing)
			{
				// Prompt the user to enter their values for the string array
				System.out.println("Enter whole, positive integers seperated by a space:");
				String userInputList = input.nextLine();

				if(userInputList.length() == 1)
				{
					keepGoing = checkGoing(userInputList);
				}
				else
				{
					System.out.println(userInputList);
				}
			}
			System.out.println("Thank your for playing.");
			input.close();
    }
    
}