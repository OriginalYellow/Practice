/* Find the slope by using the slope equation that uses the 4 points
 * 
 * Find the y-intercept by doing stuff
 * 
 */

//COME BACK TO THIS (too crazy to solve now idk whatever but come
//back when you are smarter)

package intro2java.chap8;

import java.util.Arrays;
import java.util.Scanner;

public class PE12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the endpoints of the first line in the order of" +
				" x1, y1, x2, and y2:");
		double x1a = s.nextDouble();
		double y1a = s.nextDouble();
		double x2a = s.nextDouble();
		double y2a = s.nextDouble();
		double slopeA = findSlope(x1a, x2a, y1a, y2a);
		System.out.println("Enter the endpoints of the second line in the order of" +
				" x1, y1, x2, and y2:");
		double x1b = s.nextDouble();
		double y1b = s.nextDouble();
		double x2b = s.nextDouble();
		double y2b = s.nextDouble();
		double slopeB = findSlope(x1b, x2b, y1b, y2b);
		double[] ABE = findStandardForm(x2a, y2a, slopeA);
		double[] CDF = findStandardForm(x1b, y1b, slopeB);
		double a = ABE[0];
		double b = ABE[1];
		double e = ABE[2];
		double c = CDF[0];
		double d = CDF[1];
		double f = CDF[2];
		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		double x = linearEquation.getX();
		double y = linearEquation.getY();
		System.out.println("The lines intersect at (" + x + ", " + y + ")");
		
	}
	
	public static double findSlope(double x1, double x2, double y1, double y2) {
		return (y1 - y2) / (x1 - x2);
	}
	
	public static double[] findStandardForm(double x1, double y1, double b) {
	 	double A = b;
	 	double B = 1.0;
	 	double E = b * x1;
	 	E = E - y1;
	 	A = A * -1;
	 	double[] ABE = {A, B, E};
	 	return ABE;
	}
 	
}
