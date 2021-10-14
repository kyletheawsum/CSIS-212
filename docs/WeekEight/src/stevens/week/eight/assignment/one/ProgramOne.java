package stevens.week.eight.assignment.one;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

/**
 * Write an application containing three parallel arrays that hold 10 elements each. The first array holds 
 * four-digit student ID numbers, the second array holds first name, and the third array holds the 
 * students' grade point averages. Use dialog boxes to accept a student ID number and display the 
 * student's first name and grade point average. If a match is not found, display an error message that 
 * includes the inavalid ID number and allow the user to search for a new ID number.
 * CSIS-212B02
 * Week 8 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
	
	static int[] studentID = {3746,6451,8460,8686,6143,7032,6793,8030,5855,3491};
	static String[] studentName = {"Kyle1","Kyle2","Kyle3","Kyle4","Kyle5","Kyle6","Kyle7","Kyle8","Kyle9","Kyle10"};
	static double[] studentGPA = {3.86,1.69,3.92,2.35,3.35,1.23,2.49,3.16,2.75,1.21};
	
	public static void main(String[] args) {
		System.out.println("Kyle Stevens - Assignment 8: Program 1\n");
		
		// loop through, even if the user inputs an invalid character
		while(true) {
					
			// use a try/catch to handle invalid characters
			
			String value = JOptionPane.showInputDialog(String.format("Enter Student ID"));
			
			if(value == null) {
				break;
			}
						
			try {
				
				while(true) {
					if(value == null) {
						break;
					}
					int userEnteredID = Integer.parseInt(value);
					
					int validStudentID = 0;
					String validStudentName = null;
					double validStudentGPA = 0.0;
					
					for(int i = 0; i < studentID.length; i++) {
						if(userEnteredID == studentID[i]) {
							validStudentID = studentID[i];
							validStudentName = studentName[i];
							validStudentGPA = studentGPA[i];
						}
					}

					if(validStudentID != 0) {
						JOptionPane.showMessageDialog(null, String.format("Name: %s\nGPA: %s", validStudentName, validStudentGPA));
						break;
					} else {
						value = JOptionPane.showInputDialog(String.format("Invalid ID number. Please try again."));
					}
					
				}
				

			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter 4-digit Integer values only!");
			} catch(InputMismatchException | NullPointerException e) {
				break;
			}
		}

	}
}

