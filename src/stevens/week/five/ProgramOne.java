package stevens.week.five;

import java.util.Scanner;

/**
 * Program One - Exercise 6.14 JHTP: (Variable-Length Argument List) Write an application that calculates the product 
 * of a series of integers that are passed to method product using a variable-length argument list. Test your 
 * method with several calls, each with a different number of arguments.
 * CSIS-212B02
 * Week 5 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {

	private static int product(Integer[] intArray) {
		// product = 1 to initialize
		int product = 1;
		
		// multiply product
		for(int i = 0; i < intArray.length; i++) {
			product *= intArray[i];
		}
		
		if(product > 0) {
			return product;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 5: Program 1\n");

		Scanner scan = new Scanner(System.in);
		
		// loop through, even if the user inputs an invalid character
		while(true) {
			
			// declare string outside of try/catch to use it in the catch clause
			String values = "";
			
			// use a try/catch to handle invalid characters
			try {
				
				System.out.print("Enter integers, separated by a space (\" \"): ");
				values = scan.nextLine();
				
				// check if values are only integers
				// if not, throw a NumberFormatException
				if(!values.matches("([0-9]\\s?)+|e")) {
					throw new NumberFormatException();
				}
				
				// convert input to an array to iterate through and convert to integers
				String[] integers = values.split(" ");
				
				// create integer array the same length as the string array
				Integer[] intArray = new Integer[integers.length];
				
				// store inputted integers in integer array
				for(int i = 0; i < integers.length; i++) {
					intArray[i] = Integer.parseInt(integers[i]);
				}
				
				// return product
				System.out.println(product(intArray));
								
			} catch(NumberFormatException e) {
				if(values.contains("e"))
					break;
				// Remind user of valid values
				System.out.println("**** Please enter Integer values only ****");
				System.out.println("** Press 'e' to exit.\n");
			}
			catch(Exception e) {
				// ext option caught since Scanner is looking only for Integers
				if(values.contains("e"))
					break;
				else {
					// Remind user of valid values
					System.out.println("**** Please enter Integer values only ****");
					System.out.println("** Press 'e' to exit.\n");
				}
			}
		}
		
		scan.close();
	}
}
