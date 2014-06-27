/*write simple loop starting from
p = 1 to p = 31 to get values from
2^p-1
 */

package intro2java.chap5;

public class PE28 {
	public static void main(String[] args) {
		System.out.printf("%-15s%-15s%n", "p", "2^p - 1", "\n");
		for (int p = 1; p <= 31; p++) {
			boolean isPrime = true;
			//System.out.println((Math.pow(2, p) - 1));
			int result = (int)(Math.pow(2, p) - 1);
			for (int i = 2; i <= result/2; i++) {
				if (result % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.printf("%-15d%-15d%n", p, result, "\n");
			}
		}
	}
}
