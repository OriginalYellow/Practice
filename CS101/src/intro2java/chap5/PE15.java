/*the computeTax method is wrong because I misinterpreted the algorithm,
 * but it doesnt affect the point of the exercise.
 */

package intro2java.chap5;

public class PE15 {
	public static double computeTax(int status, double taxableIncome) {
		double percentage = 0;
		switch (status) {
		case 1: percentage = .25;
		break;
		case 2: percentage = .15;
		break;
		case 3: percentage = .25;
		break;
		case 4: percentage = .25;
		break;
		default: System.out.println("invalid status");
		break;
		}
		return (taxableIncome * percentage);
	}
	public static void main(String[] args) {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s", "Taxable", "Single", "Married", "Married", "Head of");
		System.out.println();
		System.out.printf("%-15s%-15s%-15s%-15s%-15s", "Income", " ", "Joint", "Separate", "a House");
		System.out.println();
		for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {
			System.out.printf("%-15.2f", taxableIncome);
			for (int status = 1; status <= 4; status++) {
				double result = computeTax(status, taxableIncome);
				System.out.printf("%-15.2f", result);			
			}
			System.out.println();
		}
	}
}
