package intro2java.chap9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PE34WriteReplaceDirectory {

	/* When you enter a directory name through the terminal, you need to use the full root path
	 * to the directory (drag the folder into terminal), but you only need to use the folder name
	 * if you input it through eclipse
	 */
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			System.out.println(
					"Usage: java ReplaceText directory oldStr newStr");
			System.exit(0);
		}

		File directory = new File(args[0]);
		if (!directory.exists()) {
			System.out.println("Directory " + args[0] + " does not exist");
			System.exit(0);
		}

		File[] files = directory.listFiles();

		for (File file : files) {
			File tempFile = new File("temp.txt");
			tempFile.deleteOnExit();
			Scanner input = new Scanner(file);
			PrintWriter output = new PrintWriter(tempFile);

			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[1], args[2]);
				output.println(s2);
			}
			output.close();

			//switch the input to the tempFile and the output to the source file by...
			//...trading references
			input = new Scanner(tempFile);
			output = new PrintWriter(file);

			while(input.hasNext()) {
				output.println(input.nextLine());
			}
			output.close();
		}

	}

}
