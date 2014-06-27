package intro2java.Chap13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PE2 {

	public static void main(String[] args) {
		System.out.print("Enter 2 integers to be added together: ");
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			try {
				num1 = s.nextInt();
			} catch (InputMismatchException ex) {
				System.out.print("Invalid input: " + s.next() 
						+ "\nEnter again: ");
				continue;
			}
			try {
				num2 = s.nextInt();
				break;
			} catch (InputMismatchException ex) {
				System.out.print("Invalid input: " + s.next() 
						+ "\nEnter again: ");
				continue;
			}
		}
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
