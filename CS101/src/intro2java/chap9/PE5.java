/*
 * write an outer for loop to go through the string's elements
 * 
 * write an inner for loop to go through the int array and 
 * add values
 * 
 */

package intro2java.chap9;

import java.util.Arrays;

public class PE5 {

	public static void main(String[] args) {
		int[] digits = count("122378jj11");
		System.out.println(Arrays.toString(digits));
	}

	public static int[] count(String s) {

		int[] digits = new int[10];
		for (int x = 0; x < s.length(); x++) {
			if (Character.isDigit(s.charAt(x))) {
				int currentNum = Character.getNumericValue(s.charAt(x));
				digits[currentNum]++;
			}
		}

		return digits;

	}

}
