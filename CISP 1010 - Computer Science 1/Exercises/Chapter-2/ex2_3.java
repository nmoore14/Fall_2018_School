import java.util.Scanner;

/**
 * ex2_3
 * @author nmoore2 (Nicholas Moore)
 * 9-5-2018
 */
public class ex2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This program is going to take input from the user to convert feet to meters.
		System.out.println("Let's convert feet to meters");

        // TODO ask the user to input some value in feet
        System.out.println("Please enter feet: ");
     	double feet = input.nextDouble();
		
		 // TODO convert feet to meters
		System.out.println("Converting...");
		double meterConversion = feet * 0.305;

        // The results should tell the user their original and what it is in meters.
		// TODO Display the results
		System.out.println(feet + " feet is " + meterConversion + " meters");
    }
}