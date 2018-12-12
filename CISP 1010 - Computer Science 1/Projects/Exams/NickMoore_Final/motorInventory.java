 import java.util.*;
 /**
 * -------------------------------------------------
 * File name: MotorInventory.java
 * Project name: Motor Iventory
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 12/12/2018
 * -------------------------------------------------
 * 
 */

public class motorInventory
{
	public static boolean checkGoing(String motorInventory)
	{
		boolean going = true;

		char a = motorInventory.charAt(0);
		int b = a;

		if(b == 68 || b == 100)
		{
			going = false;
		}

		return going;
	}

	public static boolean validInt(String motorInventory)
	{
		boolean isValid = true;
		int decimalCount = 0;
		for(int i = 0; i < motorInventory.length(); i++)
		{
			char a = motorInventory.charAt(i);
			int b = a;

			if(b != 46 && b < 48 || b > 57)
			{
				isValid = false;
				break;
			}

			if(b == 46)
			{
				decimalCount++;
			}

			if(decimalCount > 0)
			{
				isValid = false;
				break;
			}
		}
		return isValid;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		boolean keepGoing = true;

		while(keepGoing)
		{
			System.out.print("Enter the number of motors in inventory (d or D to exit): ");
			String motorInventory = input.next();

			keepGoing = checkGoing(motorInventory);

			if(keepGoing)
			{
				boolean motorCountValid = validInt(motorInventory);
				if(motorCountValid)
				{
					int motorCount = Integer.parseInt(motorInventory);

					Motor[] motors = new Motor[motorCount];
					int[][] motorArray = new int[motorCount][2];

					for(int i = 0; i < motorArray.length; i++)
					{
						int motorNum = i + 1;
						
						System.out.println("\nMotor " + motorNum + ":");

						System.out.printf("Enter the maximum RPM for this motor: ");
						String engineRPM = input.next();
						boolean rpmValid = validInt(engineRPM);

						if(rpmValid)
						{

							int rpm = Integer.parseInt(engineRPM);
							motorArray[i][0] = rpm;

							System.out.printf("Enter ft/lbs torque at this RPM: ");
							String motorTorque = input.next();
							boolean torqueValid = validInt(motorTorque);

							if(torqueValid) 
							{
								int torque = Integer.parseInt(motorTorque);
								motorArray[i][1] = torque;
							} 
							else 
							{
								System.out.println("Invalid Torque entry. Please enter a whole, positive number.");
								i--;
							}
						}
						else
						{
							System.out.println("Invalid Horsepower entry. Please enter a whole, positive number.");
							i--;
						}
					}
					System.out.println();
					double totalHP = 0;
					// pass each motorArray item to the objec class
					for (int j = 0; j < motorArray.length; j++) {
						int motorRPM = motorArray[j][0];
						int motorTorque = motorArray[j][1];
						motors[j] = new Motor(motorRPM, motorTorque);
					}

					for (int v = 0; v < motors.length; v++) {
						System.out.printf("Motor %s - Horsepower: %s\n", v + 1, motors[v].calculatedHP());
						totalHP += motors[v].calculatedHP();
					}

					double avgHP = totalHP / motorArray.length;

					System.out.printf("Average Horsepower for all motors in inventory: %.2f\n\n", avgHP);
				}
				else
				{
					System.out.println("Invalid motor count. Please enter a whole, positive number.");
				}
			}
		}
		System.out.println("\n\nGoodbye\n\n");
		input.close();
	}
    
}