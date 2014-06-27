package intro2java.chap8;

import java.util.Scanner;

public class PE11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values for a, b, c, d, e, and f" +
				" for a 2x2 linear equation");
		LinearEquation le = new LinearEquation(s.nextDouble(), s.nextDouble(), s.nextDouble(), 
				s.nextDouble(), s.nextDouble(), s.nextDouble());
		if (le.isSolvable()) {
			System.out.println("x: " + le.getX() + "\ny: " + le.getY());
		}
	}
	
}

class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation(double aParam, double bParam, double cParam, 
			double dParam, double eParam, double fParam) {
		a = aParam;
		b = bParam;
		c = cParam;
		d = dParam;
		e = eParam;
		f = fParam;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		if ((a * d - b * c) != 0)
			return true;
		else
			return false;
	}
	
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}