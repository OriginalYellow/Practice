package intro2java.chap8;

import java.util.Random;

public class PE4 {

	public static void main(String[] args) {
		
		Random r = new Random(1000);
		for (int x = 0; x < 100; x++) {
			System.out.printf("%-4d", r.nextInt(50));
			if (((x + 1) % 10) == 0)
				System.out.println();
			
		}
		
	}
	
}
