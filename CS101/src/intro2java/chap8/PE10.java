package intro2java.chap8;

import java.util.Scanner;

public class PE10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A, B, and C for a quadratic equation");
		quadraticEquation qe = new quadraticEquation(s.nextDouble(), s.nextDouble(),s.nextDouble());
		System.out.println("The first root is " + qe.getRoot1());
		System.out.println("The second root is " + qe.getRoot2());
	}
	
}

class quadraticEquation {
	
	private double a;
	private double b;
	private double c;
	
	quadraticEquation(double aParam, double bParam, double cParam) {
		a = aParam;
		b = bParam;
		c = cParam;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}
	
	public double getRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		return (-b + Math.sqrt(b * b - 4 * a * c)) /
				(2 * a);
	}
	
	public double getRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		if (getDiscriminant() == 0)
			return 0;
		return (-b - Math.sqrt(b * b - 4 * a * c)) /
				(2 * a);
	}
	
}