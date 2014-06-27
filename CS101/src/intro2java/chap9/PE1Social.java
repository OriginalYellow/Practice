/* 1way: Use loops and Character.isDigit to check it as one string
 * 
 * another way: make methods to check
 * entire strings for if they are 
 * a type of character (digit or maybe one for '-')
 * , and turn each string of digits into separate string,
 * check their lengths and then use the check methods
 * 
 * to check the dashes, use charAt to make a string of the three
 * characters where the dashes should be, and then check for equality
 * with "---"
 * 
 * 
 */

package intro2java.chap9;

import java.util.Scanner;

public class PE1Social {
	
	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your social security number");
		String social = s.nextLine();
		String[] digits = social.split("-");
		Boolean isValid = isValidSocial(digits, social);
		if (isValid)
			System.out.println("This is a valid social security number");
		else
			System.out.println("This is an invald social security number");
		
	}
	
	public static boolean isValidSocial(String[] digits, String social) {
		
		//check if there are 3 strings of digits
		if (digits.length != 3)
			return false;
		
		//check if each string is the right length
		if (!(stringIsLength(digits[0], 3))
				|| !(stringIsLength(digits[1], 2))
				|| !(stringIsLength(digits[2], 4)))
			return false;
		
		//check if each string is made up of only digits
		for (int x = 0; x < digits.length; x++) 
			if (!stringIsAllDigits(digits[x]))
				return false;
		
		//check if there are dashes at the right indices
		String dashes = new String("" + social.charAt(3) + social.charAt(6));
		if (!dashes.equals("--"))
			return false;
		
		return true;
			
	}
	
	
	//checks a string to see if it is all digits with Character.isDigit(char)
	public static boolean stringIsAllDigits(String s) {
		
		for (int x = 0; x < s.length(); x++) {
			if (!Character.isDigit(s.charAt(x))) 
				return false;
		}
		return true;
		
	}
	
	//takes a string and a length and checks if the string is that length
	public static boolean stringIsLength(String s, int i) {
		
		if (s.length() != i)
			return false;
		else
			return true;		
		
	}

}
