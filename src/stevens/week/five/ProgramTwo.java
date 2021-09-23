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

		//declared variables
		int results[] = new int[11];
		
		Dice dice = new Dice();
	
		for (int i = 0; i < results.length; i++)
		{
			results[i] = 0;
		}
	
		for (int i = 0; i < 36000; i++) {
			
			// subtract 2 since the starting index == 0, but dice sum starting index == 2
			int sum = dice.getSum() - 2;
			
			// add 1 to the result at the corresponding index (i.e. - if 5 was rolled, add 1 to result[4] (index for 5))
			results[sum] += 1;
		}
		
		System.out.printf("%3s%14s\n", "Sum", "Times Rolled");
	
		for (int diceRolled = 0; diceRolled  < results.length;  diceRolled++)
		{
			//int percent = results[ diceRolled ] / ( 360 );
			System.out.printf("%3d%14d\n", diceRolled+2, results[diceRolled]);
		}
	}
}

class Dice {
	
	//declared variables
	private static int die1;
	private static int die2;
	
	//constructor
	public Dice()
	{
		die1 = 0;
		die2 = 0;
	}
	
	//roll the dice
	private int rollDie()
	{
		// random number between 1 and 6
		Random r = new Random();
		return (r.nextInt(6) + 1);
	}
	
	//get the value
	public int getSum()
	{
		die1 = rollDie();
		die2 = rollDie();
	
		return die1 + die2;
	}
}