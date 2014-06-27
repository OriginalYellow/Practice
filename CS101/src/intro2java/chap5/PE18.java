package intro2java.chap5;

public class PE18 {
	public static void main(String[] args) {
		System.out.printf("%-15s%1s%n", "Number", "Square Root", "\n");
		for (int value = 0; value <= 20; value += 2) {
			System.out.printf("%-15d%1f", value, Math.sqrt(value));
			System.out.println();
		}
	}
}
