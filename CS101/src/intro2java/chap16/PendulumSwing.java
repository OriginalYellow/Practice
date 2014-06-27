package intro2java.chap16;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PendulumSwing extends JFrame {

	public PendulumSwing() {
		add(new testPanel());
	}

	public static void main(String[] args) {
		PendulumSwing frame = new PendulumSwing();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class testPanel extends JPanel {
		int xCenter = 200;
		int yCenter = 200;
		int radius = 150;
		double addDeg = 0;
		double cosDeg = 1;
		boolean reverse = false;
		Timer t = new Timer(25, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addDeg = (Math.cos(cosDeg * (Math.PI / 180)) + 1) * 66;
				cosDeg += 4.5;
				repaint();
			}

		});

		public testPanel() {
			t.start();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			double radians = (addDeg + 270 - 66) * (Math.PI / 180);
			int x = xCenter + (int)(radius * Math.cos(radians));
			int y = yCenter - (int)(radius * Math.sin(radians));
			g.fillOval(x - 10, y - 10, 20, 20);
			g.drawLine(xCenter + 5, yCenter + 5, x, y);
			g.drawOval(xCenter, yCenter, 10, 10);
		}

	}

}


