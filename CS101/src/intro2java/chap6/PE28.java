package intro2java.chap6;

import java.util.Scanner;

public class PE28 {
	public static void main(String[] args) {
		System.out.print("Enter 10 integers: ");
		Scanner s = new Scanner(System.in);
		int[] numbers = new int[10];
		for (int x = 0; x < 10; x++) 
			numbers[x] = s.nextInt();
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 10; x++) {
				if (i == x)
					continue;
				System.out.print(numbers[i] + "-" + numbers[x] + ", ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
	}
}
