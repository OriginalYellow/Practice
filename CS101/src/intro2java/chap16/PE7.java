package intro2java.chap16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class PE7 extends JFrame {

	public PE7() {
		swapPanel panel = new swapPanel();
		add(panel);
	}

	public static void main(String[] args) {
		PE7 frame = new PE7();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public class swapPanel extends JPanel {

		public swapPanel() {
			setBackground(Color.WHITE);
			addMouseListener(new MouseAdapter(){

				@Override
				public void mousePressed(MouseEvent e) {
					swapPanel.this.setBackground(Color.BLACK);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					swapPanel.this.setBackground(Color.WHITE);
				}

			});
		}

	}
}