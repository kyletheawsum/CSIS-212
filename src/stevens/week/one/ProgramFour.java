package stevens.week.one;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program 4 - Exercise 2.15 JHTP: Write an application that ask the user to enter 2 integers, 
 * obtains them from the user and prints their sum, product, difference and quotient (division). 
 * Use the techniques shown in Figure 2.7.
 * CSIS-212B02
 * Week 1 Assignment
 * Program 4
 * @author Kyle Stevens
 *
 */
public class ProgramFour {
	
	/**
	 * return sum of two integers
	 * @param int1
	 * @param int2
	 * @return int sum
	 */
	private int sum(int int1, int int2) {
		int sum = int1 + int2;
		return sum;
	}
	
	/**
	 * return difference of two integers
	 * @param int1
	 * @param int2
	 * @return int difference
	 */
	private int difference(int int1, int int2) {
		int difference = int1 - int2;
		return difference;
	}
	
	/**
	 * return product of two integers
	 * @param int1
	 * @param int2
	 * @return int product
	 */
	private int product(int int1, int int2) {
		int product = int1 * int2;
		return product;
	}
	
	/**
	 * return quotient of two integers
	 * @param int1
	 * @param int2
	 * @return double quotient
	 */
	private double quotient(int int1, int int2) {
		/**
		 * depending on user inputted values, resulting quotient will not always return an integer.
		 * to achieve greater accuracy, we convert to double and return a double
		 */
		
		// convert int values to type double
		double d1 = (double) int1;
		double d2 = (double) int2;
		
		double quotient = d1 / d2;
		return quotient;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 4\n");
		ProgramFour p4 = new ProgramFour();
		
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
				// return Sum
				int sum = p4.sum(int1, int2);
				System.out.printf("Sum: %d%n", sum);
				
				// return Difference
				int difference = p4.difference(int1, int2);
				System.out.printf("Difference: %d%n", difference);
				
				// return Product
				int product = p4.product(int1, int2);
				System.out.printf("Product: %d%n", product);
				
				// return Quotient
				double quotient = p4.quotient(int1, int2);
				System.out.printf("Quotient: %f%n", quotient);
						
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
