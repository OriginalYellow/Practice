//this works but I think that if I flipped all the solutions I could get the remaining 28 solutions

package intro2java.chap6;

public class PE22 {

	public static void main(String[] args) {
		int solutions = 0;
		for (int x = 1; x < 65; x++) {
			int startRow = x / 9;
			int startColumn = (x % 8) - 1;
			if (startColumn == -1)
				startColumn = 7;
			solutions += findSolution(startRow, startColumn);
		}
		System.out.println("Number of solutions found: " + solutions);
	}

	public static int findSolution(int startRow, int startColumn) {
		// Queen positions
		int[] queens = new int[8]; // queens are placed at (i, queens[i])

		for (int i = 0; i < 8; i++)
			queens[i] = -1; // -1 indicates that no queen is currently placed in the
		// ith row
		queens[startRow] = startColumn; // Initially, place a queen at (0, 0) in the 0th row

		// k - 1 indicates the number of queens placed so far
		// We are looking for a position in the kth row to place a queen
		int k = startRow + 1;
		int queenCount = 0;
		boolean successful = true;
		boolean stopper = false;
		if (startRow == 7)
			stopper = true;
		while (queenCount < 7) {
			if (k > 7)
				k = 0;
			if (k < 0)
				k = 7;
			if (k == startRow) {
				successful = false;
				break;
			}
			// Find a position to place a queen in the kth row
			int j = findPosition(k, queens);
			if (j < 0) {
				queens[k] = -1;
				k--; // back track to the previous row
				queenCount--; // this method of tracking queens is flawed
			} else {
				queens[k] = j;
				k++;
				queenCount++;
			}
		}
		if(successful) {
			printResult(queens);
			return 1;
		} else {
			return 0;
		}

	}

	public static int findPosition(int k, int[] queens) {
		//starts at j = 0 if k row is new, and after the failed old j if it is old
		int start = queens[k] == -1 ? 0 : queens[k] + 1;

		for (int j = start; j < 8; j++) {
			if (isValid(k, j, queens))
				return j; // (k, j) is the place to put the queen now
		}

		return -1;
	}

	/** Return true if you a queen can be placed at (k, j) */

	public static boolean isValid(int k, int j, int queens[]) {
		// See if (k, j) is a possible position
		// Check jth column
		for (int i = 0; i <= 7; i++)// checks if there is a queen in the j column until the current row inclusive
			if (queens[i] == j)
				return false;

		// checks each major diagonal row and column starting from the current space until they are 0
		for (int row = k - 1, column = j - 1; row >= 0 && column >= 0; row--, column--)
			if (queens[row] == column)
				return false;

		for (int row = k + 1, column = j + 1; row <= 7 && column <= 7; row++, column++)
			if (queens[row] == column)
				return false;

		// checks each minor diagonal row and column starting from the current space until hitting the top or right side
		for (int row = k - 1, column = j + 1; row >= 0 && column <= 7; row--, column++)
			if (queens[row] == column)
				return false;

		for (int row = k + 1, column = j - 1; row <= 7 && column >=  0; row++, column--)
			if (queens[row] == column)
				return false;

		return true;
	}

	/** Print a two-dimensional board to display the queens */
	public static void printResult(int[] queens) {
		for (int i = 0; i < 8; i++)
			System.out.println(i + ", " + queens[i]);
		System.out.println();

		// Display the output
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < queens[i]; j++)
				System.out.print("| ");
			System.out.print("|Q|");
			for (int j = queens[i] + 1; j < 8; j++)
				System.out.print(" |");
			System.out.println();
		}
	}
}
