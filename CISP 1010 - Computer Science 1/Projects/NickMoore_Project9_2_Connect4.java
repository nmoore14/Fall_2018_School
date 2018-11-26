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


public class NickMoore_Project9_2_Connect4
{

	// Display the board.  Replace any empty cells with '.'.
	public static void displayBoard(char[][] board) {
		System.out.println("  1    2    3    4    5    6    7");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] != 'R' && board[i][j] != 'Y') {
					board[i][j] = '.';
				}
				System.out.print("[ " + board[i][j] + " ]");
			}
			System.out.println("");
		}
	}

	// Check the user input to see if they are wanting to exit the game.
	public static boolean goingCheck(String dropSelect) {
		boolean keepGoing = true;

		char a = dropSelect.charAt(0);
		int b = a;

		if (b == 68 || b == 100) {
			keepGoing = false;
		}
		return keepGoing;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Define the booleans to keep the game going
		boolean keepGoing = true;

		// Define the board array
		char[][] board = new char[6][7];
		displayBoard(board);

		while(keepGoing)
		{
			System.out.println("Please select a column to drop your disk (1-7).");
			System.out.println("'D' or 'd' to exit the game");
			System.out.print(">> ");
			String dropSelect = input.next();

			if (dropSelect.length() != 1) 
			{
				System.out.println("Invalid entry");
			} 
			else 
			{
				keepGoing = goingCheck(dropSelect);
			}
		}
		System.out.println("Thank you for playing.");
		input.close();
	} 
}