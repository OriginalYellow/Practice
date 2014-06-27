package intro2java.chap7;

public class PE3 {
	/** Main method */
	public static void main(String args[]) {
		// Students' answers to the questions
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		int[] correct = new int[answers.length];
		int[] students = new int[answers.length];
		
		for (int x = 0; x < students.length; x++) {
			students[x] = x;
		}

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			correct[i] = correctCount;
		}
		
		bubbleSort(correct, students);
		
		for (int x = 0; x < correct.length; x ++) {
			System.out.println("Student " + students[x] + " has " + correct[x] + " answers right.");
		}
		
	}
	
	public static void bubbleSort(int[] list, int[] list2) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] > list[j]) {
					notSorted = true;
					int jTemp = list[j];
					int jTemp2 = list2[j];
					list[j] = list[i];
					list2[j] = list2[i];
					list[i] = jTemp;
					list2[i] = jTemp2;

				}
			}
		}		
	}
	
}