package intro2java.chap14;

import java.math.BigInteger;

public class PE12 {

	public static void main(String[] args) {
		String big = "1";
		for (int x = 0; x < 49; x++) {
			big += "0";
		}
		BigInteger fifty = new BigInteger(big);
		int c = 0;
		BigInteger fifties[] = new BigInteger[10];
		while (c < 10) {
			if (fifty.mod(new BigInteger("3")).intValue() == 0
					|| fifty.mod(new BigInteger("2")).intValue() == 0) {
				fifties[c] = fifty;
				c++;
			}
			fifty = fifty.add(new BigInteger("1"));
		}
		for (int x = 0; x < fifties.length; x++) {
			System.out.println(fifties[x] + "\n");
		}
	}

}
