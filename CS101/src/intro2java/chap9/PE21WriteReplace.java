package intro2java.chap9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PE21WriteReplace {

	public static void main(String[] args) throws Exception {
		
		
		
		//check if file exists
		File input = new File(args[1]);
		if (!input.exists()) {
			System.out.println(args[1] + " does not exist!");
			System.exit(0);
		}
		
		//use method of appending strings and copying chain of strings...
		//...to original file
		Scanner s = new Scanner(input);
		String stringChain;
		stringChain = "";
		while (s.hasNext()) {
			String currentLine = s.nextLine();
			currentLine = currentLine.replace(args[0], "");
			stringChain = stringChain + currentLine + 
					(s.hasNext() ? '\n' : "");
		}
		
		PrintWriter p = new PrintWriter(input);
		p.print(stringChain);
		p.close();
		
	}
	
}
