import java.util.Scanner;

/**
 * ex2_2
 * @author nmoore2 (Nicholas Moore)
 * 8-30-2018
 */
public class ex2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the radius and length of the cylinder
        System.out.println("Please enter the radius and length of the cylinder");

        System.out.println("Radius:");
        double radius = input.nextDouble();

        System.out.println("Length:");
        double length = input.nextDouble();

        // Do the calculations and display the result
        double area = radius * radius * 3.14159;
        double volume = length * area;

        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of your cylinder is: " + volume);
    }
    
}