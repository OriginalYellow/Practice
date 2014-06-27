package intro2java.chap9;

import java.util.Arrays;
import java.util.Scanner;

public class PE12 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 2 strings:");
		Scanner s = new Scanner(System.in);
		if (isAnagram(s.nextLine(), s.nextLine())) {
			System.out.println("is anagram");
		}
		else
			System.out.println("is not anagram");
		
	}

	public static boolean isAnagram(String s1, String s2) {
		
		String s1Sorted = sort(s1.toLowerCase());
		String s2Sorted = sort(s2.toLowerCase());
		return s1Sorted.equals(s2Sorted);
		
	}
	
	public static String sort(String s) {

		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);

	}
}


