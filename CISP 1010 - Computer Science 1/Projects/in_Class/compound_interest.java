 import java.util.Scanner;

 /**
 * -------------------------------------------------
 * File name: compound_interest.java
 * Project name: Compound Interest
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 9-12-2018
 * -------------------------------------------------
 * 
 */

public class compound_interest
{
    public static void main(String[] args) 
    {
        //Formula for compound interest A=P(1+R)^N

        // TODO Ask the user what their principle is.
        double principleAmount = 10000;

        // TODO Ask the user their interest rate
        double interestRate = 0.05;

        // TODO Ask the user how many years
        int years = 5;

        for (int y = 1; y <= years; y++) 
        {
            // TODO use the doubles to figure out the interest
            double amount = principleAmount * Math.pow(1 + interestRate, y);

            System.out.printf("Year " + y + ": %.2f\n", amount);
        }
    }
    
}