package stevens.week.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program One - Exercise 8.4 JHTP (Rectangle Class): Create a class Rectangle with attributes length and 
 * width, each of which defaults to 1. Provide methods that calculate the rectangle's perimeter and 
 * area. Use set and get methods for both length and width. The set methods will verify that length 
 * and width are each floating-point numbers larger than 0.0 and less than 20.0. Write a program to 
 * test class Rectangle. 
 * CSIS-212B02
 * Week 6 Assignment Chapter 7
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {

	public static void main(String[] args) {
//		Shape rectangle = new Rectangle((float) 3.123456, (float) 4.654321);
//		
//		System.out.println(rectangle.calculateArea());
//		System.out.println(rectangle.calculatePerimeter());
		
		System.out.println("Kyle Stevens - Assignment 3: Program 2\n");

		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop through all three employee wages, even if the user inputs an invalid character
		while(true) {
					
			float length = 0, width = 0;

			// use a try/catch to handle invalid characters
			try {				
				while(length == 0 || width == 0) {
					System.out.println("1. Set Length");
					System.out.println("2: Set width");
					System.out.println("3: Exit");
					System.out.print("Choice: ");
					
					Integer selection = scan.nextInt();
					if(selection == 1) {
						System.out.print("Set Length: ");
						length = Float.parseFloat(scan.next());
						continue;
					}
					if(selection == 2) {
						System.out.print("Set Width: ");
						width = Float.parseFloat(scan.next());
						continue;
					}
					if(selection == 3) {
						break;
					}
					else {
						throw new InputMismatchException();
					}
				}
				Shape rectangle = new Rectangle((float) length, (float) width);
				
				System.out.println("Area: " + rectangle.calculateArea());
				System.out.println("Perimeter: " + rectangle.calculatePerimeter());
				System.out.println();

				
			} catch(InputMismatchException e) {
				// ext option caught since Scanner is looking only for Integers
				if(scan.next().equals("e") || scan.nextInt() == 3)
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