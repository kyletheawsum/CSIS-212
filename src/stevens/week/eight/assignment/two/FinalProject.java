package stevens.week.eight.assignment.two;

/**
 * Create an application that contains an enumeration (enum) that represent the days of the week.
 * Display a list of the days, then prompt the user for a day. Display business hours for the chose day.
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

	public static void main(String[] args) {
		System.out.println(DaysOfTheWeek.getHours(DaysOfTheWeek.SUNDAY));

	}

}

enum DaysOfTheWeek {
	
	SUNDAY(0,"Closed"),
	MONDAY(1,"7am-4pm"),
	TUESDAY(2,"6am-3pm"),
	WEDNESDAY(3,"9am-6pm"),
	THURSDAY(4,"8:30am-5:30pm"),
	FRIDAY(5,"7:30am-4:30pm"),
	SATURDAY(6,"9am-2pm");

    private static int day;
    private static String hours;
    
	DaysOfTheWeek(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	public static BusinessHours getHours() {
		
		return new BusinessHours(day, hours);
	}
}

class BusinessHours {
	
	int day;
	String hours;
	
	public BusinessHours(int day2, String hours2) {
		this.day = day;
		this.hours = hours;
	}

}