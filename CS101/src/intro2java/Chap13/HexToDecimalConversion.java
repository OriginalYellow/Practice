
package intro2java.Chap13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexToDecimalConversion {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));
	}

	public static int hexToDecimal(String hex) throws NumberFormatException {
		hex = hex.trim();
		Pattern p = Pattern.compile("[A-F[1-9]]");
		Matcher m = p.matcher(hex);
		for (int x = 0; x < hex.length(); x++) {
			if (!m.find(x)) {
				throw new NumberFormatException();
			}
			if (m.start() != x) {
				throw new NumberFormatException();
			}
		}
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1', ..., or '9'
			return ch - '0';
	}
}
