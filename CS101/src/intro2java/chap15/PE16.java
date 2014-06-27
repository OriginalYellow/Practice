package intro2java.chap15;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE16 extends JFrame {
	
	public PE16() {
		add(new FontPanel());
	}

	public static void main(String[] args) {
		PE16 frame = new PE16();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 75);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class FontPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Times New Roman", Font.BOLD, 20);
		g.setFont(f);
		FontMetrics m = g.getFontMetrics(f);
		setToolTipText("Ascent: " + m.getAscent() + " Descent: "
				+ m.getDescent() + " Leading: " + m.getLeading()
				+ " String Width: " + m.stringWidth("Java is fun!"));
		g.drawString("Java is fun!", 10, 20);
	}

}
