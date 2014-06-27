package intro2java.chap6;

import java.util.Scanner;
import java.util.Arrays;

public class PE27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter list 1: ");
		int[] list1 = new int[s.nextInt()];
		for (int x = 0; x < list1.length; x++)
			list1[x] = s.nextInt();
		System.out.print("Enter list 2: ");
		int[] list2 = new int[s.nextInt()];
		for (int x = 0; x < list1.length; x++)
			list2[x] = s.nextInt();
		if (equal(list1, list2))
			System.out.println("Lists are identical");
		else
			System.out.println("Lists are not identical");
	}

	public static boolean equal(int[] list1, int[] list2) {
		if (list2.length != list1.length)
			return false;
		Arrays.sort(list1);
		Arrays.sort(list2);
		for (int x = 0; x < list1.length; x++) {
			if (list1[x] != list2[x])
				return false;
		}
		return true;
	}

}
