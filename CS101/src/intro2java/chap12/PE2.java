package intro2java.chap12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
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

		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	
}
