package intro2java.chap6;

import java.util.Scanner;

public class PE1 {

	public static void main(String[] args) {
		System.out.println("Enter the total number of scores:");
		Scanner s = new Scanner(System.in);
		int[] scores = new int[s.nextInt()];
		System.out.println("Enter each scores grade:");
		for (int x = 0; x < scores.length; x++) {
			scores[x] = s.nextInt();
		}
		int maxScore = scores[0];
		int maxScoreIndex = 0;
		for (int x = 1; x < scores.length; x++) {
			if (scores[x] > maxScore) {
				maxScore = scores[x];
				maxScoreIndex = x;
			}
		}
		char[] grades = new char[scores.length];
		for (int x = 0; x < scores.length; x++) {
			if (x == maxScoreIndex && 
					(scores[x] >= (maxScore - 10))) 
				grades[x] = 'A';
			else if (scores[x] >= (maxScore - 20))
				grades[x] = 'B';
			else if (scores[x] >= (maxScore - 30))
				grades[x] = 'C';
			else if (scores[x] >= (maxScore - 40))
				grades[x] = 'D';
			else 
				grades[x] = 'F';
		}
		for (int x = 0; x < scores.length; x++) {
			System.out.println(
					"Student " + x + " has a grade of " + grades[x]);
		}
	}
}
