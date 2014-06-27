package intro2java.chap6;

import customLibrary.math.*;

public class PE29 {

	/*create int picks = 0
	 *create in sum = 0
	 *make while loop (while sum != 24)
	 *inside while loop resent sum to 0
	 *put for loop in while loop that loops 4 times and generates a random number, interperates
	 *the value of its rank, adds it to the sum and prints it. if sum != print "sum doesn't equal 24"
	 *outside of for loop but inside while loop perform picks++
	 *outside of all loops print "sum equals 24" and print picks required
	 */
	public static void main(String[] args) {
		int picks = 0;
		int sum = 0;
		while (sum != 24) {
			sum = 0;
			for (int x = 0; x < 4; x++) {
				int card = RandomValues.RandomInteger(0, 52);
				sum += (card % 13) + 1;
				System.out.println((x+1) + ": " + getCardName((card / 13), (card % 13)));
				if (sum == 24) {
					boolean b = true;
				}
			}
			picks++;
			if (sum != 24)
				System.out.println("Sum doesn't equal 24\n-------------------");
			else {
				System.out.println("Sum equals 24!");
				System.out.println("Number of picks: " + picks);
			}
		}
	}

	public static String getCardName(int suit, int rank) {
		String[] suitStrings = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] rankStrings = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King"};
		String suitName = suitStrings[suit];
		String rankName = rankStrings[rank];
		return (rankName + " of " + suitName);
	}
}

