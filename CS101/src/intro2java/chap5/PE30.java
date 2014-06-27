package intro2java.chap5;

import static customLibrary.Math.Prime.primeCheck;

public class PE30 {
	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			if (primeCheck(num) && primeCheck(num + 2)) {
				System.out.println("(" + num + ", " + (num + 2) + ")");
			}
		}
	}
}
