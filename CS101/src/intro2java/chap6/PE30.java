package intro2java.chap6;

import java.util.Scanner;

public class PE30 {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the series of numbers: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		System.out.println("Enter the series of numbers: ");
		int[] values = new int[size];
		for (int x = 0; x < size; x++)
			values[x] = s.nextInt();
		if (isConsecutiveFour(values))
			System.out.println("The series contains 4 consecutive numbers with the same value");
		else
			System.out.println("The series does not contain 4 consecutive numbers with the same value");

	}
	
	public static boolean isConsecutiveFour(int[] values) {
		int temp = values[0];
		int matches = 0;
		for (int x = 1; x < values.length; x++) {
			if (values[x] == temp) {
				matches++;
			} else
				matches = 0;
			if (matches == 3)
				return true;
			temp = values[x];
		}
		return false;
	}
	
}
