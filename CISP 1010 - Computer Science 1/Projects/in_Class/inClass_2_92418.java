import java.util.Scanner;

/**
 * ------------------------------------------------- 
 * File name: inClass_2_92418 
 * Project name: Grade Checker
 * ------------------------------------------------- 
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu Course and section: CISP 1010 A03 Creation
 * date: 9-24-2018 
 * -------------------------------------------------
 * 
 */

public class inClass_2_92418
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // TODO get the users score.
        System.out.print("What was your score: ");
        double grade = input.nextDouble();

        // TODO Check to see where the user score falls and print the appropriate message.
        if (grade >= 90) 
        {
            System.out.println("Well Done. You got an A.");
        } else if (grade >= 80 && grade < 90)
        {
            System.out.println("You could have done better. You got a B.");
        } else if (grade >= 70 && grade < 80)
        {
            System.out.println("Are you even trying? You got a C.");
        } else if (grade >= 65 && grade < 70)
        {
            System.out.println("Don't quit your day job. You got a D.");
        } else 
        {
            System.out.println("You may need tutoring. You got an F.");
        }
        input.close();
    }

}