package intro2java.chap15;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class RegularPolygonPanel extends JPanel {
	int numberOfSides;
	
	public RegularPolygonPanel(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		setPreferredSize(new Dimension(100, 100));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();
		double step = 2 * Math.PI / numberOfSides;
		double angle = 0;
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * .4;
		for (int x = 0; x < numberOfSides; x++) {
			p.addPoint((int)(Math.cos(angle) * radius) + xCenter,
					(int)(Math.sin(angle) * radius) + yCenter);
			angle += step;
		}
		g.drawPolygon(p);
	}
	
}
