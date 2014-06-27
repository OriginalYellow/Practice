package intro2java.chap9;

import javax.swing.JOptionPane;

public class PE22StateQuiz {

	public static void main(String[] args) {
		//There are only 3 out of 50 states in this array, but the program scales the size of the array
		String[][] states = {{"Alabama", "Montgomery"},
				{"Alaska", "Jeneau"},
				{"Arizona", "Phoenix"}};
		int[] count = new int[states.length];
		int correctCount = 0;
		int currentIndex = 0;

		for (int x = 0; x < states.length; x++) {
			while (true) {
				currentIndex = (int)(Math.random() * (states.length));
				if (count[currentIndex] == 0)
					break;
				else
					continue;
			}
			count[currentIndex]++;

			String capital = JOptionPane.showInputDialog("What is the capital of " +
					states[currentIndex][0] + "?");
			if (capital.toLowerCase().equals(states[currentIndex][1].toLowerCase())) {
				JOptionPane.showMessageDialog(null, "Correct!");
				correctCount++;
			}
			else
				JOptionPane.showMessageDialog(null, "Wrong!");
		}

		JOptionPane.showMessageDialog(null, "You got " + correctCount + " out of " + states.length + " capitals correct!");

	}

}


