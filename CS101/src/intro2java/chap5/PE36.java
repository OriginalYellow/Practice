package intro2java.chap5;

import java.util.Scanner;

public class PE36 {
	public static double area(int n, double side) {
		double area = (n * Math.pow(side, 2)) / 
				(4.0 * Math.tan(Math.PI / n));
		return area;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of one side of the regular polygon");
		double side = s.nextDouble();
		System.out.println("How many sides does the polygon have?");
		int n = s.nextInt();
		double area = area(n, side);
		System.out.println("The regular polygon has an area of " + area);
	}
}
