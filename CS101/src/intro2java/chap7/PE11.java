/* read int and convert to binary string
 * 
 * use String.toCharArray to convert the string to a character array
 * 
 * 
 */


package intro2java.chap7;

import java.util.Arrays;
import java.util.Scanner;

public class PE11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 511:");
		int num = s.nextInt();
		String binaryString = Integer.toBinaryString(num);
		char[] binaryArray = binaryString.toCharArray();
		printMatrix(binaryArray);
	}

	public static void printMatrix(char[] binaryArray) {
		char[] binaryArray2 = new char[9];
		Arrays.fill(binaryArray2, 0, (9 - binaryArray.length), '0');
		int startIndex = 9 - binaryArray.length;
		for (int x = startIndex, i = 0; x < 9; x++, i++) {
			binaryArray2[x] = binaryArray[i];
		}
		for (int x = 0; x < 9; x++) {
			if (binaryArray2[x] == '0')
				System.out.print("H ");
			else
				System.out.print("T ");
			if ((((x + 1) % 3) == 0) && (x != 0))
				System.out.println();
		}
		
	}

}
