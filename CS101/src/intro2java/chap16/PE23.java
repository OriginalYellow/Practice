package intro2java.chap16;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class PE23 extends JFrame {

	public PE23() {
		add(new pointsPanel());
	}

	public static void main(String[] args) {
		PE23 frame = new PE23();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class pointsPanel extends JPanel {
		ArrayList<Point2D.Double> points = new ArrayList<Point2D.Double>();
		double shortest;
		Point2D.Double[] closest = new Point2D.Double[2];

		public pointsPanel() {
			addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					Point2D.Double p = new Point2D.Double(e.getX(), e.getY());
					if (points.size() > 0) {
						setClosest(p);
					}
					points.add(p);
					repaint();
				}

			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawPoints(g);
			if (points.size() > 1) {
				drawClosest(g);
			}
		}

		private void drawPoints(Graphics g) {
			for (int x = 0; x < points.size(); x++) {
				g.drawOval((int)(points.get(x).x), (int)(points.get(x).y), 5, 5);
			}
		}

		private void drawClosest(Graphics g) {
			g.fillOval((int)closest[0].x, (int)closest[0].y, 5, 5);
			g.fillOval((int)closest[1].x, (int)closest[1].y, 5, 5);
		}

		private void setClosest(Point2D.Double p) {
			if (points.size() > 1) {
				for (int x = 0; x < points.size(); x++) {
					if (p.distance(points.get(x)) < shortest) {
						shortest = p.distance(points.get(x));
						closest[0] = p;
						closest[1] = points.get(x);
					}
				}
			} else {
				shortest = p.distance(points.get(0));
				closest[0] = p;
				closest[1] = points.get(0);
			}
		}

	}

}


