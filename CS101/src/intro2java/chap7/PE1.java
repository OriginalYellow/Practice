package intro2java.chap7;

import java.util.Scanner;

public class PE1 {

	public static void main(String[] args) {
		int[][] m = new int[4][4];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = s.nextInt();
			}	
		}
		System.out.println("Sum of the matrix is " + sumMatrix(m));
	}

		public static double sumMatrix(int[][] m) {
			double sum = 0;
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					sum += m[i][j];
				}
			}
			return sum;
		}

	}
