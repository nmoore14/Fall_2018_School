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
		System.out.println("  1    2    3    4    5    6    7");
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 7; j++)
			{
				if(board[i][j] != 'R' && board[i][j] != 'Y') {
					board[i][j] = '.';
				}
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

	public static char[][] dropDisk(String dropSelect, char[][] board, int playerTurn)
	{
		char a = dropSelect.charAt(0);
		int b = a;

		char disk = 'R';

		if(playerTurn % 2 == 0)
		{
			disk = 'Y';
		}

		if(b <= 48 || b > 55)
		{
			System.out.println("Invalid entry, try again.");
		}
		else
		{
			int rowPos = Integer.parseInt(dropSelect) - 1;
			for(int v = 5; v >= 0; v--)
			{
				if(board[v][rowPos] == '.')
				{
					board[v][rowPos] = disk;
					System.out.println(rowPos + " - " + v);
					System.out.println(board[v][rowPos]);
					break;
				}
			}

			if(disk == 'R')
			{
				System.out.println("Player 2's turn");
			}
			else
			{
				System.out.println("Player 1's turn");
			}
		}
		return board;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Define the board array
		char[][] board = new char[6][7];

		boolean keepGoing = true;

		// Set up a counter for player turn
		int playerTurn = 1;

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
					board = dropDisk(dropSelect, board, playerTurn);
					playerTurn++;
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