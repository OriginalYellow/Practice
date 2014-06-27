package intro2java.chap9;

import java.util.Arrays;

public class PE11 {

	public static void main(String[] args) {

		System.out.println(sort("lasdgioaogohasdhlgkjqiwoi"));

	}

	public static String sort(String s) {

		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);

	}

}