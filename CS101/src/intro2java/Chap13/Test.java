package intro2java.Chap13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String hex = "hf";
		hex = hex.trim();
		Pattern p = Pattern.compile("[a-f[1-9]]");
		Matcher m = p.matcher(hex);
		for (int x = 0; x < hex.length(); x++) {
			try {
				if (!m.find(x)) {
					throw new NumberFormatException();
				}
				if (m.start() != x) {
					throw new NumberFormatException();
				}
			}
			catch (NumberFormatException ex) {
				System.out.println(x);
			}
		}
	}
}
