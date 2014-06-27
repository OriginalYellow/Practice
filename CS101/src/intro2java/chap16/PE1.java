package intro2java.chap16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE1 extends JFrame {
	JButton jb1 = new JButton("Button 1");
	JButton jb2 = new JButton("Button 2");
	JButton jb3 = new JButton("Button 3");
	JButton jb4 = new JButton("Button 4");
	JButton jb5 = new JButton("Button 5");
	JButton jb6 = new JButton("Button 6");
	
	public PE1() {
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		ButtonListener b = new ButtonListener();
		jb1.addActionListener(b);
		jb2.addActionListener(b);
		jb3.addActionListener(b);
		jb4.addActionListener(b);
		jb5.addActionListener(b);
		jb6.addActionListener(b);

		panel1.add(jb1);
		panel1.add(jb2);
		panel1.add(jb3);
		panel2.add(jb4);
		panel2.add(jb5);
		panel2.add(jb6);

		add(panel1);
		add(panel2);
	}

	public static void main(String[] args) {
		PE1 frame = new PE1();
		frame.setSize(1000, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		frame.setVisible(true);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jb1) {
				System.out.println("jb1 clicked");
			} else if (e.getSource() == jb2) {
				System.out.println("jb2 clicked");
			} else if (e.getSource() == jb3) {
				System.out.println("jb3 clicked");
			} else if (e.getSource() == jb4) {
				System.out.println("jb4 clicked");
			} else if (e.getSource() == jb5) {
				System.out.println("jb5 clicked");
			} else if (e.getSource() == jb6) {
				System.out.println("jb6 clicked");
			}
		}

	}

}
