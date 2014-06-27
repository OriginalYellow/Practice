
package intro2java.chap9;

public class PE6 {
	
	public static void main(String[] args) {
		System.out.println(countLetters("aasdf343"));
	}

	public static int countLetters(String s) {
		
		int letterCount = 0;
		for (int x = 0; x < s.length(); x++) {
			if (Character.isLetter(s.charAt(x)))
				letterCount++;
		}
		
		return letterCount;
		
	}
	
}
