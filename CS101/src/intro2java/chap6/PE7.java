package intro2java.chap6;

import customLibrary.Math.RandomValues;

public class PE7 {
	public static void main(String[] args) {
		int[] count = new int[10];
		for (int x = 0; x < 100; x++) {
			int num = RandomValues.RandomInteger(0, 10);
			count[num]++;
		}
		for (int x = 0; x < 10; x++) {
			if (count[x] == 1)
				System.out.println(count[x] + " count of " + x);
			else
				System.out.println(count[x] + " counts of " + x);
		}
	}
}
