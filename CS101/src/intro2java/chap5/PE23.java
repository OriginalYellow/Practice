package intro2java.chap5;

public class PE23 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(RandomValues.RandomUppercase() + "  ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(RandomValues.RandomDigitChar() + "  ");
			}
			System.out.println();
		}
	}
}
