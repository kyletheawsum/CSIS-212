package stevens.week.one;

/**
 * Program 3 - Exercise 2.14 JHTP: Write an application that displays the 
 * numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by 1 space. 
 * Use the following techniques to accomplish learning the three ways to print using Java.
 * CSIS-212B02
 * Week 1 Assignment
 * Program 3
 * @author Kyle Stevens
 *
 */
public class ProgramThree {
	
	/**
	 * Print "1" using "print"
	 */
	private void print() {
		System.out.print("1 ");
	}
	
	/**
	 * Print "2" and "3" using "printF"
	 */
	private void printF() {
		System.out.printf("%d %d ", 2, 3);
	}
	
	/**
	 * Print "4" using "println"
	 */
	private void printLn() {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 3\n");
		
		// Constructor call to instantiate the class
		ProgramThree p3 = new ProgramThree();
		
		// call print method
		p3.print();
		
		// call printf method
		p3.printF();
		
		// call println method
		p3.printLn();
	}

}
