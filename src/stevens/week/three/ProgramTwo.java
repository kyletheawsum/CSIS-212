package stevens.week.three;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ProgramTwo - Exercise 4.16 JHTP (Bar Chart Printing Program): One interesting application of 
 * computers is to display graphs and bar charts. Write an application that reads 5 numbers 
 * between 1 and 30. For each number that reads, your program will display the same number of 
 * adjacent asterisks. For example, if your program reads the number 7, it will display *******. 
 * Display the bars of asterisk after you read all 5 numbers.
 * CSIS-212B02
 * Week 3 Assignment
 * Program 2
 * @author Kyle Stevens
 *
 */
public class ProgramTwo {
	
	// final int since the number of rows should not change
	private static final int ROWS = 5;
	
	// create class variable to hold bar chart
	private static String[] barChart = new String[ROWS];
	
	/**
	 * collectNumbers(int x)
	 * take the user inputted X and create a string of "*" that is the length of X
	 * adds the character String to the barChart at the 1st null row
	 * @param int x
	 */
	private static void collectNumbers(int x) {
		// for each item (chart row) in the array 
		for(int row = 0; row < ROWS; row++) {
			
			// if chart row equals null
			if(barChart[row] == null) {
				// create a line of length x (user inputted value)
				String character = "*".repeat(x);
				
				// set the row equal to the user inputted value
				barChart[row] = character;
				
				// break the loop so only row(x) is updated
				break;
			}
		}
	}
	
	/**
	 * returnGraph(String[] barChart)
	 * print out each row of the bar chart
	 * @param String[] barChart
	 */
	private static void returnGraph(String[] barChart) {
		for(int row = 0; row < barChart.length; row++) {
			System.out.println(barChart[row]);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 3: Program 2\n");

		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// initialize count bars
		int i = 1;

		// loop through all three employee wages, even if the user inputs an invalid character
		while(true) {
					
			// use a try/catch to handle invalid characters
			try {
				// loop through employees 1-3 and exit when i == 4
				while(i <= ROWS) {
					// read integer i
					System.out.print(String.format("Enter bar %d count: ", i));
					int count = scan.nextInt();
					
					// if the count is outside the allowed span of integers
					if(count < 1 || count > 30) {
						System.out.println("**** Please enter number 1 through 30 only ****");
					} else {
						
						// good value. store the good value
						collectNumbers(count);
						
						// increment i AFTER it's been used
						i++;
					}
						
				}
				// exit the while(true) loop after all 5 integers have been returned
				break;
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
		
		// print out the graph after all inputs
		returnGraph(barChart);
	}
}
