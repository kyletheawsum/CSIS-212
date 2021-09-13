package stevens.week.four;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ProgramOne - Exercise 5.20 (Circle Area): Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle.
 * CSIS-212B02
 * Week 3 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramTwo {
	
	private static final double PI = Math.PI;
	
	private static double circleArea(double radius) {
		
		//double area = PI * Math.pow(radius, 2);
		double area = PI * (radius * radius);
		
		return area;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 4: Program 2\n");
		
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop through, even if the user inputs an invalid character
		while(true) {
					
			// use a try/catch to handle invalid characters
			try {
				
				// read Radius 
				System.out.print("Enter Radius: ");
				int x = scan.nextInt();
				
				System.out.println(circleArea(x));
				
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
