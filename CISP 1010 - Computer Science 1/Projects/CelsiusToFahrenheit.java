import java.util.Scanner;

/**
 * CelsiusToFahrenheit
 * @author nmoore2 (Nicholas Moore)
 * @category Project 1 (Celsius to Fahrenheit)
 * @version 1.0
 * Date: 8-29-2018
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
		// Create a new scanner object for the app
		Scanner input = new Scanner(System.in);

        // Display what the program is for.
        // TODO have java display a message saying that this is to convert celsius to fahrenheit
        System.out.println("Welcome to Celsius to Fahrenheit Convertor.");
        
        // Ask the user what degree celsius they would like to convert
        // TODO create a variable to store the user input
		// TODO ask the user for their number
		System.out.println("Please enter a celsius value:");
		double celsius = input.nextDouble();

        // Create a variable that contains the formula to convert from celsius to fahrenheit
		// TODO create var tempConversion to store the formula
		var tempConversion = (9.0 / 5) * celsius + 32;

        // After the conversion is done, display the result
		// TODO create a message that concatenates the tempConversion variable and a string to disply the results
		System.out.println("Conversion in process...");
		System.out.println(celsius + " degress celcius is: " + tempConversion + "F");
    }

}