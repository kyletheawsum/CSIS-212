package stevens.week.six.assignment.six;

/**
 * Program One - Exercise 7.13 JHTP (Date Class): Create a class called Date that includes 3 instance 
 * variables - a month (type int), a day (type int) and a year (type int). Provide a contructor that 
 * initializes the 3 instance variables and assumes the values provided are correct. Provide a set and 
 * a get method for each instance variable. Provide a method displayDate that displays the month, 
 * day, and year separated by forward slashes(/). Write a test application name DateTest that 
 * demonstrates class Date's capabilities. 
 * CSIS-212B02
 * Week 6 Assignment Chapter 6
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
		
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 6: Program 1\n");

		Date d = new Date(2020,01,01);
		System.out.println(d.displayDate());
	}
}

class Date {
	private int year;
	private int month;
	private int day;
	
	private void setYear(int year) {
		this.year = year;
	}
	
	private int getYear() {
		return this.year;
	}
	
	private void setMonth(int month) {
		this.month = month;
	}
	
	private int getMonth() {
		return this.month;
	}
	
	private void setDay(int day) {
		this.day = day;
	}
	
	private int getDay() {
		return this.day;
	}
	
	public Date(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public String displayDate() {
		String formattedDate = String.format("%d/%d/%d", getMonth(), getDay(), getYear());
		
		return formattedDate;
	}

}