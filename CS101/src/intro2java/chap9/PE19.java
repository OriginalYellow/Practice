package intro2java.chap9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PE19 {

	public static void main(String[] args) throws Exception {

		File file = new File("Exercise9_19.txt");
		file.deleteOnExit();
		PrintWriter p = new PrintWriter(file);
		for (int x = 0; x < 100; x++) {
			int random = (int)(1 + (Math.random() * 1000));
			p.println(random);
		}
		p.close();
		
		Scanner s = new Scanner(file);
		int[] ints = new int[100];
		int index = 0;
		while (s.hasNextInt()) {
			ints[index] = s.nextInt();
			index++;
		}

		Arrays.sort(ints);
		for (int x = 0; x < ints.length; x++) {
			System.out.printf("%-5d", ints[x]);
			if ((x + 1) % 10 == 0)
				System.out.println();
		}
		
	}

}
