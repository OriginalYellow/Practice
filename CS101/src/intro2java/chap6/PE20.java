/*8 rows, 8 columns, 16 diagonals that intersect.
 * 
 *1 boolean array for rows, 1 for columns, each 8 long,
 *Each value represents a space.
 *
 *When 1 value in a row or column is true, it's taken,
 *and can't be occupied by another queen.
 *
 *-----------------------------------------------
 *
 *you can check diagonals with a 64 length array by
 *adding and subtracting 9 from the origin space to
 *get the top left to bottom right diagonal, and adding
 *and subtracting 7 to get the diagonal from the bottom
 *left to the top right. also, stop checking when you hit
 *the upper or lower bounds of the array.
 *
 */

package intro2java.chap6;

import java.util.Arrays;

public class PE20 {
	public static void main(String[] args) {
		Boolean[] rows = new Boolean[8];
		Arrays.fill(rows, false);
		Boolean[] columns = new Boolean[8];
		Arrays.fill(columns, false);
		Boolean[] spaces = new Boolean[64];
		Arrays.fill(spaces, false);
		Boolean notEmpty = false;
		for (int row = 0; row < 8; row++) {
			int space = 0;
			notEmpty = false;
			if (rows[row] == false) {
				for (int column = 0; column < 8; column++) {	
					if (rows[row] == false && columns[column] == false) {
						space = column + (row * 8);
						for (int checkSpace = space + 7; checkSpace < 64; checkSpace += 7) {
							if (spaces[checkSpace]) {
								notEmpty = true;
								break;
							}
							if (checkSpace == 0 || checkSpace == 1 || checkSpace == 2 || checkSpace == 3 || checkSpace == 4 || checkSpace == 5 || checkSpace == 6 || checkSpace == 7 || checkSpace == 56 || checkSpace == 57 || checkSpace == 58 || checkSpace == 59 || checkSpace == 60 || checkSpace == 61 || checkSpace == 62 || checkSpace == 63 || checkSpace == 7 || checkSpace == 15 || checkSpace == 23 || checkSpace == 31 || checkSpace == 39 || checkSpace == 47 || checkSpace == 55 || checkSpace == 8 || checkSpace == 16 || checkSpace == 24 || checkSpace == 32 || checkSpace == 40 || checkSpace == 48)
									break;
						}
						if (notEmpty == false) {
							for (int checkSpace = space - 7; checkSpace >= 0; checkSpace -= 7) {
								if (spaces[checkSpace]) {
									notEmpty = true;
									break;
								}
								if (checkSpace == 0 || checkSpace == 1 || checkSpace == 2 || checkSpace == 3 || checkSpace == 4 || checkSpace == 5 || checkSpace == 6 || checkSpace == 7 || checkSpace == 56 || checkSpace == 57 || checkSpace == 58 || checkSpace == 59 || checkSpace == 60 || checkSpace == 61 || checkSpace == 62 || checkSpace == 63 || checkSpace == 7 || checkSpace == 15 || checkSpace == 23 || checkSpace == 31 || checkSpace == 39 || checkSpace == 47 || checkSpace == 55 || checkSpace == 8 || checkSpace == 16 || checkSpace == 24 || checkSpace == 32 || checkSpace == 40 || checkSpace == 48)
									break;
							}
						}
						if (notEmpty == false) {
							for (int checkSpace = space - 9; checkSpace >= 0; checkSpace -= 9) {
								if (spaces[checkSpace]) {
									notEmpty = true;
									break;
								}
								if (checkSpace == 0 || checkSpace == 1 || checkSpace == 2 || checkSpace == 3 || checkSpace == 4 || checkSpace == 5 || checkSpace == 6 || checkSpace == 7 || checkSpace == 56 || checkSpace == 57 || checkSpace == 58 || checkSpace == 59 || checkSpace == 60 || checkSpace == 61 || checkSpace == 62 || checkSpace == 63 || checkSpace == 7 || checkSpace == 15 || checkSpace == 23 || checkSpace == 31 || checkSpace == 39 || checkSpace == 47 || checkSpace == 55 || checkSpace == 8 || checkSpace == 16 || checkSpace == 24 || checkSpace == 32 || checkSpace == 40 || checkSpace == 48)
									break;
							}
						}
						if (notEmpty == false) {
							for (int checkSpace = space + 9; checkSpace < 64; checkSpace += 9) {
								if (spaces[checkSpace]) {
									notEmpty = true;
									break;
								}
								if (checkSpace == 0 || checkSpace == 1 || checkSpace == 2 || checkSpace == 3 || checkSpace == 4 || checkSpace == 5 || checkSpace == 6 || checkSpace == 7 || checkSpace == 56 || checkSpace == 57 || checkSpace == 58 || checkSpace == 59 || checkSpace == 60 || checkSpace == 61 || checkSpace == 62 || checkSpace == 63 || checkSpace == 7 || checkSpace == 15 || checkSpace == 23 || checkSpace == 31 || checkSpace == 39 || checkSpace == 47 || checkSpace == 55 || checkSpace == 8 || checkSpace == 16 || checkSpace == 24 || checkSpace == 32 || checkSpace == 40 || checkSpace == 48)
									break;
							}
						}
						if (notEmpty == false) {
							columns[column] = true;
							rows[row] = true;
							spaces[space] = true;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(rows));
		System.out.println(Arrays.toString(columns));
		System.out.println(Arrays.toString(spaces));
		for (int currentSpace = 0; currentSpace < 64; currentSpace++) {
			if (spaces[currentSpace]) {
				if (currentSpace == 63)
					System.out.print("|Q|");
				else if ((currentSpace) % 8 == 0 && currentSpace != 0
						|| currentSpace == 64)
					System.out.print("|\n|Q");
				else
					System.out.print("|Q");
			}
			else
				if (currentSpace == 63)
					System.out.print("| |");
				else if ((currentSpace) % 8 == 0 && currentSpace != 0
						|| currentSpace == 64)
					System.out.print("|\n| ");
				else
					System.out.print("| ");
		}
	}
}

