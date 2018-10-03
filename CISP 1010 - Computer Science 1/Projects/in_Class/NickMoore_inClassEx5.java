 /**
 * -------------------------------------------------
 * File name: NickMoore_inClassEx5.java
 * Project name: In Class Exercise 4c
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 10-3-2018
 * -------------------------------------------------
 * 
 */

public class NickMoore_inClassEx5
{
    public static void main(String[] args) 
    {
        // Use a nested loop to display your name and course number 5 times
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nNick Moore | ");
            for(int j = 0; j < 5; j++)
            {
                System.out.printf("%-4sCISP 1010", "");
            }
            System.out.println("");
        }

       
    }
    
}