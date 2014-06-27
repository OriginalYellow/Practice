package intro2java.chap6;

import java.util.Scanner;

public class PE19 {

	public static void doubleBubbleSort(double[] list, String[] stringList) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] < list[j]) {
					notSorted = true;
					double jTemp = list[j];
					list[j] = list[i];
					list[i] = jTemp;
					String jTempString = stringList[j];
					stringList[j] = stringList[i];
					stringList[i] = jTempString;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		double[] scores = new double[s.nextInt()];
		String[] names = new String[scores.length];
		System.out.println("Enter each students score:");
		for (int x = 0; x < scores.length; x++) 
			scores[x] = s.nextDouble();
		System.out.println("Enter the name of each" +
				"\nstudent in the same order:");
		for (int i = 0; i < names.length; i++) 
			names[i] = s.next();
		doubleBubbleSort(scores, names);
		for (int x = 0; x < names.length; x++)
			System.out.println(names[x]);
	}

}
