package intro2java.chap15;


import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.*;

public class PE12 extends JFrame {

	public PE12() {
		add(new SinePanel());
	}

	public static void main(String[] args) {
		PE12 frame = new PE12();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 322);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class SinePanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(30, 150, 370, 150);
		g.drawLine(370, 150, 360, 160);
		g.drawLine(370, 150, 360, 140);
		g.drawLine(200, 295, 200, 5);
		g.drawLine(200, 5, 190, 15);
		g.drawLine(200, 5, 210, 15);
		g.drawString("y", 220, 30);
		g.drawString("x", 370, 130);
		double step = Math.PI / 150;
		int xPos = -150;
		Polygon p = new Polygon();
		while (xPos <= 150) {
			for (double x = 0; x < Math.PI * 2; x += step) {
				int yPos = (int)(Math.sin(x) * 100);
				p.addPoint(xPos + 200, 150 - yPos);
				xPos++;
			}
		}
		g.drawPolyline(p.xpoints, p.ypoints, 300);
	}

}
