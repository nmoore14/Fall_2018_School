/**
 * ex1_4
 * @author nmoore2 (Nicholas Moore)
 * 8-30-2018
 */
public class ex1_4 {

    public static void main(String[] args) {
        int num = 1;

        // Display a table of squares and cubes
        System.out.println("a     a^2     a^3");
        while(num <= 4) {
            int square = num * num;
            int cube = num * num * num;

            System.out.println(num + "     " + square + "       " + cube);

            num++;
        }
    }
}