package intro2java.chap15;

import java.awt.Graphics;

import javax.swing.*;

public class PE10 extends JFrame {

	public PE10() {
		add(new cylinder());
	}
	
	public static void main(String[] args) {
		PE10 frame = new PE10();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}

class cylinder extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval((int)(getWidth() * .2), (int)(getHeight() * .1),
				(int)(getWidth() * .6), (int)(getHeight() * .2));
		g.drawLine((int)(getWidth() * .2), (int)(getHeight() * .2),
				(int)(getWidth() * .2), (int)(getHeight() * .8));
		//g.drawOval((int)(getWidth() * .2), (int)(getHeight() * .7),
				//(int)(getWidth() * .6), (int)(getHeight() * .2));
		g.drawLine((int)(getWidth() * .8), (int)(getHeight() * .2),
				(int)(getWidth() * .8), (int)(getHeight() * .8));
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				0, 20);
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				40, 20);
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				80, 20);
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				120, 20);
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				160, 20);
		g.drawArc((int)(getWidth() * .2), (int)(getHeight() * .7),
				(int)(getWidth() * .6), (int)(getHeight() * .2),
				180, 180);
	}
	
}
