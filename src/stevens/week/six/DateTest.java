package stevens.week.six;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import stevens.week.six.Date;

@Tag("UnitTest")
public class DateTest {
	
	/**
	 * Unit Tests using the junit.jupiter.api
	 */
	
	@Test
	void testDateOne() {
		Date d = new Date(2020,01,01);
		
		String expectedDate = "1/1/2020";
		String actualDate = d.displayDate();
		
		assertEquals(actualDate, expectedDate);
	}
	
	@Test
	void testDateTwo() {
		Date d = new Date(1970,12,31);
		
		String expectedDate = "12/31/1970";
		String actualDate = d.displayDate();
		
		assertEquals(actualDate, expectedDate);
	}

	
	@Test
	void testDateThree() {
		Date d = new Date(1989,05,23);
		
		String expectedDate = "5/23/1989";
		String actualDate = d.displayDate();
		
		assertEquals(actualDate, expectedDate);
	}

	
	@Test
	void testDateFour() {
		Date d = new Date(1995,03,06);
		
		String expectedDate = "3/6/1995";
		String actualDate = d.displayDate();
		
		assertEquals(actualDate, expectedDate);
	}

	
	@Test
	void testDateFive() {
		Date d = new Date(1900,02,29);
		
		String expectedDate = "2/29/1900";
		String actualDate = d.displayDate();
		
		assertEquals(actualDate, expectedDate);
	}
	
	@Test
	void testDateNotUsingJunit() {
		// Date 1
		Date d1 = new Date(2020,01,01);
		
		String expectedDate1 = "1/1/2020";
		String actualDate1 = d1.displayDate();
		
		System.out.println("Date 1");
		System.out.println("expectedDate: " + expectedDate1);
		System.out.println("actualDate: " + actualDate1);
		System.out.println("Are Equal: " + actualDate1.equals(expectedDate1));
		
		// Date 2
		Date d2 = new Date(1970,12,31);
		
		String expectedDate2 = "12/31/1970";
		String actualDate2 = d2.displayDate();

		System.out.println("Date 2");
		System.out.println("expectedDate: " + expectedDate2);
		System.out.println("actualDate: " + actualDate2);
		System.out.println("Are Equal: " + actualDate2.equals(expectedDate2));

		// Date 3
		Date d3 = new Date(1989,05,23);
		
		String expectedDate3 = "5/23/1989";
		String actualDate3 = d3.displayDate();
		
		System.out.println("Date 3");
		System.out.println("expectedDate: " + expectedDate3);
		System.out.println("actualDate: " + actualDate3);
		System.out.println("Are Equal: " + actualDate3.equals(expectedDate3));

		// Date 4
		Date d4 = new Date(1995,03,06);
		
		String expectedDate4 = "3/6/1995";
		String actualDate4 = d4.displayDate();

		System.out.println("Date 4");
		System.out.println("expectedDate: " + expectedDate4);
		System.out.println("actualDate: " + actualDate4);
		System.out.println("Are Equal: " + actualDate4.equals(expectedDate4));

		// Date 5
		Date d5 = new Date(1900,02,29);
		
		String expectedDate5 = "2/29/1900";
		String actualDate5 = d5.displayDate();

		System.out.println("Date 5");
		System.out.println("expectedDate: " + expectedDate5);
		System.out.println("actualDate: " + actualDate5);
		System.out.println("Are Equal: " + actualDate5.equals(expectedDate5));

	}

}
