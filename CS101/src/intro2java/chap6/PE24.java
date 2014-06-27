package intro2java.chap6;

import java.util.Arrays;
import customLibrary.math.RandomValues;

public class PE24 {
	public static void main(String[] args) {
		boolean[] suitsCheck = new boolean[4];
		Arrays.fill(suitsCheck, false);
		int[] pickedSuits = new int[4];
		int[] pickedRanks = new int[4];
		int counter = 0;
		int picks = 0;
		while (counter < 4) {
			int picked = RandomValues.RandomInteger(0, 52);
			counter += addToPicked(suitsCheck, pickedSuits, pickedRanks, picked, counter);
			picks++;
		}
		printPicked(pickedSuits, pickedRanks);
		System.out.println("Number of picks needed: " + picks);
	}

	public static int addToPicked(boolean[] suitsCheck, int[] pickedSuits,
			int[] pickedRanks, int picked, int counter) {
		int suit = picked / 13;
		if (suitsCheck[suit])
			return 0;
		else {
			suitsCheck[suit] = true;
			pickedSuits[counter] = suit;
			pickedRanks[counter] = picked % 13;
			return 1;
		}
	}

	public static void printPicked(int[] pickedSuits, int[] pickedRanks) {
		for (int i = 0; i < 4; i++) {
			String[] suitStrings = {"Spades", "Hearts", "Clubs", "Diamonds"};
			String[] rankStrings = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "Jack", "Queen", "King"};
			String suit = suitStrings[pickedSuits[i]];
			String rank = rankStrings[pickedRanks[i]];
			System.out.println("Card number " + (i + 1) + ": " 
					+ rank + " of " + suit);
		}
	}
	
}
