package intro2java.Chap13;

import java.util.Scanner;

public class PE3 {
	
	public static void main(String[] args) {
		int[] ints = new int[100];
		for (int x = 0; x < 100; x++) {
			ints[x] = (int)(Math.random() * 100);
		}
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an index to display its value: ");
		try {
			System.out.println(ints[s.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}
	}
	
}
