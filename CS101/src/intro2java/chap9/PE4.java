package intro2java.chap9;

import java.util.Scanner;

public class PE4 {
	
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Enter a character:");
		String a = s.nextLine();
		while (true) {
			if (a.length() > 1) {
				System.out.println("That is not a single character");
				a = s.nextLine();
			}
			else
				break;
		}
		
		int charCount = count(str, a.charAt(0));
		System.out.println("Your string has " + charCount + " instances of the character " + a);
	}
	
	public static int count(String str, char a) {
		
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				charCount++;
		}
		return charCount;
		
	}

}
