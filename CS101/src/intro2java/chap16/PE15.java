package intro2java.chap16;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;

public class PE15 extends JFrame {
	private int x = 0;

	public PE15() {
		add(new testPanel());
		Timer t = new Timer(5, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				x += 2;
				if (x > getWidth() - 50) {
					x = 0;
				}
				repaint();
			}

		});
		t.start();
	}

	public static void main(String[] args) {
		PE15 frame = new PE15();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public class testPanel extends JPanel {
		int y;

		@Override
		public void paintComponent(Graphics g) {
			y = getHeight();
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			g.fillRect(x, y-20, 50, 10);
			g.setColor(Color.BLACK);
			g.fillOval(x + 10, y - 10, 10, 10);
			g.fillOval(x + 30, y - 10, 10, 10);
			g.setColor(Color.BLUE);
			int[] tri1x = {x + 10, x + 20, x + 20};
			int[] tri1y = {y - 20, y - 20, y - 30};
			g.fillPolygon(tri1x, tri1y, 3);
			int[] tri2x = {x + 30, x + 40, x + 30};
			int[] tri2y = {y - 20, y - 20, y - 30};
			g.fillPolygon(tri2x, tri2y, 3);
			g.fillRect(x + 20, y - 30, 10, 10);
		}

	}

}


