package intro2java.chap14;

import java.math.BigInteger;

//this only finds the first 8, because come on bro
public class PE15 {

	public static void main(String[] args) {
		BigInteger[] nums = new BigInteger[8];
		for (int c = 0, p = 2; c < 8; p++) {
			boolean prime = true;
			BigInteger b = new BigInteger("" + (int)(Math.pow(2, p) - 1));
			for (BigInteger y = new BigInteger("2"); !y.equals(b);
					y = y.add(BigInteger.ONE)) {
				if (b.mod(y) == BigInteger.ZERO) {
					prime = false;
					break;
				}
			}
			if (prime) {
				nums[c] = b;
				c++;
			}
		}
		for (int x = 0; x < nums.length; x++) {
			System.out.println(nums[x]);
		}
	}

}
