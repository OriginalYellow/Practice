package intro2java.chap18;

import java.awt.*;
import javax.swing.*;


public class TestFrame extends JFrame {

	public TestFrame() {
		add(new Ball());
	}

	public static void main(String[] args) {
		TestFrame frame = new TestFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	class testPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}

	}

}


