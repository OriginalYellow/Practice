package intro2java.chap9;

import java.util.ArrayList;
import java.util.Scanner;

public class PE31Hangman {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//count for wrong guesses
		int wrongCount = 0;
		//word to be guessed for
		String word = "annie";
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

}
