package intro2java.chap8;

public class PE9 {

	public static void main(String[] args) {
		RegularPolygon rp1 = new RegularPolygon(4, 1);
		RegularPolygon rp2 = new RegularPolygon();
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(rp1.getParimeter());
		System.out.println(rp2.getParimeter());
		System.out.println(rp3.getParimeter());
		System.out.println(rp1.getArea());
		System.out.println(rp2.getArea());
		System.out.println(rp3.getArea());
	}
	
}

class RegularPolygon {

	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int nParam, double sideParam) {
		n = nParam;
		side = sideParam;
		x = 0;
		y = 0;
	}

	public RegularPolygon(int nParam, double sideParam,
			double xParam, double yParam) {
		n = nParam;
		side = sideParam;
		x = xParam;
		y = yParam;
	}
	
	public int getN() {
		return n;
	}
	public void setN(int nParam) {
		n = nParam;
	}

	public double getSide() {
		return side;
	}
	public void setSide(double sideParam) {
		side = sideParam;
	}

	public double getX() {
		return x;
	}
	public void setX(double xParam) {
		x = xParam;
	}

	public double getY() {
		return y;
	}
	public void setY(double yParam) {
		y = yParam;
	}

	public double getParimeter() {
		return side * n;
	}
	
	public double getArea() {
		double numerator = (n * side * side);
		double denominator = (4.0 * Math.tan(Math.toRadians(180.0 / n)));
		return (numerator / denominator);
	}
	
}
