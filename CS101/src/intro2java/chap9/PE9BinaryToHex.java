package intro2java.chap9;

import java.util.Scanner;

public class PE9BinaryToHex {

	public static void main(String[] args) {
		
		System.out.println("Enter a binary value:");
		Scanner s = new Scanner(System.in);
		String binaryString = s.nextLine();
		System.out.println(binaryToHex(binaryString));
		
	}

	/* This method takes a string representation of a binary value and returns the string representation
	 * of an equivalent hexadecimal value. It uses the method of converting binary to hex by converting each
	 * block of 4 binary digits into a decimal value and converting any decimal values higher than 9 into their hex
	 * equivalent. It then arranges each hex digit in the same order that their binary equivalents were arranged.
	 * For example 1010110 becomes 2 binary values and hex digits, 0110 = 6, and (0)101 = 5, so the hexadecimal
	 * value is 56. 
	 */
	public static String binaryToHex(String binaryValue) {
		
		//storage for hex digits as they are added to the hex value
		StringBuilder hexBuffer = new StringBuilder();

		///loop that goes from right to left through the binary string, decrementing by 4 and stopping when it passes 0
		for (int i = (binaryValue.length() - 1); i >= 0; i -= 4) {
			//storage for up to 4 binary digits as they are added to the binary value
			StringBuilder binaryBuffer = new StringBuilder();
			//moves up to 4 spaces from right to left through the binary string, stopping after it hits the left side (0)
			for (int j = i; j > (i - 4) && j >= 0; j--) {
				//inserts each character of the binary, as moved through by the for loop, into the buffer
				//using the insert method easily builds the value from right to left
				binaryBuffer.insert(0, binaryValue.charAt(j)); 
			}
			/* once loop is finished, uses parseInt method to turn the binaryBuffer into a decimal integer, and inserts
			 * it into hex buffer (building the value from right to left in the same manner that binaryBuffer was built). 
			 * If the decimal value is over 9, uses a simple formula for finding the proper unicode value for the hex digit
			 * equivalent and casts it to char before inserting it.
			 */
			if (Integer.parseInt(binaryBuffer.toString(), 2) > 9)
				hexBuffer.insert(0, (char)('A' + (Integer.parseInt(binaryBuffer.toString(), 2) - 10)));//the "2" indicates binary
			else
				hexBuffer.insert(0, Integer.parseInt(binaryBuffer.toString(), 2));
		}

		//returns the hexadecimal string
		return hexBuffer.toString();

	}

}
