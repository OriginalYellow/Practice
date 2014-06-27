package intro2java.chap9;

import java.io.File;
import java.util.Scanner;

public class PE17 {

	public static void main(String[] args) throws Exception {

		File file = new File(args[0]);

		if (args.length > 1) {
			System.out.println("Usage: java PE17 file");
			System.exit(0);
		}

		if (!file.exists()) {
			System.out.println("File does not exist");
			System.exit(0);
		}

		Scanner fileScanner = new Scanner(file);

		int characters = 0;

		while (fileScanner.hasNextLine()) 
			characters += fileScanner.nextLine().length();

		int words = 0;
		fileScanner = new Scanner(file);

		while (fileScanner.hasNext()) {
			fileScanner.next();
			words++;
		}
		
		System.out.println("Words: " + words);
		System.out.println("Characters: " + characters);

	}

}
