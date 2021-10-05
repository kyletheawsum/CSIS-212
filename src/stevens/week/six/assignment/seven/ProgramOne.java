package stevens.week.six.assignment.seven;

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
		
		System.out.println("Kyle Stevens - Assignment 7: Program 1\n");

		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop through all three employee wages, even if the user inputs an invalid character
		while(true) {
					
			// initialize variables to check if both have been inputted by the user. 
			// will not allow 0.0 to be inputted
			float length = 0, width = 0;
			
			// declare exitSelection outside of try/catch to use in try and catch
			int exitSelection = 0;
			// use a try/catch to handle invalid characters
			try {				
				while(length == 0 || width == 0) {
					System.out.println("1. Set Length");
					System.out.println("2: Set width");
					System.out.println("3: Exit");
					System.out.print("Choice: ");
					
					// scan user's choice
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
						exitSelection = 3;
						// throw Exception to get us to the catch block and exit code
						throw new InputMismatchException();
					}
					else {
						throw new InputMismatchException();
					}
				}
				// perform calculations and check validity of dimensions
				Shape rectangle = new Rectangle((float) length, (float) width);
				
				// return Area and Perimeter only if dimensions are valid
				if(Rectangle.getIsValidDimensions() == true) {
					System.out.println("Area: " + rectangle.calculateArea());
					System.out.println("Perimeter: " + rectangle.calculatePerimeter());
					System.out.println();
				}
				else {
					// not valid values. Set both to 0 and try again.
					length = 0;
					width = 0;
				}
				
			} catch(InputMismatchException e) {
				// ext option caught since Scanner is looking only for Integers
				if(exitSelection == 3)
					break;
				else {
					// Remind user of valid values
					System.out.println("**** Please enter Floating Point values only ****");
					System.out.println("** Press 'e' to exit.\n");
				}
			}
		}
		
		// close the scanner
		scan.close();

	}

}