/*
 * turn both strings into char arrays and then use loops to check:
 * 1. turn both into character arrays with toCharArray method
 * 2. use a for loop to search for the first index of the substring
 * 		in each index of the searched string
 * 3. inside that for loop, when a match is found, start a loop that
 * 	 bloo bloo
 * 4. when inner loop exits with no success, continue outer
 * 
 */

package intro2java.chap9;

import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 strings: ");
		Scanner s = new Scanner(System.in);
		String string = s.next();
		String substring = s.next();
		int index = indexOf(string, substring);
		if (index == -1)
			System.out.println("String 2 is not a substring of string 1");
		else
			System.out.println("String 2 is a substring of string 1 at index " + index);
			
		
	}
	
	public static int indexOf(String string, String substring) {
		
		char[] stringChars = string.toCharArray();
		char[] substringChars = substring.toCharArray();
		
		for (int x = 0; x < stringChars.length; x++) 
			if (stringChars[x] == substringChars[0]) {
				if (string.substring(x, (x + substring.length())).equals(substring))
					return x;
			}
		return -1;
		
	}
	
}
