package intro2java.chap8;

import java.util.Scanner;

public class PE13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array:");
		int rows = s.nextInt();
		int columns = s.nextInt();
		double[][] array = new double[rows][columns];
		
		System.out.println("Enter the array:");
		for (int x = 0; x < rows; x++) 
			for (int y = 0; y < columns; y++) 
				array[x][y] = s.nextDouble();
		
		System.out.println("The location of the largest element is " + locateLargest(array)); 
		
	}
	
	public static Location locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[0][0];

		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				if (a[x][y] > maxValue) {
					row = x;
					column = y;
					maxValue = a[x][y];
				}
			}
		}

		Location l = new Location();
		l.row = row;
		l.column = column;
		l.maxValue = maxValue;

		return l;

	}
	
}

class Location {

	public int row = 0;
	public int column = 0;
	public double maxValue = 0;
	
	public String toString() {
		return (maxValue + " at (" + row + ", " + column + ")");
	}

}
