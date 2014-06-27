package intro2java.chap14;

import java.util.Date;

public class PE9 {
	
	public static Object max(Comparable[] a) {
		if (a.length < 1) {
			return null;
		}
		Object max = a[0];
		for (int x = 1; x < a.length; x++) {
			if (a[x].compareTo(max) > 0) {
				max = a[x];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Integer[] i = {1, 5, 2, 6, 2, 1};
		String[] s = {"a", "c", "b"};
		java.util.Date[] d = {new java.util.Date(), new java.util.Date(), new java.util.Date()};
		System.out.println(max(d));
	}

}
