package intro2java.chap9;

public class PE8BinaryToDecimal {
	
	public static void main(String[] args) {
		
		System.out.println(binaryToDecimal("10001"));
		
	}

	/*
	 * This method takes a string that is a binary number and returns the
	 * decimal conversion. It uses a computer algorithm-friendly version of the usual
	 * binary conversion formula - found on page 312 of the textbook. This is very
	 * elegantly written code that I actually copy-pasted from that page. it goes
	 * through the formula in an easily traceable way if you think through it methodically
	 * and algorithmically.
	 */
	public static int binaryToDecimal(String binaryString) {

		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			char decimalChar = binaryString.charAt(i);
			decimalValue = decimalValue * 2 + Character.getNumericValue(decimalChar);
		}
		return decimalValue;

	}

}
