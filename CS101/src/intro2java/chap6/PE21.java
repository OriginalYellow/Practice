package intro2java.chap6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class PE21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of beans:");
		int beans = s.nextInt();
		System.out.println("Enter the number of slots:");
		int slots = s.nextInt();

		int[] beanMachine = new int[slots];
		Arrays.fill(beanMachine, -1);

		for (int x = 0; x < beans; x++) {
			PrintPath(DropBall(beanMachine));
		}

		System.out.println();
		PrintHistogram(beanMachine, beans);

	}

	public static boolean[] DropBall(int[] beanMachine) {
		boolean[] path = new boolean[beanMachine.length -1];
		Random r = new Random();
		int rightCount = 0;
		for (int x = 0; x < path.length; x++) 
			path[x] = r.nextBoolean();
		for (int x = 0; x < path.length; x++) {
			if (path[x])
				rightCount++;
		}
		beanMachine[rightCount]++;
		return path;
	}

	public static void PrintPath(boolean[] path) {
		for (int x = 0; x < path.length; x++) {
			if (path[x])
				System.out.print("R ");
			else
				System.out.print("L ");
		}
		System.out.println();
	}

	public static void PrintHistogram(int[] beanMachine, int beans) {
		for (int x = beans - 1; x >= 0; x--) {
			boolean[] row = new boolean[beanMachine.length];
			for (int i = 0; i < row.length; i++) {
				if (beanMachine[i] >= x)
					row[i] = true;
			}
			boolean empty = true;
			for (int i = 0; i < row.length; i++) {
				if (row[i])
					empty = false;
			}
			if (empty)
				continue;
			else {
				for (int y = 0; y < row.length; y++) {
					if (row[y])
						System.out.print("O ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

