package intro2java.chap9;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import assignments.IO;

public class PE33Hangman2 {

	public static void main(String[] args) throws Exception {

		System.out.println("Welcome to Hard-as-Balls Hangman!");
		File dictionary = new File("dictionary.txt");//needs dictionary file copied from unix dictionary
		boolean again = true;
		
		while (again) {
			
			Scanner s = new Scanner(System.in);
			
			//count for wrong guesses
			int wrongCount = 0;
			//word to be guessed for
			String word = getRandomWord(dictionary);
			//make buffer with all *'s
			StringBuffer wordBuffer = new StringBuffer(word.replaceAll("\\w", "*"));

			while (wordBuffer.indexOf("*") >= 0) {

				System.out.print("Enter a letter in word " + wordBuffer + " > ");
				String letter = s.next();
				if (!word.contains(letter)) {
					System.out.println(letter + " is not in the word.");
					wrongCount++;
				}
				else if (wordBuffer.indexOf(letter) < 0) {
					Integer[] indices = findIndices(word, letter);
					for (int i : indices) {
						wordBuffer.replace(i, i + 1, letter);
					}
				} else
					System.out.println(letter + " is already in the word");

			}

			System.out.println("The word is " + word + ". You missed " + wrongCount +
					((wrongCount < 2) ? " time." : " times."));
			
			System.out.println("Play again?");
			//so, apparently Scanner's nextBoolean() doesn't translate anything and only reads true, so...
			//...I had to use the IO method
			if (!IO.readBoolean())
				again = false;
		}
	}

	//this uses indexOf with no starting parameter to find the first index and then continues to use indexOf..
	//...but with the last found index as a start index to find more indices. It stores them in an Integer ArrayList 
	public static Integer[] findIndices(String word, String letter) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int index = word.indexOf(letter);
		list.add(index);
		while (true) {
			index = word.indexOf(letter, index + 1);
			if (index > 0)
				list.add(index);
			else
				break;
		}
		return (list.toArray(new Integer[list.size()]));

	}

	/* This method takes an existing file, uses a scanner with a delimiter for non-whitespace
	 * characters and its next() method to count up the number of words in the file, generates a random
	 * number from the range of 0 to the number of words in the file minus 1, and then uses next()
	 * that many times minus one and then returns the next next()
	 */
	public static String getRandomWord(File dictionary) throws Exception {

		if (!dictionary.exists()) {
			System.out.println("File does not exist, returning empty string");
			return "";
		}

		Scanner s = new Scanner(dictionary);
		s.useDelimiter("\\s+?");
		int wordCount = 0;
		while (s.hasNext()) {
			s.next();
			wordCount++;
		}
		
		int randNum = (int)(Math.random() * wordCount) - 1;
		s = new Scanner(dictionary);
		for (int x = 0; x < randNum; x++) {
			s.next();
		}
		
		return s.next();

		/* This alternate code takes up almost a gig of memory because it stores the dictionary in a massively oversized
		 * ArrayList and then stores it in a smaller but still gigantic String array - completely infeasible*/
		/*
		Scanner s = new Scanner(dictionary);
		s.useDelimiter("\\s+?");
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()) {
			list.add(s.next());
		}
		String[] dictionaryStrings = (list.toArray(new String[list.size()]));
		System.out.println(Arrays.toString(dictionaryStrings));
		return "";
		 */
	}

}
