/* Read the filing status as an int
 * 
 * Read the earnings as a double
 * 
 * do the thing
 */

package intro2java.chap7;

import java.util.Scanner;

public class PE12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"(0-single filer, 1-married jointly,\n" +
						"2-married separately, 3-head of household)\n" +
				"Enter the filing status: ");
		int status = s.nextInt();
		System.out.println("Enter the earnings:");
		double earnings = s.nextDouble();
		System.out.println(getTax(status, earnings));
	}

	public static double getTax(int status, double earnings) {
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		double[][] brackets = {
				{8350, 33950, 82250, 171550, 372950}, // Single filer 
				{16700, 67900, 137050, 20885, 372950}, // Married jointly 
				{8350, 33950, 68525, 104425, 186475}, // Married separately 
				{11950, 45500, 117450, 190200, 372950} // Head of household
		};
		double tax = 0;
		int i = 5;
		for (int x = 0; x < 4; x++) {
			if (earnings <= brackets[status][x]) {
				i = x;
				break;
			}
		}
		for (int x = 0; x < 5; x++) {
			if (i == 0)
				return (earnings * rates[0]);
			else if (x == 0)
				tax += (brackets[status][0] * rates[0]);
			if (x == i) { 
				tax += ((earnings - brackets[status][x - 1]) * rates[x]);
				return tax;
			} else if (x > 0)
				tax += ((brackets[status][x] - brackets[status][x - 1]) * rates[x]);
		}
		tax += ((earnings - brackets[status][4]) * rates[5]);
		return tax;
	}

}
