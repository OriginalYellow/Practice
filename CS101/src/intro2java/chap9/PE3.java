package intro2java.chap9;

import java.util.Scanner;

public class PE3 {

	public static void main(String[] args) {
		
		System.out.println("Enter your password:");
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
		boolean isValid = true;
		if (password.length() < 8)
			isValid = false;
		if (!checkAlphaNumberic(password))
			isValid = false;
		if (!checkDigits(password))
			isValid = false;
		if (isValid)
			System.out.println("Password is valid");
		else
			System.out.println("Password is invalid");
		
	}
	
	public static boolean checkAlphaNumberic(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i)))
				return false;
		}
		
		return true;
		
	}
	
	public static boolean checkDigits(String password) {
		
		int digitCount = 0;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i)))
				digitCount++;
		}
		
		if (digitCount < 2)
			return false;
		else
			return true;
		
	}
	
}
