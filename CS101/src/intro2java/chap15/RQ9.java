package intro2java.chap15;

import java.awt.Graphics;

import javax.swing.*;

public class RQ9 extends JFrame {

	public RQ9() {
		add(new drawPanel());
	}

	public static void main(String[] args) {
		RQ9 frame = new RQ9();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class drawPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/*
		g.drawLine(10, 10, 70, 30);
		g.drawLine(10, 11, 70, 31);
		g.drawLine(10, 12, 70, 32);
		g.drawLine(10, 13, 70, 33);
		 */
		//g.fillRect(10, 10, 100, 50);
		//g.fillRoundRect(100, 0, 50, 50, 40, 30);
		//g.fillOval(0, 0, 100, 100);
		//g.fillOval(0, 0, 50, 100);
		//g.drawArc(0, 0, 50, 50, 0, 180);
		int[] xPoints = {20, 30, 40, 90, 10};
		int[] yPoints = {40, 50, 90, 10, 30};
		g.fillPolygon(xPoints, yPoints, 5);
	}
}