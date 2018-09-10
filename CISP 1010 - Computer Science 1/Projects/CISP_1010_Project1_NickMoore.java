/**
 * ------------------------------------------------- 
 * File name: CISP_1010_Project1-NickMoore
 * Project name: CISP 1010 Project 1: Celsius to Fahrenheit
 * ------------------------------------------------- 
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu Course and section: CISP 1010 A03 Creation
 * date: ${date} 
 * -------------------------------------------------
 * 
 */
public class CISP_1010_Project1_NickMoore 
{

	public static void main(String[] args) 
	{
		// Create a new scanner object for the app

        // Display what the program is for.
        // TODO have java display a message saying that this is to convert celsius to fahrenheit
        System.out.println("Welcome to Celsius to Fahrenheit Convertor.");
        
        // Set the celsius value to convert
		double celsius = 55.608;

        // Create a variable that contains the formula to convert from celsius to fahrenheit
		// TODO create var tempConversion to store the formula
		var tempConversion = (9.0 / 5) * celsius + 32;

        // After the conversion is done, display the result
		// TODO create a message that concatenates the tempConversion variable and a string to disply the results
		System.out.println("Conversion in process...");
		System.out.println(celsius + " degress celcius is: " + tempConversion + "F");

    }

}
