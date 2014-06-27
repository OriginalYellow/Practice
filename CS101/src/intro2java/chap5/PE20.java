package intro2java.chap5;

public class PE20 {
	public static void main(String[] args) {
		System.out.printf("%15s%15s%15s%n", "Degree", "Sin", "Cos");
		for (double degree = 0; degree <= 360; degree += 10) {
			double sin = Math.sin(degree);
			double cos = Math.cos(degree);
			System.out.printf("%15.0f%15.4f%15.4f%n", degree, sin, cos, "\n");
		}
		System.out.println(Math.sin(360));
	}
}
