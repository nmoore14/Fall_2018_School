/**
 * ex1_6
 * @author nmoore2 (Nicholas Moore)
 * 8-30-2018
 */
public class ex1_6 {

    public static void main(String[] args) {

        // Declare my variables to use in the while loop
        int num = 1;
        int sum = 0;

        // Run through the loop as long as int num does not go above 9
        // Add the current num to the sum during earch go through
        while(num <= 9) {
            sum += num;
            num++;
        }

        // Display the results
        System.out.println("The sum of all numbers 1 though 9 is: " + sum);
        
    }
}