package intro2java.chap29;

import java.awt.*;
import javax.swing.*;

public class PE1 extends JFrame {

	private JTextArea area;

	public PE1() {
		area = new JTextArea(5, 5);
		area.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(area);
		setLayout(new BorderLayout());
		add(scroll, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		PE1 frame = new PE1();
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Runnable printA = new PrintChar2('a', 10000, frame.area);
		Thread a = new Thread(printA);
		
		Runnable printB = new PrintChar2('b', 10000, frame.area);
		Thread b = new Thread(printB);
		
		Runnable printNum2 = new PrintNum2(10000, frame.area);
		Thread num = new Thread(printNum2);
		
		a.start();
		b.start();
		num.start();

	}
}

// The task for printing a specified character in specified times
class PrintChar2 implements Runnable {
	private char charToPrint; // The character to print
	private int times; // The times to repeat
	private JTextArea area;

	/** Construct a task with specified character and number of
	 *  times to print the character
	 */
	public PrintChar2(char c, int t, JTextArea area) {
		this.area = area;
		charToPrint = c;
		times = t;
	}

	/** Override the run() method to tell the system
	 *  what the task to perform
	 */
	public void run() {
		for (int i = 0; i < times; i++) {
			area.append(charToPrint + "");
		}
	}
}

//The task class for printing number from 1 to n for a given n
class PrintNum2 implements Runnable {
	private int lastNum;
	private JTextArea area;

	/** Construct a task for printing 1, 2, ... i */
	public PrintNum2(int n, JTextArea area) {
		lastNum = n;
		this.area = area;
	}

	/** Tell the thread how to run */
	public void run() {
		for (int i = 1; i <= lastNum; i++) {
			area.append(" " + i);
		}
	}
}

