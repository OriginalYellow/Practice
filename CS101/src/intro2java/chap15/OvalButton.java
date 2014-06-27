package intro2java.chap15;

import java.awt.Graphics;

import javax.swing.JButton;

public class OvalButton extends JButton {
	
	public OvalButton(String text) {
		super(text);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval((int)(getWidth() * .05), (int)(getHeight() * .05),
				(int)(getWidth() * .9), (int)(getHeight() * .9));
	}
	
}
