import java.util.Scanner;
/**
 * ex2_4
 * @author nmoore2 (Nicholas Moore)
 */
public class ex2_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This program is going to take input from the user to convert pounds to kilograms.
        System.out.println("Let's convert pounds to kilograms");

        // Ask the user to input some value in pound
        System.out.println("Please enter pound: ");
        double pound = input.nextDouble();

        // Convert pound to kilograms
        System.out.println("Converting...");
        double kilogramConversion = pound * 0.454;

        // The results should tell the user their original and what it is in kilograms.
        // Display the results
        System.out.println(pound + " pound is " + kilogramConversion + " kilograms");
        input.close();
    }
}