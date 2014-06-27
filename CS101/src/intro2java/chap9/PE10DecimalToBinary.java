package intro2java.chap9;

import java.util.Scanner;

public class PE10DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter a decimal value:");
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		System.out.println(decimalToBinary(decimal));
		
	}
	
	/* This is very simple and uses the formula/algorithm described here:
	 * http://answers.yahoo.com/question/index?qid=20071004212443AAIP1GC
	 * Maybe you should take some time to understand how it actually works though, later of course
	 */
	
	public static String decimalToBinary(int value) {
		
		StringBuilder binaryBuffer = new StringBuilder();
		int quotient = value;
		while (quotient > 0) {
			binaryBuffer.insert(0, (quotient % 2));
			quotient = quotient / 2;
		}
		return binaryBuffer.toString();
		
	}
}
