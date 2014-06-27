package intro2java.chap6;

import java.util.Scanner;

public class PE9 {
	
	public static double minimum(double[] values) {
		double min = values[0];
		for (int i = 1; i < values.length; i++) 
			if (values[i] < min)
				min = values[i];
		return min;
	}
	
	public static void main(String[] args) {
		double[] values = new double[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 values");
		for (int x = 0; x < 10; x++)
			values[x] = s.nextDouble();
		System.out.println("The minumum of the values is " +
			minimum(values));
	}
}
