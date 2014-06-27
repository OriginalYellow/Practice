package intro2java.chap12;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(300, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel b = new JLabel("penis");
		b.setOpaque(true);
		b.setBackground(Color.BLUE);
		j.add(b);
		j.setVisible(true);
		/*
		j.setBackground(new Color(Color.BITMASK));
		GraphicsEnvironment e =
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] f = e.getAllFonts();
		for (int x = 0; x < f.length; x++) {
			System.out.println(f[x].getFontName());
		}
		*/
	}

}
