package intro2java.chap10;

import customLibrary.math.*;

public class PE11Circle2D {
	private double x;
	private double y;
	private double radius;

	public PE11Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public PE11Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	public double getCircle() {
		return (2 * Math.PI * radius);
	}
	
	/* If the point's distance from the center is greater than the
	 * radius, return true. If not, return false
	 */
	//untested
	public boolean contains(double x, double y) {
		double d = Geometry.getDistance(x, y, this.x, this.y);
		if (d < radius) {
			return true;
		} else {
			return false;
		}
	}

	/* if the distance between the centers of both circles plus the
	 * radius of the parameter circle is greater than the radius
	 * of the method's circle (not the parameter circle's radius),
	 * then return false. If it is smaller, return true.
	 */
	//untested
	public boolean contains(PE11Circle2D c) {
		double d = Geometry.getDistance(c.getx(), c.gety(), x, y);
		if ((d + c.getRadius()) >= radius) {
			return false;
		} else {
			return true;
		}
	}

	/* if the distance between each circles center is smaller than
	 * their radii combined, and contains(PE11Circle2D) is false,
	 * return true. If not, return false.
	 */
	//untested
	public boolean overlaps(PE11Circle2D c) {
		double d = Geometry.getDistance(c.getx(), c.gety(), x, y);
		if (!contains(c) && (d < (c.getRadius() + radius))) {
			return true;
		} else {
			return false;
		}
	}
}
