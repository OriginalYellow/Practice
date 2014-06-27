package intro2java.chap6;

import java.util.Scanner;
import java.util.Arrays;

public class PE25 {

	public static void main(String[] args) {
		System.out.println("Enter values for a, b, and c");
		Scanner s = new Scanner(System.in);
		double[] eqn = new double[3];
		eqn[0] = s.nextDouble();
		eqn[1] = s.nextDouble();
		eqn[2] = s.nextDouble();
		double[] roots = new double[2];
		int rootCount = solveQuadratic(eqn, roots);
		System.out.println("Number of roots: " + rootCount);
		System.out.println("Value of roots:\n" + Arrays.toString(roots));
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		double discriminant = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
		int rootCount = 0;
		if (discriminant > 1)
			rootCount = 2;
		if (discriminant == 0)
			rootCount = 1;
		if (rootCount > 0) {
			roots[0] = ((-b + discriminant) / (2.0 * a));
		}
		if (rootCount > 1)
			roots[1] = ((-b - discriminant) / (2.0 * a));
		return rootCount;
	}

}
