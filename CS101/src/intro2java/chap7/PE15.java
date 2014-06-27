package intro2java.chap7;

import java.util.Scanner;

public class PE15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of points:");
		int pointsNum = s.nextInt();
		double[][] points = new double[pointsNum][2];
		
		//Enter the points
		System.out.println("Enter each point:");
		for (int x = 0; x < pointsNum; x++) {
			for (int i = 0; i < 2; i++) {
				points[x][i] = s.nextDouble();
			}
		}
		
		//Check the points to see if they are on the same line
		if (checkLine(points))
			System.out.println("Points are all on the same line");
		else
			System.out.println("Points are not all on the same line");
	}
	
	//Method for checking if series of points are on the same line
	public static boolean checkLine(double[][] points) {
		double slope1 = ((points[0][0] - points[1][0]) / (points[0][1] - points[1][1]));
		for (int x = 2; x < points.length; x++) {
			double slope2 = ((points[0][0] - points[x][0]) / (points[0][1] - points[x][1]));
			if (slope2 != slope1)
				return false;
		}
		return true;
	}
	
}
