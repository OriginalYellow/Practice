package intro2java.chap6;

import java.util.Scanner;

public class PE8 {
	
	public static int average(int[] array) {
		int sum = 0;
		for (int x = 0; x < array.length; x++) 
			sum += array[x];
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int x = 0; x < array.length; x++) 
			sum += array[x];
		return sum / array.length;
	}
	
	public static void main(String[] args) {
		double[] values = new double[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 double values:");
		for (int x = 0; x < 10; x++) {
			values[x] = s.nextDouble();
		}
		double average = average(values);
		System.out.println("The average of the values is " + average);
	}
	
}
