package intro2java.chap12;

import javax.swing.*;
import java.awt.*;

public class RQ21 extends JFrame {
	public static void main(String[] args) {

		// Create a frame and set its properties
		JFrame frame = new RQ21();
		frame.setTitle("ButtonIcons");
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public RQ21() {
		ImageIcon usIcon = new ImageIcon("us.gif"); JButton jbt1 = new JButton(usIcon);
		JButton jbt2 = new JButton(usIcon);
		JPanel p2 = new JPanel();
		p2.add(jbt2);
		JPanel p3 = new JPanel(); 
		p2.add(jbt1);
		JPanel p1 = new JPanel();
		p1.add(jbt1);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
	}
}