package stevens.week.two;

// import InputMismatchException to handle invalid characters entered
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ProgramOne - Exercise 3.20 JHTP (Salary Calculator): 
 * 		Develop a Java application that determines the gross pay for each of three (3) employees.  
 * 		The company pays straight time for the first 40 hours worked by each employee and time 
 * 		and a half for all hours worked in excess of 40.  You’re given a list of employees, 
 * 		their number of hours worked last week, and their hourly rates [create your own information/data 
 * 		here to input into the program].  Your program should input this information/data for each employee, 
 * 		then determine and display the employee’s gross pay.  Use class Scanner to input the employee data.
 * CSIS-212B02
 * Week 2 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
	
	
	public static void main(String[] args) {
		
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		
		// loop through all three employee wages, even if the user inputs an invalid character
		while(true) {
			// use a try/catch to handle invalid characters
			try {
				// initialize count of employee
				int i = 1;
				// loop through employees 1-3 and exit when i == 4
				while(i < 4) {
					// read double One (hourly rate)
					System.out.print("Enter the hourly rate: ");
					double rate = scan.nextDouble();
					
					// read double Two (hours worked)
					System.out.print("Enter hours worked: ");
					double hours = scan.nextDouble();
					
					// create new instance of Wage class
					Wage w = new Wage(rate, hours);
								
					// returned total wages for employee "i"
					System.out.println(String.format("Pay for employee %d is: $%.2f",i, w.getTotal()));
					
					// increment i AFTER it's been used
					i++;
				}
				// exit the while(true) loop after all 3 employe wages have been returned
				break;
			} catch(InputMismatchException e) {
				// ext option caught since Scanner is looking only for Integers
				if(scan.next().equals("e"))
					break;
				else {
					// Remind user of valid values
					System.out.println("****Please enter Numeric values only****");
					System.out.println("**Press 'e' to exit.\n");
				}
			}
		}
		scan.close();
	}
}

/**
 * Wage class:
 * 		Java OOP convention recommends grouping similar methods together in their own class.
 * 		The Wage class contains all variables and methods necessary to calculate employee wages.
 * 		All variables and methods are private class variables and methods. The only public methods are 
 * 		getTotal() and the Constructor. This protects both by not allowing 
 * 		data leaks or changes where there should not be. Only a single copy exists, since the class is
 * 		called again for each employee.
 * @author Kyle Stevens
 *
 */
class Wage {
	
	// static variables to reduce memory
	// static variable belongs to the class itself, not the method
	// make all variables private so they cannot be accessed outside of the class
	private static double rate;
	private static double hoursWorked;
	private static double total;
	
	// static to reduce memory, and also final since this value will not change
	private static final int AVERAGE_WORK_WEEK = 40;
	
	// must be static since overtime_rate is called from a static method pay(XX, YY)
	private static double overtime_rate;
	
	/**
	 * Setter for total 
	 * Private method so this cannot be accessed by any other class
	 * Creates greater security
	 * @param tot
	 */
	private void setTotal(double tot) {
		total = tot;
	}
	
	/**
	 * Getter for total
	 * public so it can be accessed outside of Wages class
	 * @return
	 */
	public double getTotal() {
		return total;
	}
	
	/**
	 * Constructor for Wage class
	 * Sets the variables needed to compute wage
	 * Makes method call to compute wage, so that multiple methods do not need to be called by main class
	 * Allows all computational Wage methods to remain private, since they do not need to be accessed by other classes
	 * @param empRate
	 * @param empHoursWorked
	 */
	public Wage(double empRate, double empHoursWorked) {
		rate = empRate;
		hoursWorked = empHoursWorked;
		overtime_rate = rate + (rate / 2);
		
		setTotal(totalWage(rate, hoursWorked));
	}
	
	/**
	 * Computes the total wage for employee
	 * @param rate
	 * @param hoursWorked
	 * @return double
	 */
	private static double totalWage(double rate, double hoursWorked) {
		// method variables to calculate base pay and overtime pay
		double totalPay;
		int baseTime;
		double overtime;
		
		// check if employee worked more than AVERAGE_WORK_WEEK
		// if true, calculate base pay, as well as overtime
		if(isOvertime(hoursWorked)) {
			baseTime = AVERAGE_WORK_WEEK;
			// hours worked after base time
			overtime = hoursWorked - AVERAGE_WORK_WEEK;
			
			// calculate base pay
			double basePay = pay(rate, baseTime);
			
			// calculate overtime pay
			double overtimePay = pay(overtime_rate, overtime);
			
			// get total pay
			totalPay = basePay + overtimePay;
		}
		else {
			// only need to calculate base pay since no overtime is present
			totalPay = pay(rate, hoursWorked); 
		}
		
		return totalPay;
	}
	
	/**
	 * Check to see if total time worked is greater the AVERAGE_WORK_WEEK
	 * @param hoursWorked
	 * @return boolean
	 */
	private static boolean isOvertime(double hoursWorked) {
		
		if(hoursWorked > AVERAGE_WORK_WEEK) 
			return true;
		else 
			return false;
	}
	
	/**
	 * Primary method that calculates payment amount
	 * @param rate
	 * @param hours
	 * @return double
	 */
	private static double pay(double rate, double hours) {
				
		double payAmount = rate * hours;
		
		return payAmount;
	}
	
	
}
 