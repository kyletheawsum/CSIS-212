package stevens.week.three;

/**
 * ProgramOne - Exercise 4.12: Write an application that calculates the product of the odd integers from 1 to 15.
 * CSIS-212B02
 * Week 3 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
	
	/**
	 * product of odd integers
	 * this is the simplest way, in my opinion to find the product of add integers
	 * @param max
	 * @return int product
	 */
	private static int productOddIntegers(int max) {
		
		// initialize product to 1 so we are not multiplying by 0
		int product = 1;
		
		// loop through integers, starting at 1 and ending at max int
		for(int i = 1; i <= max; i++) {
			// if remainder of i/2 is not equal to 0, we have an odd integer
			if(i % 2 != 0) {
				// new product equals previous product times next odd integer
				product *= i;
			}
		}
		
		// return total product
		return product;
	}
	
	/**
	 * product by recursion
	 * this is a less simple way of finding the product, but shows that recursion
	 * can be used to accomplish the same task. this is a simple example of why
	 * one might use recursion: when we perform the same task repetitively
	 * unlike the productOddIntegers() method, we are starting with the max integer
	 * and incrementing down,
	 * instead of starting from 1 and incrementing up
	 * @param max
	 * @return int product
	 */
	private static int productOddIntegersByRecursion(int max) {
		
		// if remainder of m/2 is not equal to 0, we have an odd integer
		if (max % 2 != 0) {
			// muliply max by the next result of productOddIntegersByRecursion() method
			return max * productOddIntegersByRecursion(max-1);
		}
		// else we have an even integer not equal to 0
		else if ((max % 2 == 0) && max != 0) {
			// decrement max to be an odd integer
			max -= 1;
			// return the product of the odd integer
			return productOddIntegersByRecursion(max);
		}
		// max is now equal to 1 and we escape the recursive loop
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 3: Program 1\n");

		System.out.println(productOddIntegers(15));
		
		System.out.println(productOddIntegersByRecursion(15));
	}
}
