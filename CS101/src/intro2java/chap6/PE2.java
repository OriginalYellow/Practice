package intro2java.chap6;

import java.util.Scanner;
import java.util.Arrays;

public class PE2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for (int x = 0; x < numbers.length; x++) 
			numbers[x] = s.nextInt();
		int[] reversedNumbers = new int[10];
		for (int j = numbers.length - 1, i = 0; j >= 0; j--, i++) {
			reversedNumbers[j] = numbers[i];
		}
		System.out.println(Arrays.toString(reversedNumbers));
	}
	
}
