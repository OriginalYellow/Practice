package intro2java.chap12;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame {
	GridLayout g = new GridLayout(2,2);

	public ShowGridLayout() {
		// Set GridLayout, 3 rows, 2 columns, and gaps 5 between
		// components horizontally and vertically
		//setLayout(g);

		// Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		//add(new JTextField(8));
	}

	/** Main method */
	public static void main(String[] args) {
		ShowGridLayout frame = new ShowGridLayout();
		frame.setTitle("ShowGridLayout");
		frame.setSize(200, 125);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.g.setRows(1);
		frame.setVisible(false);
		frame.setVisible(true);
	}
}
