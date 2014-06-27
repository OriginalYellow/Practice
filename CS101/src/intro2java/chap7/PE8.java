/*
 * create a 2d array with no length defined for the deep arrays
 * and that is the same length as the points array
 * 
 * if a new minimum distance is found, fill the minimum pairs array
 * with null
 * 
 * make a count that will mark the current position in the min pairs
 * array and will reset when a new min distance is found
 * 
 * add a new if statement that checks if the distance and min distance
 * are equal, and if they are, update the count and add the pair to 
 * the min pairs array
 * 
 * Print the min pairs array with a loop integrated into the string
 * that has the points in it, and stop the loop when a null array
 * is reached 
 */

package intro2java.chap7;

import java.util.Arrays;
import java.util.Scanner;

public class PE8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		//create array for storing all minimum pairs
		int[][] minPairs = new int[numberOfPoints][];
		int count = 0;

		// p1 and p2 are the indices in the points array
		int p1 = 0, p2 = 1; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], 
				points[p2][0], points[p2][1]); // Initialize shortestDistance

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
						points[j][0], points[j][1]); // Find distance

				if (shortestDistance > distance) {
					p1 = i; // Update p1
					p2 = j; // Update p2
					count = 0;
					Arrays.fill(minPairs, null);
					int[] pair = {i, j};
					minPairs[0] = pair;
					shortestDistance = distance; // Update shortestDistance 
				}

				if (shortestDistance == distance) {
					int[] pair = {i, j};
					minPairs[count] = pair;
					count++;
				}
			}
		}

		// Display result
		/* instead of stopping at a null entry and having to fill the array
		 * with null every time you want to start filling a dynamically
		 * populated array from the beginning, you could just reset the
		 * count that keeps track of the current index and stop displaying
		 * indexes when you get to the current count
		 */
		if (minPairs[1] == null) {
			System.out.println("The closest two points are " +
					"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
					points[p2][0] + ", " + points[p2][1] + ")");
		}
		else {
			int count2 = 0;
			System.out.println("The closest pairs of points are: ");
			int[] pair = minPairs[count2];
			while (pair != null) {
				System.out.println(points[pair[0]][0] + ", " + points[pair[0]][1] + " and "
						+ points[pair[1]][0] + ", " + points[pair[1]][1]);
				count2++;
				pair = minPairs[count2];
			}
		}
	}

	/** Compute the distance between two points (x1, y1) and (x2, y2)*/
	public static double distance(
			double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

}
