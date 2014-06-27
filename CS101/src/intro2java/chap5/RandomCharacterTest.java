package intro2java.chap5;

public class RandomCharacterTest {
	public static void main(String[] args) {
		System.out.println("lowercase: " + RandomCharacter.RandLowercase());
		System.out.println("uppercase: " + RandomCharacter.RandUppercase());
		System.out.println("digit: " + RandomCharacter.RandDigitChar());
		System.out.println("random character: " + RandomCharacter.RandChar());
	}
}
