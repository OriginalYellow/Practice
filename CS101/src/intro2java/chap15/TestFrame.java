package intro2java.chap15;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class TestFrame extends JFrame {

	public TestFrame() {
		setLayout(new FlowLayout());
		add(new RegularPolygonPanel(5));
		add(new RegularPolygonPanel(6));
		add(new RegularPolygonPanel(7));
		add(new RegularPolygonPanel(8));
		add(new RegularPolygonPanel(9));
		add(new RegularPolygonPanel(10));
	}

	public static void main(String[] args) {
		TestFrame frame = new TestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class testPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Arial", Font.PLAIN, 15);
		System.out.println(g.getFontMetrics(f).getHeight());
		g.drawString("Multiplication Table", 50, 20);
	}

}
