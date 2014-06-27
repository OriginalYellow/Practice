package intro2java.chap6;

import java.util.Arrays;

public class PE6 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line

		int primeCount = 0;
		double currentNum = 2;
		double[] primes = new double[51];
		primes[0] = 1;
		while (primeCount < 50) {
			Boolean isPrime = true;
			for (int x = 1; x <= primeCount &&
					primes[x] <= Math.sqrt(currentNum); x++) {
				if ((currentNum % primes[x]) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeCount++;
				primes[primeCount] = currentNum;
			}
			currentNum++;
		}
		for (int count = 1; count <= 50; count++) {
			if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
				System.out.println((int)primes[count]);
			}
			else
				System.out.print((int)primes[count] + " ");
		}
	}
}
