import java.util.*;

// 13 2 100 75 1 23 89 44 91 35 41 50

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

	public static double findAverage(Integer[] userIntArray)
	{
		double sum = 0;
		double avgNum = 0;
		for (int v = 0; v < userIntArray.length; v++)
		{
			sum += userIntArray[v];
		}

		avgNum = sum / userIntArray.length;

		return avgNum;
	}

	public static double findMedian(Integer[] userIntArray)
	{
		double medianNum = 0;

		if (userIntArray.length % 2 == 0)
		{
			int num1index = (userIntArray.length / 2) - 1;
			int num2index = num1index + 1;
			double num1 = userIntArray[num1index];
			double num2 = userIntArray[num2index];
			medianNum = ( num1 + num2 ) / 2;
		}
		else
		{
			int medianNumIndex = 0;
			medianNumIndex = Math.round(userIntArray.length / 2);
			medianNum = userIntArray[medianNumIndex];
		}

		return medianNum;
	}

	public static void linearSearch(Integer[] userArray2, int searchNum)
	{
		int steps = 0;
		for (int r = 0; r < userArray2.length; r++)
		{
			steps++;
			if (userArray2[r] == searchNum)
			{
				System.out.printf("Linear counter: %s\n", steps);
				System.out.printf("My Lineear search index: %s\n", r);
			}
		}
	}

	public static void binarySearch(Integer[] userIntArray, int searchInt)
	{
		int low = 0;
		int high = userIntArray.length - 1;
		int steps = 0;

		while (low <= high)
		{
			int mid = (low + high) / 2;
			if(userIntArray[mid] < searchInt)
			{
				low = mid + 1;
			}
			else if (userIntArray[mid] > searchInt)
			{
				high = mid -1;
			}
			else if (userIntArray[mid] == searchInt)
			{
				System.out.printf("Binary counter: %s\n", steps);
				System.out.printf("My Binary search index: %s\n\n", mid);
				break;
			}
			steps++;
		}
	}

	public static void main(String[] args) 
	{
		// Create the new scanner input object
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		// Variables
		boolean keepGoing = true;
		boolean isPositiveNumber = false;
		
		while(keepGoing)
		{
			// Prompt the user to enter their values for the string array
			System.out.println("Enter whole, positive integers seperated by a space or 'D'/'d' to exit");
			System.out.println("Ex: 13 2 100 75 1 23 89 44 91 35 41 50");
			System.out.print(">>");
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
					Integer[] userArray2 = userArray(userInputList);
					Arrays.sort(userIntArray);

					// Run the array throught the different methods
					// Find the max number
					int max = findMax(userIntArray);
					System.out.printf("\nMaximum: %s\n", max);
					
					// Find the minimum numbet
					int min = findMin(userIntArray);
					System.out.printf("Minimum: %s\n", min);

					// Find the average
					double average = findAverage(userIntArray);
					System.out.printf("Average: %s\n", average);

					// Find the mediam
					double median = findMedian(userIntArray);
					System.out.printf("Median: %s\n", median);

					String displayString = Arrays.toString(userIntArray).replaceAll(",", "").replaceAll("\\[", "").replaceAll("\\]","");;

					System.out.printf("Ordered Array: %s\n\n", displayString);

					System.out.print("Enter a number to search for from your list: ");
					int searchNum = input2.nextInt();

					linearSearch(userArray2, searchNum);
					binarySearch(userIntArray, searchNum); 

				}
				else
				{
					System.out.println("Invalid number entry, try again");
				}
				
			}
		}
		System.out.println("Thank your for playing.");
		input.close();
		input2.close();
	}
    
}