package stevens.week.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program 5 - Exercise 2.26 JHTP: Write an application that reads 2 integers, 
 * determines whether the first is a multiple of the second and prints the result. 
 * [Hint: Use the remainder operator.]
 * CSIS-212B02
 * Week 1 Assignment
 * Program 5
 * @author Kyle Stevens
 *
 */
public class ProgramFive {

	/**
	 * 
	 * @param int1
	 * @param int2
	 * @return int
	 */
	private int remainder(int int1, int int2) {
		return int1 % int2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 5\n");
		
		ProgramFive p5 = new ProgramFive();
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			try {
				// read Integer One
				System.out.print("Please enter Integer One: ");
				int int1 = scan.nextInt();
				
				// read Integer 2
				System.out.print("Please enter Integer Two: ");
				int int2 = scan.nextInt();
				
				System.out.println();
				// return Remainder
				int sum = p5.remainder(int1, int2);
				System.out.printf("Remainder: %d%n", sum);
				
						
				// give user an option to exit
				System.out.println("\n**Press 'e' to exit.\n");
				
			} catch(InputMismatchException e) {
				
				// ext option caught since Scanner is looking only for Integers
				if(scan.next().equals("e"))
					break;
				else {
					// Remind user of valid values
					System.out.println("****Please enter Integer values only****");
					System.out.println("**Press 'e' to exit.\n");
				}
			}
		}
		
		// close Scanner resource upon exit
		scan.close();
	}

}
