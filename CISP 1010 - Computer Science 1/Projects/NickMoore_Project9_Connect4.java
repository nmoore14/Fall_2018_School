import java.util.*;

/**
 * -------------------------------------------------
 * File name: NickMoore_Project9_Connect4.java
 * Project name: Project 9 Connect 4
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 11/14/18
 * -------------------------------------------------
 * 
 */


public class NickMoore_Project9_Connect4
{

    public static void displayBoard(char[][] board)
    {
        System.out.println("  1   2   3   4   5   6   7");
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.print("[ " + board[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static boolean goingCheck(String dropSelect)
    {
        boolean keepGoing = true;

        char a = dropSelect.charAt(0);
        int b = a;

        if(b == 68 || b == 100)
        {
            keepGoing = false;
        }

        return keepGoing;
    }

    public static char[][] dropDisk(String dropSelect, char[][] board)
    {
        char[][] boardDrop = new char[6][7];
        char a = dropSelect.charAt(0);
        int b = a;

        if(b == 48 || b > 55)
        {
            System.out.println("Invalid entry, try again.");
        }
        else
        {
            int rowPos = Integer.parseInt(dropSelect) - 1;
            for(int v = 6; v > 0; v--)
            {
                if(boardDrop[rowPos][v] == ' ')
                {
                    boardDrop[rowPos][v] = 'X';
                    break;
                }
            }
        }
        return boardDrop;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Define the board array
        char[][] board = new char[6][7];

        boolean keepGoing = true;

        // Display the initial empty board
        displayBoard(board);

        while(keepGoing)
        {
            System.out.println("Please select a column to drop your disk (1-7).");
            System.out.println("'D' or 'd' to exit the game");
            System.out.print(">> ");
            String dropSelect = input.next();

            if(dropSelect.length() != 1)
            {
                System.out.println("Invalid entry");
            }
            else
            {
                keepGoing = goingCheck(dropSelect);
                if(keepGoing)
                {
                    board = dropDisk(dropSelect, board);
                    System.out.println("");
                    displayBoard(board);
                    System.out.println("");
                }
            }
        }
        System.out.println("Thank you for playing.");
        input.close();
    }
    
}