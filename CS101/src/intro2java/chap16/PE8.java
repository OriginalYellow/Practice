package intro2java.chap16;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

public class PE8 extends JFrame {

	public PE8() {
		add(new mousePanel());
	}

	public static void main(String[] args) {
		PE8 frame = new PE8();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	class mousePanel extends JPanel {
		private int x = 0;
		private int y = 0;
		private boolean drawPoint = false;

		public mousePanel() {
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					drawPoint = true;
					x = e.getX();
					y = e.getY();
					repaint();
				}
				
				public void mouseReleased(MouseEvent e) {
					drawPoint = false;
					repaint();
				}

			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (drawPoint) {
				g.drawString("(" + x + ", " + y + ")", x, y);
			}
		}

	}

}

