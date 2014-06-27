package intro2java.chap5;

import java.util.Scanner;

public class PE1 {
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1) / 2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of pentagonal numbers desired.");
		int x = s.nextInt();
		int c = 1;
		do {
			System.out.print(getPentagonalNumber(c) + " ");
			c += 1;
			if ((c - 1) % 10 == 0 ) System.out.println();
		}
		while (c <= x);
	}

}

