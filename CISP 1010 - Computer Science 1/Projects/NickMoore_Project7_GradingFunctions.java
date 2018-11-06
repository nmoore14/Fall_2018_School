import java.util.*;

/**
 * -------------------------------------------------
 * File name:  NickMoore_Project7_GradingFunctions
 * Project name: Grading Functions
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 11-05-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project7_GradingFunctions
{
		public static boolean isValidNumber(String gradeNum, boolean checkForFloat)
		{
			boolean validNumber = true;

			for (int i = 0; i < gradeNum.length(); i++)
			{
				char validChar = gradeNum.charAt(i);
				int validAscii = validChar;

				if (validAscii >= 9 && validAscii != 46)
				{
					validNumber = false;
				}
				else
				{
					validNumber = true;
				}
			}	
			return validNumber;
		}
    public static void main(String[] args) 
    {
			Scanner input = new Scanner(System.in);
			
			// Declare local variables
			boolean keepGoing = true;
			boolean floatNumber = false;
			String gradeNum;

			while(keepGoing)
			{
				System.out.print("\tEnter a grade: ");
				gradeNum = input.next();

				// Check the length of the input to see if the user might have entered the escape character
				if(gradeNum.length() == 1)
				{
					char userChar = gradeNum.charAt(0);
					int ascii = userChar;

					// Check to see if the character is D or d
					if(ascii == 68 || ascii == 100)
					{
						keepGoing = false;
					}
				}

				// Look for a decimal
				for(int i = 0; i < gradeNum.length(); i++)
				{
					char floatChar = gradeNum.charAt(i);
					int floatAscii = floatChar;
					int decimalCount = 0;

					if(decimalCount <= 1)
					{
						if (floatAscii == 46) 
						{
							floatNumber = true;
							decimalCount++;
						}
					}
					else
					{
						System.out.println("Invalid number format, try again");
					}
					
				}

				// Send the input to make sure it is a valid number
				// boolean validNumber = isValidNumber(gradeNum, floatNumber);
				// if(validNumber)
				// {

				// }
				// else
				// {

				// }
			}

			input.close();
			System.out.println("Thank you for playing");
    }
    
}