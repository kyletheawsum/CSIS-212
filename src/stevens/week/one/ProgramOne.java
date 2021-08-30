package stevens.week.one;

/**
 * ProgramOne - In this new age of Technology, we have been given the opportunity
 * 	to minister and serve other in many ways. Using the techniques you have learned in this chapter,
 * 	write a Program which displays at least 5 different sentences that explain how technology has
 * 	been used to win souls to Christ.
 * CSIS-212B02
 * Week 1 Assignment
 * Program 1
 * @author Kyle Stevens
 *
 */
public class ProgramOne {
	
	/**
	 * 
	 * @param String iterationOne
	 * @param String iterationTwo
	 * @param String iterationThree
	 */
	private static void ageOfTechnology(String iterationOne, String iterationTwo, String iterationThree) {
		System.out.printf("When thinking of how technology has helped with the spread of the Gospel, %n"
				+ "three modes come to mind: %s, %s, and %s.\n", iterationOne, iterationTwo, iterationThree	);
		System.out.println("With the invention of the Printing Press, the Gospel could be written/spread more quickly than when it was copied by hand");
		System.out.println("Audio such as radio, television, and podcasts serve to reach even more people, who might not necessarily own or read the Bible.");
		System.out.print("Electronic Bible, such as Bible apps have brought the Word of God to our fingertips, making access easier than ever.\n");
		System.out.printf("We can see with the progression of these three iterations (%s, %s, %s) that technology has exponentially increased the spread of the Gospel.", iterationOne, iterationTwo, iterationThree);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Kyle Stevens - Assignment 1: Program 1\n");
		 
		// statically call method so I do not need to create a new instance
		ProgramOne.ageOfTechnology("printing press", "audio", "electronic Bibles");
	}
}
