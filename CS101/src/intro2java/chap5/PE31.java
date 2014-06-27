package intro2java.chap5;

public class PE31 {
	public static boolean isValid(long number) {
		long sum = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number));
		boolean isValid = ((sum % 10) == 0) ? true : false;
		return  isValid;
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		String longString = ("" + number);
		char[] longCharArray = longString.toCharArray();
		int sum = 0;
		for (int x = (longString.length() - 2); x >= 0; x -= 2) {
			sum += getDigit((longCharArray[x]) - 48);
		}
		return sum;
	}
	
	public static int getDigit(int number) {
		int doubled = (number * 2);
		if ((doubled / 10) > 0) {
			return ((doubled / 10) + (doubled % 10));
		}
		else return doubled;
	}
	
	public static int sumOfOddPlace(long number) {
		String longString = ("" + number);
		char[] longCharArray = longString.toCharArray();
		int sum = 0;
		for (int x = (longString.length() - 1); x >= 0; x -= 2) {
			sum += ((longCharArray[x]) - 48);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*The "l" at the end of the input is needed
		 * to explicitly cast to long */
		System.out.println(isValid(4388576018410707l)); 
	}
}
