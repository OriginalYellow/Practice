package intro2java.chap5;

import java.util.Scanner;

public class PE21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		double[] values = new double[10];
		for (int i = 0; i < 10; i++) {
			values[i] = s.nextDouble();
		}
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total += values[i];
		}
		double mean = (total / 10);
		double totalDeviation = 0;
		for (int i = 0; i < 10; i++) {
			totalDeviation += (Math.pow((values[i] - mean), 2));
		}
		double standardDeviation = (Math.sqrt(totalDeviation / 10));
		System.out.println("The mean of your numbers is " + mean + ",\nand the standard deviation is " + standardDeviation);
	}
}

