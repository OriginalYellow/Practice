package intro2java.chap5;

public class PE13 {
	public static void printSeries(int value) {
		System.out.println("i\tm(i)");
		double count = 0;
		for (double i = 1; i <= value; i++) {
			System.out.print((int)i + "\t");
			count += ((i) / (1 + i));
			System.out.printf("%1.4f %n", count, "\n");	
		}
	}
	public static void main(String[] args) {
		printSeries(20);
	}
}

