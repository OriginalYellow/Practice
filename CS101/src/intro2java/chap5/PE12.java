package intro2java.chap5;

public class PE12 {
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		if ((ch2 - ch1) <= 0) {
			System.out.println("invalid range");
		}
		for (int outer = (int)ch1; outer <= (int)ch2; outer++) {
			for (int inner = 0; inner < numberPerLine; inner++) {
				System.out.print((char)outer);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printChars('a', '?', 88);
	}
}
