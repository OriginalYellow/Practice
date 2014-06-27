package intro2java.chap9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PE29SplitMore {

	public static void main(String[] args) {
		
		System.out.println("Enter the string to split: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println("Enter the regular expression: ");
		String[] strings = split(input, s.next());
		System.out.println("The split strings are: ");
		for (String string: strings) 
			System.out.println(string);

	}

	/* This method splits strings with a regex and then returns both the regex's and
	 * strings in their original order. */
	public static String[] split(String input, String regex) {

		int start = 0;
		int end = 0;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		ArrayList<String> list = new ArrayList<String>();
		boolean hasRegex = m.find();
		/* It first checks if the regex comes at the beginning or not
		 * - if the regex comes first, it adds it to the list, if not, it adds the substring
		 * before the next regex and then the regex afterwards in order to be ready to enter the 
		 * while loop.*/
		if (hasRegex && (m.start() == 0)) { //checks if the start of the first regex is index 0

			list.add(m.group());
			start = m.end(); //this will store the index after the regex

		} else if (hasRegex) {
			
			end = m.start(); //this will store the index before the regex
			list.add(input.substring(0, end));//it can add the first substring because its start is 0
			list.add(m.group());
			start = m.end(); //this will store the index after the regex

		} else
			// If there is no regex in the string, it returns the string in a single cell array
			return new String[] {input};
		//It then loops through the string, adding the substring before each regex and then the regex
		while (m.find()) {

			end = m.start(); //the start was stored before find() iterated matcher forward
			list.add(input.substring(start, end));
			list.add(m.group());
			start = m.end(); //new start replaces old start that was found before find() iterated matcher

		}

		//if the newest start (the end of the last regex) is != to the length, there is more afterwards
		if (input.length() != start)
			list.add(input.substring(start, input.length()));
		//this is how you send the proper *weird* parameter to toArray because it uses generic types
		return list.toArray(new String[list.size()]);

	}

}
