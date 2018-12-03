import java.util.*;

/**
 * -------------------------------------------------
 * File name: shipDesk.java
 * Project name: Project 10 Ship Desk
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 11-28-2018
 * -------------------------------------------------
 * 
 */

public class shipDesk
{
	public static boolean goingCheck(String boxCount) 
	{
		boolean keepGoing = true;

		char a = boxCount.charAt(0);
		int b = a;

		if (b == 68 || b == 100) {
			keepGoing = false;
		}

		return keepGoing;
	}

	public static boolean isValidInt(String boxEntry)
	{
		boolean isValidInt = false;

		for(int i = 0; i < boxEntry.length(); i++)
		{
			char a = boxEntry.charAt(i);
			int b = a;

			if(b >= 48 && b <= 57)
			{
				isValidInt = true;
			}
			else
			{
				isValidInt = false;
				break;
			}

		}

		return isValidInt;
	}

	public static boolean isNum(String numCheck) {
		boolean isNum = false;

		for (int i = 0; i < numCheck.length(); i++) {
			char a = numCheck.charAt(i);
			int b = a;

			if (b >= 48 && b <= 57) {
				isNum = true;
			} else {
				isNum = false;
				break;
			}

		}

		return isNum;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		boolean keepGoing = true;
		boolean isValidInt = true;
		boolean isNum = true;

		int totalSurface = 0;
		int totalVolume = 0;
		
		while(keepGoing)
		{
			System.out.println("How many boxes would you like to ship? ('D' or 'd' to exit)");
			String boxEntry = input.next();

			keepGoing = goingCheck(boxEntry);
			if(keepGoing)
			{
				isValidInt = isValidInt(boxEntry);

				if(isValidInt)
				{
					int boxCount = Integer.parseInt(boxEntry);

					Box[] boxes = new Box[boxCount];
					int[][] boxesArray = new int[boxCount][3];


					// Store all of your boxes in the array to pass to the object later.
					for(int i = 0; i < boxesArray.length; i++)
					{
						int boxNum = i + 1;

						System.out.print("Box " + boxNum + " height: ");
						String height = input.next();

						isNum = isNum(height);
						if(isNum)
						{
							boxesArray[i][0] = Integer.parseInt(height);
						}
						else
						{
							System.out.println("Invalid height, must be whole, positive numbers");
						}

						System.out.print("Box " + boxNum + " width: ");
						String width = input.next();
						isNum = isNum(width);
						if (isNum) 
						{
							boxesArray[i][1] = Integer.parseInt(width);
						} else 
						{
							System.out.println("Invalid width, must be whole, positive numbers");
						}
						
						System.out.print("Box " + boxNum + " length: ");
						String length = input.next();
						isNum = isNum(length);
						if (isNum) 
						{
							boxesArray[i][2] = Integer.parseInt(length);
						} else 
						{
							System.out.println("Invalid length, must be whole, positive numbers");
						}
						System.out.println();
					}

					// pass each boxArray item to the objec class
					for(int j = 0; j < boxes.length; j++)
					{
						int h = boxesArray[j][0];
						int w = boxesArray[j][1];
						int l = boxesArray[j][2];
						boxes[j] = new Box(h, w, l);
					}

					for(int v = 0; v < boxes.length; v++)
					{
						System.out.printf("Box %s - Surface area: %s | Volume: %s\n", v, boxes[v].calculatedSurfaceArea(), boxes[v].calculatedVolume());
						totalSurface += boxes[v].calculatedSurfaceArea();
						totalVolume += boxes[v].calculatedVolume();
					}

					System.out.printf("Total Surface Area for all boxes: %s\n", totalSurface);
					System.out.printf("Total Volume for all boxes: %s\n\n", totalVolume);

				}
				else
				{
					System.out.println("Invalid entry.  Must be whole, positive integers.");
				}
			}
		}
		input.close();
	}
    
}