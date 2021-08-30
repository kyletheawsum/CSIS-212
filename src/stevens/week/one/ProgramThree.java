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
	
	private void print() {
		System.out.print("1 ");
	}
	
	private void printF() {
		System.out.printf("%d %d ", 2, 3);
	}
	
	private void printLn() {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 3\n");
		
		ProgramThree p3 = new ProgramThree();
		p3.print();
		p3.printF();
		p3.printLn();
	}

}
