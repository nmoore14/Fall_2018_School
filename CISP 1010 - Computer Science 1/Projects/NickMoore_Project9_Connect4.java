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
	// Display the board.
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

	// Check to see if the user has entered the escape character.
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

	// Check to see if the board is full.
	public static boolean isFull(char[][] board)
	{
		boolean isFull = false;
		int totalCells = 42;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] == 'R' || board[i][j] == 'Y') {
					totalCells--;
				}
			}
		}

		if (totalCells > 0)
		{
			isFull = false;
			System.out.printf("Remaining cells: %s\n", totalCells);
		}
		else
		{
			isFull = true;
			System.out.printf("Board is Full!\n");
		}

		return isFull;
	}

	// Drop the disc where the player has selected and put the proper character for player turn.
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

	// Check to see if there is a winner either across or vertical.
	public static boolean isWinner(char[][] board, int playerTurn)
	{
		boolean isWinner = false;
		String player = "Player 1";
		char discCheck = 'R';
		int discCount = 0;

		if(playerTurn % 2 == 0)
		{
			player = "Player 2";
			discCheck = 'Y';
		}

		for(int row = 5; row >= 0; row--)
		{
			for(int col = 0; col < 7; col++)
			{
				if(board[row][col] == discCheck)
				{
					discCount++;
					if(discCount == 4)
					{
						isWinner = true;
						System.out.printf("The winner is: %s\n", player.toUpperCase());
					}
				}
				else
				{
					discCount = 0;
				}
			}
		}

		return isWinner;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		// Define the board array
		char[][] board = new char[6][7];

		boolean keepGoing = true;
		boolean isFull = false;
		boolean isWinner = false;

		// Set up a counter for player turn
		int playerTurn = 1;

		// Display the initial empty board
		displayBoard(board);

		while(keepGoing && !isFull)
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
					if(!isFull)
					{
						board = dropDisk(dropSelect, board, playerTurn);
						playerTurn++;
						System.out.println("");
						displayBoard(board);
						isWinner(board, playerTurn);
						if(isWinner)
						{
							keepGoing = false;
						}
						System.out.println("");
						isFull = isFull(board);
					}
				}
			}
		}
		System.out.println("Thank you for playing.\n");
		input.close();
	} 
}