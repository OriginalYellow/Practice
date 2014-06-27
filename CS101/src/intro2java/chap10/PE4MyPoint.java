package intro2java.chap10;

public class PE4MyPoint {
	private double x;
	private double y;
	
	public PE4MyPoint() {
		x = 0;
		y = 0;
	}
	
	public PE4MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public double distance(PE4MyPoint p) {
		return getDistance(p.getx(), p.gety(), x, y);
	}
	
	public double distance(double x, double y) {
		return getDistance(this.x, this.y, x, y);
	}
	
	private static double getDistance(double x1, double y1, double x2,
			double y2) {
		double d = 0;
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		return d;
	}
}
