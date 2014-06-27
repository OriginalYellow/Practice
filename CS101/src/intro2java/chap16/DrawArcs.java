package intro2java.chap16;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawArcs extends JFrame {
	public DrawArcs() {
		setTitle("DrawArcs");
		add(new ArcsPanel());
	}

	/** Main method */
	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setVisible(true);
	}
}

// The class for drawing arcs on a panel
class ArcsPanel extends JPanel {
	private int degree = 0;

	public ArcsPanel() {
		Timer t = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				degree++;
				repaint();
				System.out.println(degree);
			}

		});
		t.start();
	}

	// Draw four blazes of a fan
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.fillArc(x, y, 2 * radius, 2 * radius, 0 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270 + degree, 30);
	}
}
