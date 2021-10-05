package stevens.week.eight.assignment.one;

import java.util.Random;

public class RandomValues {

	private static void getRandomStudentIDs() {
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(9000)+1000);
			System.out.print(",");
		}
	}
	
	private static void getRandomStudentGPAs() {
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.print((r.nextInt(3)+1) + r.nextDouble());
			System.out.print(",");
		}
	}
	
	public static void main(String[] args) {
		getRandomStudentIDs();
		System.out.println();
		getRandomStudentGPAs();
	}
}
