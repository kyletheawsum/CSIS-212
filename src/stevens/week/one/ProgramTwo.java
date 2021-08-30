package stevens.week.one;

import javax.swing.JOptionPane;
	
/**
 * ProgramTwo - Write a portion of a Program for a church’s website. 
 * The Program will be used for a chatting feature, which will include an Input Box 
 * (Dialog Boxes and the JOptionPane) that requests the user’s name. 
 * The message box will include the user’s name and the Scripture of the Day (chapter and verse only).
 * CSIS-212B02
 * Week 1 Assignment
 * Program 2
 * @author Kyle Stevens
 *
 */
public class ProgramTwo {
	
	// static final String [] of verses. "final" since this will not change in the program
	private static final String[] VERSES = {"Matthew 6:11","Ephesians 2:2","Philippians 3:10","Romans 3:17",
											"John 12:13","Acts 1:8","Psalm 1:1","1 Peter 1:14",
											"Mark 12:32","1 Thessalonians 3:6"};
	
	/**
	 * return a random verse from the String[] of verses
	 * hardcoded max random number since the total number of verses will not change
	 * @return String verse
	 */
	private static String getVerse() {
		int i = (int) (Math.random()*9);
		
		return VERSES[i];
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 2\n");
		
		// ask user for his/her name and store it as a String
		String name;
		name = JOptionPane.showInputDialog("Name");
		
		// set the response as a String
		// format the response to include the user's name
		String response = String.format("Welcome, %s, To The Libery University Website!\n"
										+ "The Scripture for the day is: %s", name, getVerse());	// get verse method call
		
		// returne the formatted response
		JOptionPane.showMessageDialog(null, response);
	}

}
