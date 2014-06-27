package intro2java.chap5;

public class PE14 {
	public static void printSeries(double value) {
		System.out.println("i\tm(i)");
		double count = 0;
		for (double i = 1.0; i <= value; i++) {
			System.out.print((int)i + "\t");
			count += ((1.0 / ((2.0 * i) - 1.0)) - (1.0 / ((2.0 * i) + 1.0)));
			System.out.printf("%1.4f %n", count, "\n");	
		}
	}
	public static void main(String[] args) {
		printSeries(2);
	}
}
