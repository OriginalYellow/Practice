package intro2java.chap15;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.*;

public class MultTable extends JFrame {

	public MultTable() {
		add(new multPanel());
	}

	public static void main(String[] args) {
		MultTable frame = new MultTable();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(375, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class multPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Arial", Font.BOLD, 25);
		g.setFont(f);
		g.drawString("Multiplication Table", 80, 40);
		f = new Font("Arial", Font.PLAIN, 15);
		g.setFont(f);
		int y = 100;
		FontMetrics m = g.getFontMetrics(f);
		int oneWidth = m.stringWidth("1");
		/* this code amazingly right-justifies each number by subtracting
		 * the width of "1" from each number's string width (unless the number
		 * is one), and subtracting the result of that from a constant x value
		 * to get each strings position
		 */
		for (int row = 1; row <= 9; row++) {
			for (int column = 1, x = 80; column <= 9; column++, x += 30) {
				String num = (row * column) + "";
				int numWidth = m.stringWidth(num);
				if (!num.equals("1")) {
					g.drawString(num, x - (numWidth - oneWidth), y);
				} else {
					g.drawString(num, x, y);
				}
			}
			y += 30;
		}
		y = 70;
		for (int column = 1, x = 80; column <= 9; column++, x += 30) {
			String num = column + "";
			int numWidth = m.stringWidth(num);
			if (!num.equals("1")) {
				g.drawString(num, x - (numWidth - oneWidth), y);
			} else {
				g.drawString(num, x, y);
			}
		}
		int x = 50;
		y = 100;
		for (int row = 1; row <= 9; row++) {
			String num = row + "";
			int numWidth = m.stringWidth(num);
			if (!num.equals("1")) {
				g.drawString(num, x - (numWidth - oneWidth), y);
			} else {
				g.drawString(num, x, y);
			}
			y += 30;
		}
		y += 30;
		g.drawRect(70, 80, 270, 270);

	}

}
