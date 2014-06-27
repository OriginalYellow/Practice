package intro2java.chap6;

import java.util.Scanner;

public class PE5 {
	
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter 10 integers:");
		for (int x = 0; x < 10; x++) {
			int currentNum = s.nextInt();
			boolean notDuplicate = true;
			for (int i = 0; i <= count; i++) {
				if (numbers[i] == currentNum)
					notDuplicate = false;
			}
			if (notDuplicate) {
				numbers[count] = currentNum;
				count++;
			}
		}
		for (int x = 0; x < count; x++) {
				System.out.print(numbers[x] + " ");
		}
	}
	
}
