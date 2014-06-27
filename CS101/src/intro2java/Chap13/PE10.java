package intro2java.Chap13;

import java.util.Arrays;

public class PE10 {

	public static void main(String[] args) {
		int x = 2;
		for (int y = 0; y < 80; y++) {
			try {
				String[] fatty = fatArray(x);
				x *= 2; 
			} catch (OutOfMemoryError error) {
				System.out.println("Error at iteration " + y
						+ "\nx = " + x);
			}
		}
	}

	public static String[] fatArray(int i) {
		String[] fatStrings = new String[i];
		Arrays.fill(fatStrings, "aosihgoasihdgoaishdgoiahsdgoiahsdoighasoidghaosdihgoaisdhgoiashdgoiashdgoiahsdgoiahsdogihasdoighaoisgh43h408fhaw40hg8iwhguahspgouhas9pgohuaspohnaposhgopasdhfgoaw8hg08ihh8i34hg9paurg;;asgha'sg'ahsighasoghasdfjlajsf");
		return fatStrings;
	}

}
