package intro2java.chap12;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,3));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,3));
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");
		JButton jb6 = new JButton("Button 6");

		panel1.add(jb1);
		panel1.add(jb2);
		panel1.add(jb3);
		panel2.add(jb4);
		panel2.add(jb5);
		panel2.add(jb6);

		frame.add(panel1);
		frame.add(panel2);
		
		frame.setVisible(true);
	}
	
}
