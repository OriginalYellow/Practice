package intro2java.chap6;

import java.util.Arrays;

public class PE12 {

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		int[] temp = Arrays.copyOf(list, list.length);
		for (int i = 0, j = result.length - 1;
				i < list.length; i++, j--) {
			result[j] = temp[i];
			list[j] = result[j];
		}
		return list;
	}

	public static void main(String[] args) {
		int[] values = {1,2,3,4,5};
		//System.out.println(Arrays.toString(reverse(values)));
		reverse(values);
		System.out.println(Arrays.toString(values));
	}

}

