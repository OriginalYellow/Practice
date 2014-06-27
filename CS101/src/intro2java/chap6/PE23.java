package intro2java.chap6;

import java.util.Arrays;

public class PE23 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		Arrays.fill(lockers, true);
		for (int student = 2; student <= 100; student++)
			closeLockers(student, lockers);
		printLockers(lockers);
	}

	public static void closeLockers(int student, boolean[] lockers) {
		for (int locker = student - 1 + student ;
				locker < 100; locker += student) 
			lockers[locker] = false;
	}

	public static void printLockers(boolean[] lockers) {
		int count = 0;
		for (int x = 0; x < lockers.length; x++) {
			if (lockers[x])
				System.out.print("O ");
			else
				System.out.print("C ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}
	}

}
