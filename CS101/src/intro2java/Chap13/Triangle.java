package intro2java.Chap13;

import intro2java.chap11.GeometricObject1;

public class Triangle extends GeometricObject1 {
	double side1;
	double side2;
	double side3;

	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(double side1, double side2, double side3)
			throws IllegalTriangleException {
		if (side1 + side2 <= side3
				|| side1 + side3 <= side2
				|| side2 + side3 <= side1) {
			throw new IllegalTriangleException();
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2)
				* (s - side3));
		return area;
	}

	public double getParimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

	}

	//test method
	public static void main(String[] args) {
		try {
			Triangle t = new Triangle(.1, .1, 1);
			t.setFilled(true);
			t.setColor("Yellow");
			System.out.println(t.toString());
		}
		catch (IllegalTriangleException ex) {
			System.out.println("u dun goof'd");
		}
		

	}
}
