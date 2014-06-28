package intro2java.chap29;

public class TaskThreadDemo {
	public static void main(String[] args) {
		// Create tasks
		Runnable printA = new PrintChar('a', 10000);
		Runnable printB = new PrintChar('b', 10000);
		Runnable printNum = new PrintNum(10000);
		
		Thread a = new Thread(printA);
		Thread b = new Thread(printB);
		Thread num = new Thread(printNum);

		a.start();
		b.start();
		num.start();


	}
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {
	private char charToPrint; // The character to print
	private int times; // The times to repeat

	/** Construct a task with specified character and number of
	 *  times to print the character
	 */
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	/** Override the run() method to tell the system
	 *  what the task to perform
	 */
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(charToPrint);
		}
	}
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
	private int lastNum;

	/** Construct a task for printing 1, 2, ... i */
	public PrintNum(int n) {
		lastNum = n;
	}

	/** Tell the thread how to run */
	public void run() {
		for (int i = 1; i <= lastNum; i++) {
			System.out.print(" " + i);
			Thread.yield();
		}
	}
}
