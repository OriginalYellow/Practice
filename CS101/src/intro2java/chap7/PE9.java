
package intro2java.chap7;

import java.util.Scanner;
import java.util.Arrays;

public class PE9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[][] board = new char[3][3];
		for (int x = 0; x < 3; x++)
			Arrays.fill(board[x], ' ');
		int turn = 0;
		char player = 'X';
		while (true) {
			if (turn < 1) {
				player = 'X';
				turn++;
			}
			else {
				player = 'O';
				turn--;
			}
			while (true) {
				System.out.println("Enter a row (1, 2, or 3) for player " + player + ":");
				int row = s.nextInt() - 1;
				System.out.println("Enter a column (1, 2, or 3) for player " + player + ":");
				int column = s.nextInt() - 1;
				int space = modifyBoard(board, row, column, player);
				if (space < 1)
					System.out.println("Space is filled, try again.\n");
				else
					break;
			}
			printBoard(board);
			if (checkWin(board, player)) {
				System.out.println("Player " + player + " wins!");
				break;
			}
			if (checkTie(board)) {
				System.out.println("Nobody wins!");
				break;
			}
		}
	}

	public static int modifyBoard(char[][] board, int row, int column, char player) {
		if (board[row][column] == ' ') {
			board[row][column] = player;
			return 1;
		}
		else
			return -1;
	}

	public static boolean checkWin(char[][] board, char player) {
		char[] winCheck = {player, player, player};
		for (int i = 0; i < 3; i++) {
			char[] currentCheck = {' ', ' ', ' '};
			for (int j = 0; j < 3; j++) {
				currentCheck[j] = board[i][j];
			}
			if (Arrays.equals(winCheck, currentCheck))
				return true;
		}
		for (int j = 0; j < 3; j++) {
			char[] currentCheck = {' ', ' ', ' '};
			for (int i = 0; i < 3; i++) {
				currentCheck[i] = board[i][j];
			}
			if (Arrays.equals(winCheck, currentCheck))
				return true;
		}
		char[] currentCheck = {' ', ' ', ' '};
		for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) 
			currentCheck[i] = board[i][j];
		if (Arrays.equals(winCheck, currentCheck))
			return true;
		Arrays.fill(currentCheck, ' ');
		for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) 
			currentCheck[i] = board[i][j];
		if (Arrays.equals(winCheck, currentCheck))
			return true;
		return false;
	}

	public static boolean checkTie(char[][] board) {
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 3; j++) 
				if (board[i][j] == ' ')
					return false;
		return true;
	}

	public static void printBoard(char[][] board) {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + board[i][j] + " |");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}

}
