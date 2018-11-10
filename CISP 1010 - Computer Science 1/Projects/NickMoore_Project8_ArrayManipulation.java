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

	public static boolean checkNumber(String userInputList)
	{
		boolean isPosNumber = false;
		for(int i = 0; i < userInputList.length(); i++)
		{
			char a = userInputList.charAt(i);
			int b = a;

			if (b != 32)
			{
				if (b >= 48 && b <= 57)
				{
					isPosNumber = true;
				} 
				else
				{
					isPosNumber = false;
					break;
				}
			} 
		}

		return isPosNumber;
	}

	public static Integer[] userArray(String userInputList)
	{
		String[] userArray = userInputList.split(" ");
		Integer[] numArray = new Integer[userArray.length];

		for (int j = 0; j < userArray.length; j++)
		{
			numArray[j] = Integer.parseInt(userArray[j]);
			System.out.println(numArray[j]);
		}
		
		return numArray;
	}

	public static int findMax(Integer[] userIntArray)
	{
		int k = userIntArray.length - 1;
		int maxNum = userIntArray[k];
		return maxNum;
	}

	public static int findMin(Integer[] userIntArray)
	{
		int minNum = userIntArray[0];

		return minNum;
	}

	public static void main(String[] args) 
	{
		// Create the new scanner input object
		Scanner input = new Scanner(System.in);

		// Variables
		boolean keepGoing = true;
		boolean isPositiveNumber = false;
		
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
				// Check to make sure only whole, positive numbers where entered
				isPositiveNumber = checkNumber(userInputList);
				if (isPositiveNumber)
				{
					// Convert the user input into an array
					Integer[] userIntArray = userArray(userInputList);
					Arrays.sort(userIntArray);

					// Run the array throught the different methods
					int max = findMax(userIntArray);
					System.out.printf("Maximum: %s\n", max);
					
					int min = findMin(userIntArray);
					System.out.printf("Minimum: %s\n", min);

					System.out.printf("Ordered Array: %s\n", Arrays.toString(userIntArray));
				}
				else
				{
					System.out.println("Invalid number entry, try again");
				}
				
			}
		}
		System.out.println("Thank your for playing.");
		input.close();
	}
    
}