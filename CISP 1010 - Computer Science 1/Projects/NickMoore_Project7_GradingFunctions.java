import java.util.*;

import javax.lang.model.util.ElementScanner6;

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

	public static boolean checkGoing(String grade)
	{
		boolean going = true;

		char check = grade.charAt(0);
		int a = check;
		
		if( a == 68 || a == 100)
		{
			going = false;
		}

		return going;
	}

	public static boolean isValidNumber(String grade)
	{
		boolean isValid = true;
		int decimalCount = 0;

		for(int i = 0; i < grade.length(); i++)
		{
			char a = grade.charAt(i);
			int b = a;

			if(b != 46 && b < 48 || b > 57)
			{
				isValid = false;
				break;
			}

			if(b == 46)
			{
				decimalCount++;
			}

			if(decimalCount > 1)
			{
				isValid = false;
				break;
			}
		}

		return isValid;
	}

	public static boolean checkDouble(String grade)
	{
		boolean isDouble = false;
		int decimalCount = 0;

		for (int j = 0; j < grade.length(); j++) {
			char a = grade.charAt(j);
			int b = a;

			if (b == 46) 
			{
				decimalCount++;
			}
		}

		if (decimalCount == 1) {
			int decimalLocal = grade.indexOf('.') + 1;
			int result = grade.length() - decimalLocal;
			if(result <= 2)
			{
				isDouble = true;
			}			
		}

		return isDouble;
	}

	public static boolean checkInt(String grade) {
		boolean isInt = false;
		int iGrade = Integer.parseInt(grade);

		if(iGrade > 0 && iGrade <= 100)
		{
			isInt = true;
		}

		return isInt;
	}

	public static boolean checkDoubleRange(Double grade)
	{
		boolean inRange = false;

		if(grade > 0.00 && grade <= 100.00)
		{
			inRange = true;
		}

		return inRange;
	}

	public static char getLetterGrade(Double grade)
	{
		char stuGrade;

		if(grade >= 89.5)
		{
			stuGrade = 'A';
		}
		else if(grade >= 79.5 && grade < 89.5)
		{
			stuGrade = 'B';
		}
		else if(grade >= 69.5 && grade < 79.5)
		{
			stuGrade = 'C';
		}
		else if(grade >= 64.5 && grade < 69.5)
		{
			stuGrade = 'D';
		}
		else
		{
			stuGrade = 'F';
		}
			
		return stuGrade;
	}

	public static char getLetterGrade(int grade) {
		char stuGrade;

		if (grade >= 90) 
		{
			stuGrade = 'A';
		} 
		else if (grade >= 80 && grade < 90) 
		{
			stuGrade = 'B';
		} 
		else if (grade >= 70 && grade < 80) 
		{
			stuGrade = 'C';
		} 
		else if (grade >= 65 && grade < 70)
		{
			stuGrade = 'D';
		} 
		else 
		{
			stuGrade = 'F';
		}

		return stuGrade;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Variables
		boolean keepGoing = true;
		boolean validNumber = false;
		boolean validInt = false;
		boolean validDouble = false;
		boolean doubleInRange = true;

		while(keepGoing)
		{
			System.out.printf("%-10sEnter a grade: ", "");
			String grade = input.next();

			// Check to see if the user has entered a single character and if so is it 'd' or 'D'.
			if(grade.length() == 1)
			{
				keepGoing = checkGoing(grade);
			}
			else
			{
				// Pass the string to the validNumber function to see if it is an actual number
				validNumber = isValidNumber(grade);
				if (!validNumber) {
					System.out.println("Invalid grade. Try again.");
				}
				else
				{
					validDouble = checkDouble(grade);
					
					if(validDouble)
					{
						double dGrade = Double.parseDouble(grade);
						doubleInRange = checkDoubleRange(dGrade);
						if(doubleInRange)
						{
							char letterGrade = getLetterGrade(dGrade);
							System.out.printf("%-7sLetter grade for double: %s\n", "", letterGrade);
						}
						else
						{
							System.out.printf("Grade for double must be between 0.0 and 100.00.\n", "");
						}
						
					}
					else
					{
						validInt = checkInt(grade);
						if (validInt) 
						{
							int iGrade = Integer.parseInt(grade);
							char letterGrade = getLetterGrade(iGrade);
							System.out.printf("%-7sLetter grade for integer: %s\n", "", letterGrade);
						} 
						else 
						{
							System.out.printf("Grade for integer must be between 0 and 100.\n", "");
						}
					}
				}
			}
		}
		
		input.close();
		System.out.printf("%-10sThanks for playing.\n", "");
	}
    
}

