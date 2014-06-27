package intro2java.chap9;

import java.util.Scanner;

public class PE7PhoneNumLetters {

	public static void main(String[] args) {

		System.out.println("Enter your number:");
		Scanner s = new Scanner(System.in);
		StringBuilder number = new StringBuilder(s.nextLine());
		for (int i = 0; i < number.length(); i++) {
			if (Character.isLetter(number.charAt(i))) {
				/*i struggled to convert a digit value to a character when all i had to do
				 * was add the decimal value of '0' to it and then use (char) to cast
				 */
				number.setCharAt(i, 
						(char)('0' + getNumber((Character.toUpperCase(number.charAt(i))))));
			}
		}
		System.out.println(number);

	}
	
	/*This is a tricky algorithm for the sake of concise code and getting practice.
	 * It translates a letter into a number with the "letter-number phone button code thing". 
	 * It works off the the semi-pattern of going through each letter range and
	 * incrementing the returned value each time 3 letters are passed, but when it
	 * hits P and W, it increments by 4, making up for the slight variation in the pattern.
	 */
	public static int getNumber(char uppercaseLetter) {

		//return value to be incremented
		int num = 2;
		//value representing the amount of letters to pass before incrementing return value
		int c = 0;
		
		//goes through alphabet and increments by c letters
		for (int i = 'A'; i <= 'Z'; i += c) {
			//changes increment when pattern changes at P and W
			if (i == 'P' || i == 'W') 
				c = 4;
			else
				c = 3;
			/*goes through next c letters and checks for matches, 
			 * stops when the c'th letter after i (the current letter), is reached.
			 * returns the return value if match is found.
			 */
			for (int j = i; j < (c + i); j++) {
				if (j == uppercaseLetter)
					return num;
			}
			//increments the return value when semi-pattern completes phase
			num++;
		}

		//returns -1 if character was not an uppercase letter
		return -1;

	}

}
