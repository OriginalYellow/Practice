package intro2java.chap6;

import java.util.Arrays;

public class PE15 {
	public static int[] eliminateDuplicates(int[] numbers) {
		int count = 0;
		int temp[] = new int[numbers.length];
		for (int x = 0; x < numbers.length; x++) {
			boolean notDuplicate = true;
			for (int i = 0; i <= count; i++) {
				if (temp[i] == numbers[x])
					notDuplicate = false;
			}
			if (notDuplicate) {
				temp[count] = numbers[x];
				count++;
			}
		}
		int[] noDuplicates = Arrays.copyOf(temp, count);
		return noDuplicates;
	}
	public static void main(String[] args) {
		int[] values = {1, 4, 5, 4, 1, 8, 454, 492, 455};
		System.out.println(Arrays.toString(eliminateDuplicates(values)));
	}
}

