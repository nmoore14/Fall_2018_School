 import java.util.*;
 
 /**
 * -------------------------------------------------
 * File name: ex7_17
 * Project name: Chapter 7 Ex 17
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-31-2018
 * -------------------------------------------------
 * 
 */

public class ex7_17
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Prompt the user for the amount of students
		System.out.print("Enter the number of students: ");
		int studentCount = input.nextInt();

		System.out.println(studentCount);

		// Initialize the two arrays
		String[] names = new String[studentCount];
		double[] grades = new double[studentCount];
		String[] sortedNames = new String[studentCount];
		double[] sortedGrades = new double[studentCount];

		//TODO For loop to let the user enter the names and grades
		for(int i = 0; i < studentCount; i++)
		{
			System.out.print("Enter a student name: ");
			names[i] = input.next();

			System.out.print("Enter student grade: ");
			grades[i] = input.nextDouble();
		}

		// Close the input stream
		input.close();


		// Put the original grades array into a new array to sort
		for(int j = 0; j < studentCount; j++)
		{
			sortedGrades[j] = grades[j];
		}

		Arrays.sort(sortedGrades);
		System.out.println("");
		System.out.println("");
		
		for(int k = 0; k < studentCount; k++)
		{
			for(int p = 0; p < studentCount; p++)
			{
				if(grades[k] == sortedGrades[p])
				{
					sortedNames[p] = names[k];
				}
			}
		}

		for(int v = studentCount - 1; v >= 0; v--)
		{
			System.out.printf("%s - %.2f\n", sortedNames[v], sortedGrades[v]);
		}
		
	}
    
}