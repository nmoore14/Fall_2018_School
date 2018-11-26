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
		for(int row = 0; row < 6; row++)
		{
			for(int col = 0; col < 7; col++)
			{
				if(board[row][col] != 'R' && board[row][col] != 'Y') {
					board[row][col] = '.';
				}
				System.out.print("[ " + board[row][col] + " ]");
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
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 7; col++) {
				if (board[row][col] == 'R' || board[row][col] == 'Y') {
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
			int colPos = Integer.parseInt(dropSelect) - 1;
			for(int row = 5; row >= 0; row--)
			{
				if(board[row][colPos] == '.')
				{
					board[row][colPos] = disk;
					System.out.println(colPos + " - " + row);
					System.out.println(board[row][colPos]);
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

		if(!isWinner)
		{
			for (int col = 0; col < 6; col++) 
			{
				for (int row = 5; row >= 0; row--) 
				{
					if (board[row][col] == discCheck) 
					{
						discCount++;
						if (discCount == 4) 
						{
							System.out.printf("The winner is: %s (%s)\n", player.toUpperCase(), discCheck);
							isWinner = true;
						}
					} else 
					{
						discCount = 0;
					}
				}
			}

			for (int row = 5; row >= 0; row--) 
			{
				for (int col = 0; col < 6; col++) 
				{
					if (board[row][col] == discCheck) 
					{
						discCount++;
						if (discCount == 4) 
						{
							System.out.printf("The winner is: %s (%s)\n", player.toUpperCase(), discCheck);
							isWinner = true;
						}
					} else {
						discCount = 0;
					}
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
					if(!isFull)
					{
						board = dropDisk(dropSelect, board, playerTurn);
						displayBoard(board);
						isWinner = isWinner(board, playerTurn);
						if(isWinner)
						{
							keepGoing = false;
						}
						else
						{
							playerTurn++;
							System.out.println("");
							isFull = isFull(board);
						}
					}
					else
					{
						keepGoing = false;
					}
				}
			}
		}
		System.out.println("Thank you for playing.\n");
		input.close();
	} 
}