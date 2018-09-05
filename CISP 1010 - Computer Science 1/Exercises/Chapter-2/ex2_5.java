import java.util.Scanner;

/**
 * ex2_5
 * @author nmoore2 (Nicholas Moore)
 * 9-5-2018
 */

public class ex2_5 {
	/**
	 * 
	 * @param args
	 * 
	 */

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Program to determine the check total with gratuity
		System.out.println("Please enter the check amount and the gratuity that you would like to pay.");
		// TODO get the check total and gratuity from the user
		System.out.println("Check total before gratuity:");
		double preTotal = input.nextDouble();

		System.out.println("Gratuity Percentage:");
		double enteredGratuity = input.nextDouble();
		double gratuity = enteredGratuity / 100;

		// TODO multiply the total with the gratuity to get the dollar amount to add.
		double gratuityAmount = preTotal * gratuity;

		// TODO add the calculated dollar amount to the check total
		double finalCheck = preTotal + gratuityAmount;

		// TODO Display the result of the gratuity and then the total check amount
		System.out.println("The gratuity is " + gratuityAmount + ", and the total check is " + finalCheck + ".");
		input.close();

    }
}