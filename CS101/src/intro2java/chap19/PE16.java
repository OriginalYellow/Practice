package intro2java.chap19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.io.*;

public class PE16 {

	public static void main(String[] args) throws IOException {
		countChars("count.txt");
	}

	public static void countChars(String fileName) throws IOException {

		Hashtable<Character, Integer> chars = new Hashtable<Character, Integer>();
		InputStreamReader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)),
				"US-ASCII");

		while (true) {
			int i = reader.read();
			if (i < 0) {
				break;
			}
			Character c = (char)i;
			if (chars.containsKey(c)) {
				int val = chars.get(c);
				chars.put(c, val + 1);
			} else {
				chars.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : chars.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue() + " occurrences");
		}
	}

}
