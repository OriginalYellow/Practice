package intro2java.chap7;

import java.util.Scanner;
import java.util.Arrays;

public class PE5 {

	public static void main(String[] args) {
		System.out.println("Enter matrix 1:");
		Scanner s = new Scanner(System.in);
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 3; i++) {
				matrix1[x][i] = s.nextDouble();
			}
		}
		System.out.println("Enter matrix 2:");
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 3; i++) {
				matrix2[x][i] = s.nextDouble();
			}
		}
		double[][] matrix3 = addMatrix(matrix1, matrix2);
		System.out.println("The answer is \n" + Arrays.deepToString(matrix3));
	}



	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][];
		for (int x = 0; x < a.length; x++) {
			c[x] = new double[a[x].length];
		}
		for (int x = 0; x < c.length; x++) {
			for (int i = 0; i < c[x].length; i++) {
				c[x][i] = a[x][i] * b[x][i];
			}
		}
		return c;
	}

}
