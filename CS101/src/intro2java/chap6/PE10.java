package intro2java.chap6;

import java.util.Scanner;

public class PE10 {
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0];
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) 
			if (array[i] < min) {
				min = array[i];
				indexOfMin = i;
			}
		return indexOfMin;
	}
	public static void main(String[] args) {
		double[] values = new double[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 values");
		for (int x = 0; x < 10; x++)
			values[x] = s.nextDouble();
		System.out.println(
				"The index of the smallest value is " +
				indexOfSmallestElement(values));
	}
}
