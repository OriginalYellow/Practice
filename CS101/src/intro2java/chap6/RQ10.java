package intro2java.chap6;

import java.util.Arrays;

public class RQ10 {
	public static void main(String[] args) {
		int[] source = {3, 4, 5};
		int[] target = new int[3];
		System.arraycopy(source, 0, target, 0, 3);
		System.out.println(Arrays.toString(target));
	}
}
