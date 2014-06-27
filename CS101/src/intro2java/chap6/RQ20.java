package intro2java.chap6;

import java.util.Arrays;

public class RQ20 {
	public static double[] selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; j++) {
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
		return list;
	}
	public static void main(String[] args) {
		double[] d = {1,5,3,7,4,5,2};
		d = selectionSort(d);
		System.out.println(Arrays.toString(d));
	}
}
