package intro2java.chap9;

public class PE30Credit {

	public static void main(String[] args) {
		
		System.out.println(isValid("4388576018410707"));

	}

	public static boolean isValid(String cardNumber) {

		if ((sumOfDoubleEvenPlace(cardNumber) + sumOfOddPlace(cardNumber))
				% 10 != 0)
			return false;
		else
			return true;

	}

	public static int sumOfDoubleEvenPlace(String cardNumber) {

		StringBuffer sb = new StringBuffer(cardNumber);
		sb.reverse();
		int num = getDigit(Character.getNumericValue(sb.charAt(1))*2);
		for (int x = 3; x < cardNumber.length(); x += 2)
			num += getDigit(Character.getNumericValue(sb.charAt(x))*2);
		return num;		

	}

	public static int getDigit(int number) {

		if (number / 10 != 0) {
			return (number % 10) + 1; 
		}
		else
			return number;

	}

	public static int sumOfOddPlace(String cardNumber) {

		StringBuffer sb = new StringBuffer(cardNumber);
		sb.reverse();
		int num = 0;
		for (int x = 0; x < cardNumber.length(); x += 2)
			num += Character.getNumericValue(sb.charAt(x));
		return num;

	}
}
