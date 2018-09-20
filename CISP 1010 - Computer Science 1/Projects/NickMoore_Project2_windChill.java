 import java.util.Scanner;
 
 /**
 * -------------------------------------------------
 * File name: project2_windChill.java
 * Project name: Project 2 Wind Chill
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-19-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project2_windChill 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Display the program welcome message
        System.out.println("====================================================");
        System.out.println("|      ______________________________________      |");
        System.out.println("|         /        Nick Moore Tech       \\         |");
        System.out.println("|        /         ***PRESENTS***         \\        |");
        System.out.println("|       /    Wind-Chill Index Calculator   \\       |");
        System.out.println("|      ______________________________________      |");
        System.out.println("|                                                  |");
        System.out.println("====================================================");

        // Get a double for outsideTemp
        System.out.print("Please enter a value for the temperature (F): ");
        double outsideTemp = input.nextDouble();

        // Check if the outsideTemp is between -58 and 70 degrees F
        if (outsideTemp < -58.0 || outsideTemp > 70.0)
        {
            System.out.println("Your temperature must be greater than -58.0F and less than 70.0F");
            System.exit(1);
        }
        else
        {
            // If the temp is correct ask for the wind velocity
            System.out.print("Please enter a value for wind velocity (MPH): ");
            double velocity = input.nextDouble();

            // Check to see if the velocity is greater than 2.0
            if (velocity < 2.0 )
            {
                System.out.println("Your wind velocity must be greater than 2.0 MPH.");
                System.exit(1);
            }
			else
			{
                // If wind and temp check out calculate the wind-chill index
                double windChill = 35.74 + 0.6215 * outsideTemp - 35.75 * Math.pow(velocity, 0.16)
                        + 0.4275 * outsideTemp * Math.pow(velocity, 0.16);
                System.out.printf("The current wind-chill index is: %.2f\n", windChill);
            }
        } 
        input.close();
    }
    
}