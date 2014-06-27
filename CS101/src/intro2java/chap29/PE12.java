package intro2java.chap29;

import java.awt.*;
import javax.swing.*;


public class PE12 extends JFrame {
	private JProgressBar progress;

	public PE12() {
		progress = new JProgressBar();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					progress.setValue((int)(Math.random() * 100));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		add(progress);
		t.start();
	}

	public static void main(String[] args) {
		PE12 frame = new PE12();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class testPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}

	}

}


