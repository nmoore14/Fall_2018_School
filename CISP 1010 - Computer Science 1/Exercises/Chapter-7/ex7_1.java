 import java.util.*;
 
 /**
 * -------------------------------------------------
 * File name: ex7_1.java
 * Project name: Exercise 7.1
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-29-2018
 * -------------------------------------------------
 * 
 */

public class ex7_1
{

    public static String getLetter(double grade)
    {
        if(grade >= 90)
        {
            return letterGrade = "A";
        }
        else if (grade >= 80 && grade < 90)
        {
            return letterGrade = "B";
        }
        else if (grade >= 70 && grade < 80)
        {
            return letterGrade = "C";
        }
        else if (grade >= 60 && grade < 70)
        {
            return letterGrade = "D";
        }
        else
        {
            return letterGrade = "F";
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String letterGrade;

        
        //Prompt the user for the total amount of students
        System.out.println("Please enter the amount of students");
        int n = input.nextInt();
        double grades[] = new double[n];

        //Prompt the user to enter a grade for each student
        for(int i = 0; i < n; i++)
        {
            System.out.print("Grade for student " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        input.close();

        //Get the letter grade for each student
        for (int j = 0; j < n; j++) {
            int student = j + 1;
            letterGrade = getLetter(grades[j]);
            System.out.printf("Student %s's grade is: %.2f - %s\n", student, grades[j], letterGrade);
        }
    }
    
}