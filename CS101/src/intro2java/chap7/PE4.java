package intro2java.chap7;
/*use a for loop to add each row and store each sum in an array.
 * sort the sum array and tie the sort to the employees array.
 * display the employees array backwards. 
 */

import customLibrary.ArraySort;

public class PE4 {

	public static void main(String[] args) {
		int[][] employees = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}};
		int[] sums = new int[employees.length];
		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < employees[i].length; j++) {
				sums[i] += employees[i][j];
			}
		}
		int[] employeeIndices = new int[employees.length];
		int num = 0;
		for (int x = 0; x < employeeIndices.length; x++) {
			employeeIndices[x] += num;
			num += 1;
		}
		ArraySort.bubbleSortTied(sums, employeeIndices);
		for (int x = sums.length - 1; x >= 0; x--) {
			System.out.println("Employee " + employeeIndices[x] +
					" has worked a total of " + sums[x] + " hours");
		}
	}

}
