package intro2java.chap10;

import java.util.Scanner;

public class PE7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		Scanner s = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			accounts[x] = new Account((x + 1), 100);
		}

		while (true) {
			int ID = 0;
			System.out.print("Enter an ID: ");
			ID = s.nextInt();
			if (ID < 1 || ID > 10) {
				System.out.println("Invalid ID");
				continue;
			}
			while (true) {
				boolean exit = false;

				System.out.print("Main Menu \n" +
						"1: check balance\n" +
						"2: withdraw\n" +
						"3: deposit\n" +
						"4: exit\n" +
						"Enter a choice: ");
				switch (s.nextInt()) {
				case 1:
					System.out.println("The balance is " + accounts[ID].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to withdraw: ");
					accounts[ID].withdraw(s.nextDouble());
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					accounts[ID].deposit(s.nextDouble());
					break;
				case 4:
					exit = true;
					break;
				default: 
					break;
				}
				System.out.println();
				if (exit) {
					break;
				}
			}
		}
	}

}
