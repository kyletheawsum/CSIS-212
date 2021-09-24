package stevens.week.five;

import java.util.Random;

/**
 * Program Two - Exercise 6.17 JHTP: (Dice Rolling) Write an application to simulate the rolling of two dice. 
 * The application should use an object of class Random once to roll the first die and again to roll the second 
 * die. The sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so 
 * the sum of the clause will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least 
 * frequent. Figure 6.21 shows the 36 possible combinations of the two die. Your application should roll the dice 
 * 36,000 times. Use a one-dimensional array to tally the number of times each possible sum appears. Display the 
 * results in a tabular format. 
 * CSIS-212B02
 * Week 5 Assignment
 * Program 2
 * @author Kyle Stevens
 *
 */
public class ProgramTwo {

	public static void main(String args[]) {
		
		System.out.println("Kyle Stevens - Assignment 5: Program 2\n");

		//declare int[] os length 11 since there are 11 possible values of the dice rolls
		int[] diceValuesRolled = new int[11];
				
		// roll dice 36000 times
		for (int i = 0; i < 36000; i++) {
			
			// subtract 2 since the starting index == 0, but dice sum starting index == 2
			// otherwise, indexes would be in range of [2-12] instead of [0-10]
			int sum = Dice.getSumOfDice() - 2;
			
			// add 1 to the result at the corresponding index (i.e. - if 5 was rolled, add 1 to result[4] (index for 5))
			// indexes are [0-10]
			diceValuesRolled[sum] += 1;
		}
		
		System.out.printf("%3s%14s\n", "Sum", "Times Rolled");
		
		// print each value rolled and the frequency of the value rolled
		for (int valueRolled = 0; valueRolled  < diceValuesRolled.length;  valueRolled++)
		{
			System.out.printf("%3d%14d\n", valueRolled+2, diceValuesRolled[valueRolled]);
		}
	}
}

class Dice {
		
	//roll the dice
	private static int rollDie()
	{
		// random number between 1 and 6
		Random r = new Random();
		return r.nextInt(6) + 1;
	}
	
	//get the value
	public static int getSumOfDice()
	{
		return rollDie() + rollDie();
	}
}