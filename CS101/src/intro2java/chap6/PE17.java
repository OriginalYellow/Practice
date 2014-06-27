package intro2java.chap6;

import java.util.Arrays;

public class PE17 {

	public static void reverseSelectionSort(double[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			// Find the minimum in the list[i..list.length-1]
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
	
	public static void main(String[] args) {
		double[] list = {2,3,9,4,3,6,4,4,3,6,2,7,8,};
		reverseSelectionSort(list);
		System.out.println(Arrays.toString(list));
	}

}
