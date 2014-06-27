package intro2java.chap15;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.*;

public class PE11 extends JFrame {

	public PE11() {
		add(new SquarePanel());
	}

	public static void main(String[] args) {
		PE11 frame = new PE11();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 322);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class SquarePanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(30, 280, 370, 280);
		g.drawLine(30, 280, 40, 270);
		g.drawLine(30, 280, 40, 290);
		g.drawLine(370, 280, 360, 270);
		g.drawLine(370, 280, 360, 290);
		g.drawLine(200, 295, 200, 30);
		g.drawLine(200, 30, 190, 40);
		g.drawLine(200, 30, 210, 40);
		g.drawString("y", 220, 30);
		g.drawString("x", 30, 260);
		double scale = .01;
		Polygon p = new Polygon();
		for (int x = -150; x <= 150; x++) {
			int y = (int)(x * x * scale);
			p.addPoint(x + 200, 280 - y);
		}
		g.drawPolyline(p.xpoints, p.ypoints, 300);
	}
	
}

