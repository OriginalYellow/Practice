package intro2java.chap7;

import java.util.Arrays;
import java.util.Scanner;

public class PE13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount of rows in the array:");
		int rows = s.nextInt();
		System.out.print("Enter the amount of columns in the array:");
		int columns = s.nextInt();
		double[][] array = new double[rows][columns];
		System.out.print("Enter the array:");
		for (int x = 0; x < rows; x++) {
			for (int i = 0; i < columns; i++) {
				array[x][i] = s.nextDouble();
			}
		}
		System.out.println("The location of the largest element is at "
				+ Arrays.toString(locateLargest(array)));
	}

	public static int[] locateLargest(double[][] a) {
		double max = 0;
		int[] index = new int[2];
		for (int x = 0; x < a.length; x++) {
			for (int i = 0; i < a[x].length; i++) {
				if (a[x][i] > max) {
					max = a[x][i];
					index[0] = x;
					index[1] = i;
				}
			}
		}
		return index;
	}

}
