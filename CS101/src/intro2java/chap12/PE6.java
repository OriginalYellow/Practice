package intro2java.chap12;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PE6 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Exercise_12.6");
		Border b = new LineBorder(Color.BLACK);
		ImageIcon i1 = new ImageIcon("india.gif");
		ImageIcon i2 = new ImageIcon("norway.gif");
		ImageIcon i3 = new ImageIcon("uk.gif");
		ImageIcon i4 = new ImageIcon("us.gif");
		JLabel j1 = new JLabel(i1);
		JLabel j2 = new JLabel(i2);
		JLabel j3 = new JLabel(i3);
		JLabel j4 = new JLabel(i4);
		j1.setBorder(b);
		j2.setBorder(b);
		j3.setBorder(b);
		j4.setBorder(b);
		frame.setSize(230, 200);
		frame.setLayout(new GridLayout(2,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(j1);
		frame.add(j2);
		frame.add(j3);
		frame.add(j4);
		frame.setVisible(true);
	}
	
}
