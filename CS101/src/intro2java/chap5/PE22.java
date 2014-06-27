package intro2java.chap5;

import java.util.Scanner;

public class PE22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value to find its square root");
		double num = s.nextDouble();
		double lastGuess = 2;
		double nextGuess = 1;
		while (Math.abs(nextGuess - lastGuess) > .0001) {
			lastGuess = nextGuess;
			nextGuess = ((lastGuess + (num / lastGuess)) / 2);
		}
		System.out.println(nextGuess + " is the approximate root of " + num + ".");
		System.out.println(Math.sqrt(num) + " is the exact root of " + num + ".");
	}
}
