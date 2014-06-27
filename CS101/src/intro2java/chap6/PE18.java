package intro2java.chap6;

import java.util.Arrays;

public class PE18 {

	public static void bubbleSort(double[] list) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] > list[j]) {
					notSorted = true;
					double jTemp = list[j];
					list[j] = list[i];
					list[i] = jTemp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		double[] list = {23,92,53,94,77,87,11,77};
		bubbleSort(list);
		System.out.println(Arrays.toString(list));
	}

}
