package intro2java.chap7;

import java.util.Arrays;
import customLibrary.ArraySort;

public class PE16 {

	public static void main(String[] args) {
		int[][] array = {{1,3},
				{4,2},
				{4,1},
				{1,2}};
		sort(array);
		System.out.println(Arrays.deepToString(array));
	}

	public static void sort(int m[][]) {

		//Create and sort index 0 
		int[] array1 = new int[m.length];
		for (int x = 0; x < array1.length; x++) {
			array1[x] = m[x][0];
		}
		ArraySort.bubbleSortTied(array1, m);

		//Create and sort index 1
		int[] array2 = new int[m.length];
		for (int x = 0; x < array1.length; x++) {
			array2[x] = m[x][1];
		}
		
		//test code
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		//test code

		int startIndex = 0;1
		int endIndex = 0;
		for (int x = 1; x < array1.length; x++) {
			endIndex = x;
			if (m[x][0] != m[x-1][0]) {
				Arrays.sort(array2, startIndex, endIndex);
				startIndex = x;
			}
		}
		endIndex += 1;
		Arrays.sort(array2, startIndex, endIndex);
		ArraySort.bubbleSortTied(array2, m);
		System.out.println("");
	}

}
