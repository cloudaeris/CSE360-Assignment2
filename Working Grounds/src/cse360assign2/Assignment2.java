//Name: Perot Nguyen
//CSE 360 M-3:10
//Assignment: 2
// This is not a file header
package cse360assign2;
import java.util.*;

public class Assignment2 {
	/** 	
	 * @author Perot Nguyen, CSE360 M-3:10, Class ID: 508, Assignment 2
	 * @version "%I%, %G%"
	 * 
	 * Assignment2 is the Main file which is shaped as a menu 
	 * <p>
	 */
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		String check; 
		int value = 0;
		try
		{		
			do // do actions from the menu repeatedly until user wants to quit (Q)
			{
				printMenu();     // print out menu
				check= scan.nextLine().toUpperCase(); 
				while(!(check.matches("A|S|M|D|G|T|Q")) || !(check.length() == 1)) 
				{
					System.out.println("-----Invalid input, try again.-----");
					check=scan.nextLine().toUpperCase();
				}	// Checks to see if user input is able to be used in the menu.

				switch (check) { // do actions based on user's correct input
				case "A": 	// addition to value
					System.out.println("\nEnter an integer value to be added to: "+ calc.getTotal());
					value = scan.nextInt();
					calc.add(value);
					scan.nextLine();	// absorb any remaining elements
					
					break;
				case "S":	//subtraction to value
					System.out.println("\nEnter an integer value to be subtracted from: "+ calc.getTotal());
					value = scan.nextInt();
					calc.subtract(value);
					scan.nextLine();	// absorb any remaining elements
					break;
				case "M":	//multiplying the value
					System.out.println("\nEnter an integer value to be multiplied with: "+ calc.getTotal());
					value = scan.nextInt();
					calc.multiply(value);
					scan.nextLine();	// absorb any remaining elements
					break;
				case "D":
					System.out.println("\nEnter an integer value to be divide the value: "+ calc.getTotal());
					value = scan.nextInt();
					calc.divide(value);
					scan.nextLine();	// absorb any remaining elements
					break;
				case "G":
					System.out.println("History:\n" + calc.getHistory());
					break;
				case "T":
					System.out.println("Current Value: " + calc.getTotal());
					break;
				case "Q":	// quit the program
					break;
				}
			}while(!(check.toUpperCase().matches("Q")));			
		} // try the code and throw any errors
		catch (Exception exception)
		{
			System.out.println("Exception Error Occurred: " + exception);
			// catch any thrown errors and print out an error message*/
			
		}
		scan.close(); // close Scanner
	}
	
	
	/*
	 * printMenu() prints out a string value that creates structure to the menu interface.
	 */
	public static void printMenu()
	{
		System.out.print("\nAscending List: Enter an option\n" +
				"Choice\t\tAction\n" +
				"------\t\t------\n" +
				"A\t\tAdd Integer\n" +
				"S\t\tSubtract Integer\n" +
				"M\t\tMultiply Integer\n" +
				"D\t\tDivide Integer\n" +
				"G\t\tGet Action History\n" +
				"T\t\tGet Current Total\n" +
				"Q\t\tQuit\n");
	}
}
