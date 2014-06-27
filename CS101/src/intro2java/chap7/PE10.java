package intro2java.chap7;

import java.util.Arrays;

import customLibrary.math.RandomValues;

public class PE10 {

	public static void main(String[] args) {
		int[][] board = new int[3][3];
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 3; i++) {
				board[x][i] = RandomValues.RandomInteger(0, 2);
			}
		}
		for (int q = 0; q < 3; q++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[q][j]);
			}
			System.out.println();
		}
		for (int j = 0; j < 2; j++) {
			for (int x = 0; x < 3; x++) {
				int[] check = new int[3];
				for (int i = 0; i < 3; i++) {
					check[i] = board[x][i];
				}
				if (winCheck(check, j))
					System.out.println("All " + j + "s in row " + x);
			}
		}
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 3; i++) {
				int[] check = new int[3];
				for (int x = 0; x < 3; x++) {
					check[x] = board[x][i];
				}
				if (winCheck(check, j))
					System.out.println("All " + j + "s in column " + i);
			}
		}
		for (int j = 0; j < 2; j++) {
			int[] check = new int[3];
			for (int i = 0, x = 0; i < 3 && x < 3; i++, x++) {
				check[i] = board[i][x];
			}
			if (winCheck(check, j))
				System.out.println("All " + j + "s in the major diagonal");
		}
		for (int j = 0; j < 2; j++) {
			int[] check = new int[3];
			for (int i = 0, x = 2; i < 3 && x >= 0; i++, x--) {
				check[i] = board[i][x];
			}
			if (winCheck(check, j))
				System.out.println("All " + j + "s in the minor diagonal");
		}
	}

	public static boolean winCheck(int[] array, int player) {
		int[] winCheck = {player, player, player};
		if (Arrays.equals(array, winCheck))
			return true;
		else
			return false;
	}

}
