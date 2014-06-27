//this class has method(s) that deal with prime numbers

package customLibrary.math;

/*this method returns true if the double argument is
 * a prime number, and false if it is not*/

public class Prime {
	public static boolean primeCheck(double num) {
		for (double i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
