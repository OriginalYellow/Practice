package intro2java.chap16;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

public class PE19 extends JFrame {

	public PE19() {
		add(new circlePanel());
	}

	public static void main(String[] args) {
		PE19 frame = new PE19();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private class circlePanel extends JPanel {
		Ellipse2D.Double elipse = new Ellipse2D.Double(100, 60, 50, 50);
		boolean isInside = false;
		
		public circlePanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					if (elipse.contains(new Point(e.getX(), e.getY()))) {
						isInside = true;
					} else {
						isInside = false;
					}
					repaint();
				}
				
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(100, 60, 50, 50);
			String s;
			if (isInside) {
				s = "Mouse point is inside the circle.";
			} else {
				s = "Mouse point is outside the circle.";
			}
			g.drawString(s, 20, 20);
		}

	}

}


