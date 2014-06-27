package intro2java.chap15;

import java.util.Random;

import javax.swing.JFrame;

public class TestRandomClock extends JFrame {

	public TestRandomClock() {
		StillClock clock = new StillClock();
		Random r = new Random();
		clock.setMinute((r.nextBoolean()) ? 0 : 30);
		int hour = (int)(Math.random() * 11) + 1;
		clock.setHour(hour);
		clock.setSecondHandVisible(false);
		add(clock);
	}

	public static void main(String[] args) {
		TestRandomClock frame = new TestRandomClock();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}