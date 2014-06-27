package customLibrary.math;

public class Geometry {

	private Geometry() {}

	/** finds the distance between 2 points (x1, y1) and (x2, y2) */
	public static double getDistance(double x1, double y1, double x2,
			double y2) {
		double d = 0;
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		return d;
	}

	public static void main(String[] args) {
		System.out.println(getDistance(.5, .3, 5, 0));
	}
	
}
