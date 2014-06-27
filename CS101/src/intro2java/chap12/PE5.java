package intro2java.chap12;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PE5 {

	public static void main(String[] args) {
		Border b = new LineBorder(Color.BLACK);
		JLabel l1 = new JLabel("Department of Computer Science");
		JLabel l2 = new JLabel("School of Computing");
		JLabel l3 = new JLabel("Armstrong Atlantic State University");
		JLabel l4 = new JLabel("Tel: (732) - 432 - 6956");
		l1.setBorder(b);
		l2.setBorder(b);
		l3.setBorder(b);
		l4.setBorder(b);
		JFrame frame = new JFrame("Exercise12_5");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,1));
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.setVisible(true);
	}
	
}
