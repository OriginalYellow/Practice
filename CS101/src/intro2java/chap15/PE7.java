package intro2java.chap15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PE7 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int i = (int)(Math.random() * 3);
		switch (i) {
		case 1: 
			g.drawLine(0, 0, getWidth(), getHeight());
			g.drawLine(getWidth(), 0, 0, getHeight());
			break;
		case 2:
			g.drawOval((int)(getWidth() * .1), (int)(getHeight() * .1),
					(int)(getWidth() * .8), (int)(getHeight() * .8));
			break;
		case 0: break;
		default: break;
		}
	}

}
