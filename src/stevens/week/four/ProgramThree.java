 package stevens.week.four;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

/**
 * ProgramOne - Exercise 5.35 (Computer-Assisted Instruction): The use of computers in education is referred to as computer ¬assisted instruction (CAI). 
 * Write a program that will help an elementary school student learn multiplication. Use a Random object to produce 2 positive 1-digit integers. 
 * The program will then prompt the user with a question, such as “How much is 6 times 7?”
 *
 * The student then inputs the answer. Next, the program checks the student’s answer. If it is correct, display the message “Very Good!” 
 * and ask another multiple question. If the answer is wrong, display the message “No. Please try again.” And let the student try the same 
 * question repeatedly until the student finally gets it right. A separate method will be used to generate each new question. 
 * This method will be called once when the application begins execution and each time the user answers the question correctly.
 *
 * CSIS-212B02
 * Week 3 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramThree {

	
	private static int getRandomInt() {
		// get random
		int random = (int) (Math.random() * 9) + 1;
		return random;
	}
	
	private static boolean isCorrectAnswer(int int1, int int2, int value) {
		int correctAnswer = int1 * int2;
		if(value == correctAnswer) {
			return true;
		}
		
		return false;
	}
		
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 4: Program 3\n");
		
		// loop through, even if the user inputs an invalid character
		while(true) {
					
			// use a try/catch to handle invalid characters
			
			int int1 = getRandomInt();
			int int2 = getRandomInt();
			String value = JOptionPane.showInputDialog(String.format("How much is %d time %d", int1, int2));
			
			if(value == null) {
				break;
			}
			
			try {
				
				while(true) {
					if(value == null) {
						break;
					}
					int userAnswer = Integer.parseInt(value);

					if(isCorrectAnswer(int1, int2, userAnswer)) {
						JOptionPane.showMessageDialog(null, "Very Good!");
						break;
					} else {
						value = JOptionPane.showInputDialog(String.format("No. Please try again.\nHow much is %d time %d", int1, int2));
					}
				}
				

			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter Integer values only!");
			} catch(InputMismatchException | NullPointerException e) {
				break;
			}
		}



	}
}
