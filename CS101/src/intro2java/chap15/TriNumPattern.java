package intro2java.chap15;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TriNumPattern extends JFrame {

	public TriNumPattern() {
		add(new triNumPanel());
	}
	
	public static void main(String[] args) {
		TriNumPattern frame = new TriNumPattern();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(375, 450);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}

class triNumPanel extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Arial", Font.PLAIN, 15);
		g.setFont(f);
		int columns = getWidth() / 27;
		int rows = getHeight() / 30;
		int yVal = 20;
		for (int x = 0; x < rows; x++) {
			int xVal = 20;
			for (int y = 1; y < x + 1 && y < columns + 1; y++) {
				g.drawString(("" + y), xVal, yVal);
				xVal += 25;
			}
			yVal += 30;
		}
	}
	
}
