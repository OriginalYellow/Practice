package intro2java.chap7;

import java.util.Arrays;
import java.util.Scanner;

import customLibrary.math.RandomValues;

public class PE14 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the square 2D array:");
		int size = s.nextInt();
		int[][] squareArray = new int[size][size];
		
		//Create array
		for (int x = 0; x < size; x++) {
			for (int i = 0; i < size; i++) {
				squareArray[x][i] = RandomValues.RandomInteger(0, 2);
			}
		}
		
		//Print array
		for (int x = 0; x < size; x++) {
			for (int i = 0; i < size; i++) {
				System.out.print(squareArray[x][i]);
			}
			System.out.println();
		}
		
		//Check rows
		boolean rowCheck = true;
		for (int j = 0; j < 2; j++) {
			for (int x = 0; x < size; x++) {
				int[] check = new int[size];
				for (int i = 0; i < size; i++) {
					check[i] = squareArray[x][i];
				}
				if (winCheck(check, j)) {
					System.out.println("All " + j + "s in row " + x);
					rowCheck = false;
				}
			}
		}
		if (rowCheck)
			System.out.println("No same numbers in a row");
		
		//Check columns
		boolean columnCheck = true;
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < size; i++) {
				int[] check = new int[size];
				for (int x = 0; x < size; x++) {
					check[x] = squareArray[x][i];
				}
				if (winCheck(check, j)) {
					System.out.println("All " + j + "s in column " + i);
					columnCheck = false;
				}
			}
		}
		if (columnCheck)
			System.out.println("No same numbers in a column");
		
		//Check the major diagonal
		boolean majDiagCheck = true;
		for (int j = 0; j < 2; j++) {
			int[] check = new int[size];
			for (int i = 0, x = 0; i < size && x < size; i++, x++) {
				check[i] = squareArray[i][x];
			}
			if (winCheck(check, j)) {
				System.out.println("All " + j + "s in the major diagonal");
				majDiagCheck = false;
			}
		}
		if (majDiagCheck)
			System.out.println("No same numbers in the major diagonal");
		
		//Check the minor diagonal
		for (int j = 0; j < 2; j++) {
			int[] check = new int[size];
			for (int i = 0, x = (size - 1); i < size && x >= 0; i++, x--) {
				check[i] = squareArray[i][x];
			}
			if (winCheck(check, j))
				System.out.println("All " + j + "s in the minor diagonal");
		}
		
		//Check the sub diagonal
		boolean subDiagCheck = true;
		for (int j = 0; j < 2; j++) {
			int[] check = new int[size];
			for (int i = 1, x = 0; i < size && x < size; i++, x++) {
				check[i] = squareArray[i][x];
			}
			if (winCheck(check, j)) {
				System.out.println("All " + j + "s in the subdiagonal");
				subDiagCheck = false;
			}
		}
		if (subDiagCheck)
			System.out.println("No same numbers in the subdiagonal");
			
	}
	
	//Method for checking matches
	public static boolean winCheck(int[] array, int player) {
		int[] winCheck = new int[array.length];
		Arrays.fill(winCheck, player);
		if (Arrays.equals(array, winCheck))
			return true;
		else
			return false;
	}

}
