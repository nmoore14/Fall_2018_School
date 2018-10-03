import java.util.Scanner;

/**
 * -------------------------------------------------
 * File name: NickMoore_Project5_IntegerValidation.java
 * Project name: Integer Validation
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-3-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_Project5_IntegerValidation
{

    public static void generateHeader() 
    {
        System.out.println("====================================================");
        System.out.println("|      ______________________________________      |");
        System.out.println("|         /        Nick Moore Tech       \\         |");
        System.out.println("|        /         ***PRESENTS***         \\        |");
        System.out.println("|       /     Integer Input Validation     \\       |");
        System.out.println("|      /          with Statistics           \\      |");
        System.out.println("|      ______________________________________      |");
        System.out.println("|                                                  |");
        System.out.println("====================================================");
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Display the header information
        generateHeader();

        input.close();
    }
    
}