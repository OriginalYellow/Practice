package intro2java.chap5;

import java.util.Scanner;


public class PE2 {
	public static int sumDigits(long n) {
		int i = 0;
		int x = (int)n;
		while (x != 0) {
			i = (i + (x % 10));
			x = x / 10;
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		System.out.println("The sum of the digits in " + n + " is " + sumDigits(n));
	}
}
