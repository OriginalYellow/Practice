package intro2java.chap5;

import java.util.Random;

public class PE17 {
	public static void printMatrix(int n) {
		for (int row = 0; row < n; row++) {
			Random r = new Random();
			for (int column = 0; column < n; column++) {
				System.out.printf("%2d", r.nextInt(2));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printMatrix(100);
	}
}
