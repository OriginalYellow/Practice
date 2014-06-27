package intro2java.chap7;

import java.util.Arrays;

public class RQ3 {
	public static void main(String[] args) {
		int[][] array = new int[5][6];
		System.out.println(Arrays.toString(array[0]));
		int[] x = {1, 2};
		array[0] = x;
		System.out.println(Arrays.toString(array[0]));
		int[] y = new int[];
	}
}
