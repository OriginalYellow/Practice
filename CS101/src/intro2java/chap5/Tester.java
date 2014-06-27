package intro2java.chap5;

public class Tester {
	public static void main(String[] args) {
		int[] values1 = new int[3];
		int[] values2 = new int[3];
		boolean wat = false;
		for (int value1 = 0, value2 = 1; value1 < 3 || value2 >= 0; value1++, value2--) {
			/*values1[value1] = 1;
			values2[value2] = 1;*/
			wat = (value1 < 3 && value2 >= 0);
		}
	}
}

