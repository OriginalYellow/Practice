package intro2java.chap6;

import customLibrary.math.RandomValues;

public class PE13 {

	public static int getRandom(int... numbers) {
		boolean[] numberChecker = new boolean[54];
		for (int x = 0; x < numbers.length; x++) {
			numberChecker[numbers[x] - 1] = true;
		}
		int randomValue = 0;
		Boolean notValid = true;
		while (notValid ) {
			randomValue = RandomValues.RandomInteger(1, 55);
			if (numberChecker[randomValue - 1] == false)
				notValid = false;
		}
		return randomValue;
	}
	
	public static void main(String[] args) {
		int[] values = new int[52];
		for (int x = 0, j = 2; x < 52 && j < 54; x++, j++) {
			values[x] = x + 2;
		}
		for (int x = 0; x < 100; x++) {
			System.out.println(getRandom(values));
		}
	}

}

