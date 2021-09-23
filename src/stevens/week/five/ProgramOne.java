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
		int product = 1;
		
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
					
			// use a try/catch to handle invalid characters
			try {
				
				System.out.print("Enter integers, separated by a space (\" \"): ");
				String[] integers = scan.nextLine().split(" ");
				//System.out.println(integers.length);
				Integer[] intArray = new Integer[integers.length];
				
				
				
				for(int i = 0; i < integers.length; i++) {
					
					intArray[i] = Integer.parseInt(integers[i]);
				}
				
				
				System.out.println(product(intArray));
				
//				for(int i = 0; i < intArray.length; i++) {
//					System.out.println(intArray[i]);
//				}

				
			} catch(Exception e) {
				// ext option caught since Scanner is looking only for Integers
				if(scan.next().contains("e"))
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
