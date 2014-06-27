
package intro2java.chap5;

import customLibrary.Math.RandomValues;

public class PE29 {
	public static int roll2Dice() {
		int die1 = RandomValues.RandomInteger(1, 6);
		int die2 = RandomValues.RandomInteger(1, 6);
		int sum = die1 + die2;
		System.out.println("You rolled a " + die1 + " and a " + die2
				+ " for a total of " + sum + ".");
		return sum;
	}
	public static void main(String[] args) {
		int point = 0;
		while (true) { 
			int sum = roll2Dice();
			if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose!");
				break;
			}
			if (sum == 7 || sum == 11) {
				System.out.println("You win!");
				break;
			}
			if (sum == point) {
				System.out.println("You win!");
				break;
			}
			else {
				point = sum;
				System.out.println("The point is now " + point + ".");
			}
		}
	}
}
