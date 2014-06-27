
package intro2java.chap6;

import java.util.Scanner;

public class PE3 {
	public static void main(String[] args) {
		int[] count = new int[101];
		Scanner s = new Scanner(System.in);
		while (true) {
			int currentNum = s.nextInt();
			if (currentNum == 0) break;
			if (currentNum < 0 || currentNum > 100) {
				System.out.println("Invalid entry");
				continue;
			}
			count[currentNum]++; 
		}
		for (int x = 0; x <= 100; x++) {
			if (count[x] > 0) {
				if (count[x] > 1)	
					System.out.println(
							x + " occurs " + count[x] + " times.");
				else 
					System.out.println(
							x + " occurs 1 time.");
			}
		}
	}
}