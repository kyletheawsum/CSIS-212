package stevens.week.six.assignment.six;

public class DateTest {
	
	static void testDates() {
		
		System.out.println("Kyle Stevens - Assignment 6: Program 1\n");

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
	
	public static void main(String[] args) {
		DateTest.testDates();
	}

}
