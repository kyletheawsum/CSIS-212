package stevens.week.eight.assignment.two;

import java.util.Scanner;

/**
 * Create an application that contains an enumeration (enum) that represent the days of the week.
 * Display a list of the days, then prompt the user for a day. Display business hours for the chosen day.
 * Create your own business hours stored in an array; however, every day of the week should have 
 * different hours. Although companies do not normally have different business hours every day of the 
 * week, programming your code with this difference will help in finding and fixing coding errors.
 * CSIS-212B02
 * Week 8 Assignment
 * Final Project
 * @author Kyle Stevens
 *
 */
public class FinalProject {

	// static final String[] since this will not change
	private static final String[] BUSINESS_HOURS = {"Closed", "7am-4pm", "6am-3pm", "9am-6pm", "8:30am-5:30pm", "7:30am-4:30pm", "9am-2pm"};
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Final Project\n");
		
		// print out days of the week for reference
		for(DaysOfTheWeek days : DaysOfTheWeek.values()) {
			System.out.println(days);
		}
		
		// declare and initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop until user exits
		while(true) {
			
			// declare string outside of try/catch to use it in the catch clause
			String day = "";
			
			// use a try/catch to handle invalid characters
			try {
				
				System.out.println("Which day's business hours would you like to view? ");
				day = scan.next();
				
				// convert to uppercase since enum is stored with uppercase
				day = day.toUpperCase();
				
				// print out the day and BUSINESS_HOURS at the index of the day of the week
				System.out.println(String.format("%s business hours: %s", DaysOfTheWeek.valueOf(day), BUSINESS_HOURS[DaysOfTheWeek.valueOf(day).ordinal()]));
				System.out.println();
								
			} catch(Exception e) {
				// ext option caught since Scanner is looking only for Integers
				if(day.equals("E"))
					break;
				else {
					// Remind user of valid values
					System.out.println("**** Please enter valid days of the week only ****");
					System.out.println("** Press 'e' to exit.\n");
				}
			}
		}
		
		scan.close();

	}

}


/**
 * 
 * @author Kyle Stevens
 *
 */
enum DaysOfTheWeek {
	
	SUNDAY(0,"Closed"),
	MONDAY(1,"7am-4pm"),
	TUESDAY(2,"6am-3pm"),
	WEDNESDAY(3,"9am-6pm"),
	THURSDAY(4,"8:30am-5:30pm"),
	FRIDAY(5,"7:30am-4:30pm"),
	SATURDAY(6,"9am-2pm");

	private int day;
	private String hours;
	
	DaysOfTheWeek(int day, String hrs) {
		this.day = day;
		this.hours = hrs;
	}	
}
