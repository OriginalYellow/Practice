package intro2java.chap5;

import java.util.Scanner;

class MyTriangle {
	public static boolean isValid(
			double side1, double side2, double side3) {
		double sum = (side1 + side2 + side3);
		if ((sum - side1) > side1) return true;
		else if ((sum - side2) > side2) return true;
		else if ((sum - side3) > side3) return true;
		else return false;
	}
	public static double area(
			double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
	}
}

public class PE19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle");
		double side1 = s.nextDouble();
		double side2 = s.nextDouble();
		double side3 = s.nextDouble();
		if (MyTriangle.isValid(side1, side2, side3)) 
			System.out.println(
					"The area of that triangle is " + MyTriangle.area(side1, side2, side3));
		else System.out.println("That triangle is invalid");
	}
}
