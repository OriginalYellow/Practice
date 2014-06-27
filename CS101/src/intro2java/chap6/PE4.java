
package intro2java.chap6;

import java.util.Scanner;

public class PE4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] scores = new double[10];
		int scoreCount = 0;
		double scoreSum = 0;
		System.out.println("Enter no more than 10 numbers:");
		for (int x = 0; x < 10; x++) {
			double currentScore = s.nextDouble();
			if (currentScore < 0)
				break;
			scores[x] = currentScore;
			scoreSum += scores[x]; 
			scoreCount++;
		}
		double scoreAverage = scoreSum / scoreCount;
		int scoresBelow = 0;
		int scoresAbove = 0;
		for (int x = 0; x < scoreCount; x++) {
			if (scores[x] < scoreAverage) 
				scoresBelow++;
			else
				scoresAbove++;
		}
		System.out.println("The average is " + scoreAverage
				+ "\nThere are " + scoresBelow + " scores below the average and " + scoresAbove
				+ " above or equal to the average");
	}
}
