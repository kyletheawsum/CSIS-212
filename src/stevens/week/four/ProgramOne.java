package stevens.week.four;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ProgramOne - Exercise 5.16 JHTP: Write a method isMultiple that determines, for a pair of integers, 
 * whether the second integer is a multiple of the first. The method will take 2 integer arguments and 
 * return true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator]. 
 * Incorporate this method into an application that inputs a series of pairs of integers (1 pair at a time) and 
 * determines whether the second value in each pair is a multiple of the first.
 * CSIS-212B02
 * Week 4 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
	
	private static boolean isMultiple(int x, int y) {
				
		if(x % y == 0) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 4: Program 1\n");
		
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop through, even if the user inputs an invalid character
		while(true) {
					
			// use a try/catch to handle invalid characters
			try {
				
				// read integer 1
				System.out.print("Enter Integer 1: ");
				int x = scan.nextInt();
				
				// read integer 1
				System.out.print("Enter Integer 2: ");
				int y = scan.nextInt();

				boolean isMultipleOf = isMultiple(x,y); 
				System.out.println(isMultipleOf);
				
				System.out.println("\n** Press 'e' to exit.\n");

			} catch(InputMismatchException e) {
				// ext option caught since Scanner is looking only for Integers
				if(scan.next().equals("e"))
					break;
				else {
					// Remind user of valid values
					System.out.println("**** Please enter Numeric values only ****");
					System.out.println("** Press 'e' to exit.\n");
				}
			}
		}
		
		// close the scanner
		scan.close();
	}

}
