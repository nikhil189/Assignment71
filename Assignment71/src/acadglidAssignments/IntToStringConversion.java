/**
 * 
 */
package acadglidAssignments;

import java.util.Scanner;

/**
 * @author Nikhil
 * Purpose - Convert an integer variable to String
 */
public class IntToStringConversion {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- String args
	 * Return Type - void
	 */
	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println("Please enter the integer you want to convert into string"); // notify user to input integer value
			Scanner objScanner = new Scanner(System.in); // create and initialize scanner object to take user inputs
			int iUserInput  = objScanner.nextInt(); // takes user input for integer
			String strConvertedValue = String.valueOf(iUserInput); // converting user input into string
			System.out.println("Value after conversion------ \n" + strConvertedValue); // printing converted string
			objScanner.close(); // closing scanner object to prevent memory leakage
		}
		catch(Exception ex)
		{
			System.out.println("Invalid Input");
		}
	}

}
