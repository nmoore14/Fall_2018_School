 import java.util.*;
 
 /**
 * -------------------------------------------------
 * File name: NickMoore_MidTerm.java
 * Project name: MidTerm Exam
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10/22/2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_MidTerm
{
    // TODO Create a class to verify user input is not an x or X
    // Return false if the user enter x or X
    public static boolean xCheck(String grades)
    {
        boolean keepGoing = true;

        for(int i = 0; i < grades.length(); i++)
        {
            int a = grades.charAt(i);

            if(a == 88 || a == 120)
            {
                keepGoing = false;
            }
        }

        return keepGoing;
    }

    public static String getLetterGrade(double avg)
    {
        String letterGrade;

        // Check to see where the users average falls
        if(avg >= 90)
        {
            letterGrade = "A";
        }
        else if(avg >= 80 && avg < 90)
        {
            letterGrade = "B";
        }
        else if(avg >= 70 && avg < 80)
        {
            letterGrade = "C";
        }
        else if(avg >= 60 && avg < 70)
        {
            letterGrade = "D";
        }
        else
        {
            letterGrade = "F";
        }

        return letterGrade;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;

        // Tell the user the input format and how many grades they can enter.
        System.out.printf("\tEnter 4 grades separated by commas. (e.g. 83,67,100,8)\n");

        while(keepGoing)
        {
            // Set the running sum total to 0 each time the while loop restarts
            double sum = 0;
            String letterGrade;

            // Ask the user for their grades.
            System.out.print("Enter grades or E(x)it: ");
            String grades = input.nextLine();
            
            // TODO Fix this check
            keepGoing = xCheck(grades);

            if(keepGoing)
            {
                // Break the numbers out of the string into their own index in the array.
                String array2[] = grades.split(",");

                if (array2.length != 4) 
                {
                    System.out.printf("Please enter 4 grades separated by commas. (e.g. 83,67,100,8)\n");
                } else {
                    // For each index that is in the array, convert to an int and add it to the sum.
                    for (int j = 0; j < 4; j++) 
                    {
                        sum += Integer.parseInt(array2[j]);
                    }

                    // Pass the number grade to the getLetterGrade class
                    double avg = sum / 4;
                    letterGrade = getLetterGrade(avg);

                    System.out.printf("\t\tGrade Average: %.2f grade: %s\n", avg, letterGrade);
                }
            }

            
            
            
        }

        System.out.printf("\t\t*** Goodbye ***\n");
        input.close();
    }
    
}