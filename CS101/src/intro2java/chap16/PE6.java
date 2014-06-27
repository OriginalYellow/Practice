package intro2java.chap16;


import java.awt.event.*;
import javax.swing.*;

public class PE6 extends JFrame {
	JLabel label = new JLabel();
	boolean swap = true;
	String text1 = "Java is fun";
	String text2 = "Java is powerful";


	public PE6() {
		label.addMouseListener(new swapListener());
		add(label);
		label.setText(text2);
	}

	public static void main(String[] args) {
		PE6 frame = new PE6();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public class swapListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (swap) {
				label.setText(text1);
				swap = false;
			} else {
				label.setText(text2);
				swap = true;
			}
		}

	}

}


