 import java.util.*;

 /**
 * -------------------------------------------------
 * File name: inClass_project3.java
 * Project name: In Class Project 3 - Alphabet Cities
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-26-2018
 * -------------------------------------------------
 * 
 */

public class inClass_project3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Create an ArrayList to store the users input
        List<String> cities = new ArrayList<String>();

        System.out.println("Please enter three(3) cities to sort alphabetically.");

        // Ask the user for three cites using an ArrayList
        for (int i = 1; i < 4; i++)
        {
            System.out.print("Enter city " + i + ": ");
            cities.add(input.nextLine().toUpperCase());
        }

        input.close();

        // Convert the ArrayList to an Array
        String[] cityArray = cities.toArray(new String[0]);

        // Sort the array
        Arrays.sort(cityArray);

        // Print the sorted array
        System.out.println("Sorted city list below...\n");

        int p = 1;
        for (int j = 0; j < cityArray.length; j++)
        {
            System.out.println("City " + p + ": " + cityArray[j]);
            p++;
        }
    }
    
}