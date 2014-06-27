package intro2java.chap14;

import java.math.BigInteger;

public class PE14 {

	public static void main(String[] args) {
		System.out.println("boobies");
		BigInteger maxLong =  new BigInteger("" + Long.MAX_VALUE);
		BigInteger[] primes = new BigInteger[1];
		int c = 0;
		int count = 0;
		for (BigInteger x = maxLong; c < 1; x = x.add(BigInteger.ONE)) {
			boolean prime = true;
			for (BigInteger y = new BigInteger("2"); !y.equals(x);
					y = y.add(BigInteger.ONE)) {
				if (x.mod(y).equals(BigInteger.ZERO)) {
					prime = false;
				}
				if (y.mod(new BigInteger("1000")).equals(BigInteger.ZERO)) {
					System.out.println(y);
				}
			}
			System.out.println(count);
			count++;
			if (prime) {
				primes[c] = x;
				c++;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
			System.out.println();
		}
	}

}
