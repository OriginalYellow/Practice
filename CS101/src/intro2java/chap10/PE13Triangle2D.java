package intro2java.chap10;

import java.awt.geom.Line2D;

public class PE13Triangle2D {
	private PE4MyPoint p1;
	private PE4MyPoint p2;
	private PE4MyPoint p3;

	public PE13Triangle2D() {
		p1 = new PE4MyPoint(0, 0);
		p2 = new PE4MyPoint(1, 1);
		p3 = new PE4MyPoint(2, 5);
	}

	public PE13Triangle2D(double p1x, double p1y, double p2x,
			double p2y, double p3x, double p3y) {
		p1 = new PE4MyPoint(p1x, p1y);
		p2 = new PE4MyPoint(p2x, p2y);
		p3 = new PE4MyPoint(p3x, p3y);
	}

	public PE4MyPoint getp1() {
		return p1;
	}

	public PE4MyPoint getp2() {
		return p2;
	}

	public PE4MyPoint getp3() {
		return p3;
	}

	public void setp1(PE4MyPoint p) {
		p1 = p;
	}

	public void setp2(PE4MyPoint p) {
		p2 = p;
	}

	public void setp3(PE4MyPoint p) {
		p3 = p;
	}

	public double getArea() {
		double side1 = p1.distance(p2);
		double side2 = p2.distance(p3);
		double side3 = p3.distance(p1);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2)
				* (s - side3));
		return area;
	}

	public double getParemeter() {
		return (p1.distance(p2) + p2.distance(p3)
				+ p3.distance(p1));
	}

	public boolean contains(PE4MyPoint p) {
		if (Line2D.linesIntersect(p.getx(), p.gety(), p1.getx(),
				p1.gety(), p2.getx(), p2.gety(), p3.getx(),
				p3.gety())) {
			return false;
		} else if (Line2D.linesIntersect(p.getx(), p.gety(), p2.getx(),
				p2.gety(), p1.getx(), p1.gety(), p3.getx(),
				p3.gety())) {
			return false;
		} else if (Line2D.linesIntersect(p.getx(), p.gety(), p3.getx(),
				p3.gety(), p2.getx(), p2.gety(), p1.getx(),
				p1.gety())) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean contains(PE13Triangle2D t) {
		if (!contains(t.getp1())) {
			return false;
		} else if (!contains(t.getp2())) {
			return false;
		} else if (!contains(t.getp3())) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean overlaps(PE13Triangle2D t) {
		double tx1 = t.getp1().getx();
		double ty1 = t.getp1().gety();
		double tx2 = t.getp2().getx();
		double ty2 = t.getp2().gety();
		double tx3 = t.getp3().getx();
		double ty3 = t.getp3().gety();
		double x1 = getp1().getx();
		double y1 = getp1().gety();
		double x2 = getp2().getx();
		double y2 = getp2().gety();
		double x3 = getp3().getx();
		double y3 = getp3().gety();
		if (Line2D.linesIntersect(x1, y1, x2, y2, tx1, ty1, tx2, ty2)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x2, y2, tx1, ty1, tx3, ty3)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x2, y2, tx1, ty1, tx2, ty2)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x2, y2, tx2, ty2, tx3, ty3)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x3, y3, tx1, ty1, tx3, ty3)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x3, y3, tx1, ty1, tx2, ty2)) {
			return true;
		} else if (Line2D.linesIntersect(x1, y1, x3, y3, tx2, ty2, tx3, ty3)) {
			return true;
		} else if (Line2D.linesIntersect(x3, y3, x2, y2, tx1, ty1, tx3, ty3)) {
			return true;
		} else if (Line2D.linesIntersect(x3, y3, x2, y2, tx1, ty1, tx2, ty2)) {
			return true;
		} else if (Line2D.linesIntersect(x3, y3, x2, y2, tx2, ty2, tx3, ty3)) {
			return true;
		} else {
			return false;
		}
	}
	
	//test method
	public static void main(String[] args) {
		PE13Triangle2D t = new PE13Triangle2D(1.02, 3.3, 4.98, 2.34, 2.66, 1.58);
		PE4MyPoint p = new PE4MyPoint(1.2, 2.3);
		System.out.println(t.contains(p));
		PE13Triangle2D b = new PE13Triangle2D(2.76, 4.56, 4.04, 3.72, 4.5, 4.24);
		System.out.println(t.contains(b));
		System.out.println(t.overlaps(b));
	}

}












