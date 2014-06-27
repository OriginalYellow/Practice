package customLibrary.math;

/*this class contains static methods
that produce various types of random
values*/

public class RandomValues {
	public static char RandomChar(char a, char b) {
		return (char)(a + Math.random() * (b - a + 1));
	}
	public static char RandomChar() {
		return (char)(0x0000 + Math.random() * (0x0000 - 0xFFFF + 1));
	}
	public static char RandomLowercase() {
		return (char)('a' + Math.random() * ('z' - 'a' + 1));
	}
	public static char RandomUppercase() {
		return (char)('A' + Math.random() * ('Z' - 'A' + 1));
	}
	public static char RandomDigitChar() {
		return (char)('0' + Math.random() * ('9' - '0' + 1));
	}
	//this method is more random than the shortcut method
	//it is also exclusive of the upper bound
	public static int RandomInteger(int a, int b) {
		int i = (int)(a + Math.random() * (b - a));
		return i;
	}
	public static double RandomDouble(double a, double b) {
		double i = (a + Math.random() * (b - a));
		return i;
	}
}
