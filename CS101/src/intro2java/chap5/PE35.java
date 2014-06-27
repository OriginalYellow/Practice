package intro2java.chap5;

import java.util.Scanner;

public class PE35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of one side of the pentagon");
		double side = s.nextDouble();
		double area = (5.0 * Math.pow(side, 2)) /
				(4.0 * Math.tan(Math.PI / 5.0));
		System.out.println("The area of your pentagon is " + area);
	}
}
