package intro2java.chap5;

import customLibrary.Math.RandomValues;

public class PE32 {
	public static int roll2Dice() {
		int die1 = RandomValues.RandomInteger(1, 6);
		int die2 = RandomValues.RandomInteger(1, 6);
		int sum = die1 + die2;
		System.out.println("You rolled a " + die1 + " and a " + die2
				+ " for a total of " + sum + ".");
		return sum;
	}
	public static boolean playCraps() {
		int point = 0;
		while (true) { 
			int sum = roll2Dice();
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose!");
				return false;
			}
			if (sum == 7 || sum == 11) {
				System.out.println("You win!");
				return true;
			}
			if (sum == point) {
				System.out.println("You win!");
				return true;
			}
			else {
				point = sum;
				System.out.println("The point is now " + point + ".");
			}
		}
	}
	public static void main(String[] args) {
		int wins = 0;
		for (int x = 0; x < 10000; x++) {
			if (playCraps() == true) wins++;
		}
		System.out.println(wins);
	}
}
