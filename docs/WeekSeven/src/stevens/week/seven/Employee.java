package stevens.week.seven;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author Paul Deitel; Harvey M. Deitel
 * @author Kyle Stevens
 *
 */
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    // constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber, int month, int day, int year) {
	   this.firstName = firstName;
	   this.lastName = lastName;
	   this.socialSecurityNumber = socialSecurityNumber;
	   // use Calendar / Gregorian Calendar since Date() is deprecated
	   Calendar c = new GregorianCalendar(year, month, day);
	   this.birthDate = c.getTime();
	  
	}
	
	// return first name
	public String getFirstName() {
		return firstName;
	}
	
	// return last name
	public String getLastName() {
		return lastName;
	}
	
	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
    public Date getBirthday(){
        return this.birthDate;
    }
	
	// return String representation of Employee object
	@Override
	public String toString() {
	   return String.format("%s %s%nsocial security number: %s",
	      getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	// abstract method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
 }