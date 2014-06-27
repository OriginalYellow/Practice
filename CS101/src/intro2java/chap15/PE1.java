package intro2java.chap15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class PE1 extends JFrame {
	
	public PE1() {
		add(new gridPanel());
	}
	
	public static void main(String[] args) {
		PE1 frame = new PE1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class gridPanel extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawLine(0, (int)(getHeight() * (1.0/3)),
				getWidth(), (int)(getHeight() * (1.0/3)));
		g.drawLine(0, (int)(getHeight() * (2.0/3)),
				getWidth(), (int)(getHeight() * (2.0/3)));
		g.setColor(Color.RED);
		g.drawLine((int)(getWidth() * (1.0/3)), 0,
				(int)(getWidth() * (1.0/3)), getHeight());
		g.drawLine((int)(getWidth() * (2.0/3)), 0,
				(int)(getWidth() * (2.0/3)), getHeight());
	}
	
}
