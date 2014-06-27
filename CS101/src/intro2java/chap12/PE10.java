package intro2java.chap12;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*I decided to change this to use labels instead of buttons, 
 * Just because it looked kind of retarded with OSX's buttons.
 */
public class PE10 extends JFrame {

	public PE10() {
		setLayout(new GridLayout(7, 8));
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boolean white = true;
		for (int x = 0; x < 7; x++) {
			boolean white2 = white;
			for (int y = 0; y < 8; y++) {
				add(getLabel(white2));
				white2 = !white2;
			}
			white = !white;
		}
		setVisible(true);
	}

	public static JLabel getLabel(Boolean b) {
		JLabel space = new JLabel();
		space.setOpaque(true);
		if (b) {
			space.setBackground(Color.WHITE);
			return space;
		} else {
			space.setBackground(Color.BLACK);
			return space;
		}
	}
	
	public static void main(String[] args) {
		new PE10();
	}

}
