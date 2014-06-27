package intro2java.chap15;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public abstract class AbstractDrawFunction extends JPanel { 

	/** Polygon to hold the points */
	private Polygon p = new Polygon();

	protected AbstractDrawFunction () {
		drawFunction();
	}

	/** Return the y-coordinate */
	abstract double f(double x);

	/** Obtain points for x-coordinates 100, 101, ..., 300 */
	public void drawFunction() {
		for (int x = -100; x <= 100; x++) {
			System.out.println(f(x));
			p.addPoint(x + 200, 200 - (int)f(x));
		}
	}

	/** Implement paintComponent to draw axes, labels, and
	 *  connecting points
	 */
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		g.drawLine(30, 200, 370, 200);
		g.drawLine(370, 200, 360, 210);
		g.drawLine(370, 200, 360, 190);
		g.drawLine(200, 30, 200, 370);
		g.drawLine(200, 30, 190, 40);
		g.drawLine(200, 30, 210, 40);
		g.drawString("y", 220, 30);
		g.drawString("x", 370, 180);
		g.drawPolyline(p.xpoints, p.ypoints, 256);
	} 
}

