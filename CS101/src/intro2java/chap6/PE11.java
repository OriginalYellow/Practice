package intro2java.chap6;

import java.util.Scanner;

public class PE11 {
	
	public static double deviation(double[] x) {
		double numerator = 0;
		for (int i = 0; i < x.length; i++) {
			numerator += Math.pow((x[i] - mean(x)), 2);
		}
		double deviation = Math.sqrt((numerator) / (x.length - 1));
		return deviation;
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter ten numbers:");
		Scanner s = new Scanner(System.in);
		double[] values = new double[10];
		for (int x = 0; x < 10; x++)
			values[x] = s.nextDouble();
		System.out.println("The mean is " + mean(values));
		System.out.println("The standard deviation is " + deviation(values));
	}
	
}
