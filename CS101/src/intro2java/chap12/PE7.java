package intro2java.chap12;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PE7 extends JFrame {

	public PE7() {
		setSize(200, 200);
		setLayout(new GridLayout(3, 3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int x = 0; x < 9; x++) {
			add(getImageLabel());
		}
		setVisible(true);
	}

	static JLabel getImageLabel() {
		int i = (int)(Math.random() * 3);
		switch (i) {
		case 0: return new JLabel(new ImageIcon("x.gif"));
		case 1: return new JLabel(new ImageIcon("o.gif"));
		case 2: return new JLabel();
		default: return new JLabel();
		}
	}
	
	public static void main(String[] args) {
		PE7 p = new PE7();
	}

}


