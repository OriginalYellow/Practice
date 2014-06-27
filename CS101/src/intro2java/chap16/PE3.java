package intro2java.chap16;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PE3 extends JFrame {
	int x = 20;
	int y = 100;
	JButton up = new JButton("Up");
	JButton down = new JButton("Down");
	JButton left = new JButton("Left");
	JButton right = new JButton("Right");

	public PE3() {
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(up);
		buttonPanel.add(down);
		buttonPanel.add(left);
		buttonPanel.add(right);
		ballListener b = new ballListener();
		up.addActionListener(b);
		down.addActionListener(b);
		left.addActionListener(b);
		right.addActionListener(b);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(buttonPanel, BorderLayout.SOUTH);
		ballPanel ball = new ballPanel();
		panel.add(ball, BorderLayout.CENTER);
		add(panel);
	}

	public static void main(String[] args) {
		PE3 frame = new PE3();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class ballListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == right) {
				x += 10;
				if (x + 20 > getWidth()) {
					x = 0;
				}
				repaint();
			} else if (e.getSource() == left) {
				x -= 10;
				if (x < 0) {
					x = getWidth() - 20;
				}
				repaint();
			} else if (e.getSource() == up) {
				y -= 10;
				if (y < 0) {
					y = getHeight() - 100;
				}
				repaint();
			} else if (e.getSource() == down) {
				y += 10;
				if (y + 100 > getHeight()) {
					y = 0;
				}
				repaint();
			}
		}
	}

	class ballPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(x, y, 20, 20);
		}

	}

}

