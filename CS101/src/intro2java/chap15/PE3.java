package intro2java.chap15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PE3 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		double y = 0.0;
		boolean startWhite = true;
		for (int a = 0; a < 8; a++) {
			double x = 0.0;
			boolean colorSwitch = false;
			if (!startWhite) {
				g.setColor(Color.BLACK);
				colorSwitch = true;
			} else {
				g.setColor(Color.WHITE);
			}
			for (int b = 0; b < 8; b++) {
				g.fillRect((int)x, (int)y, (int)(getWidth() * (1.0/8)),
						(int)(getHeight() * (1.0/8)));
				x += getWidth() * (1.0/8);
				if (colorSwitch) {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(Color.BLACK);
				}
				colorSwitch = !colorSwitch;
			}
			startWhite = !startWhite;
			y += getHeight() * (1.0/8);
		}
	}

}
