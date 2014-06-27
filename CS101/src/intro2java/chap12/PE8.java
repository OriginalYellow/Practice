package intro2java.chap12;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PE8 extends JFrame {
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;

	public PE8() {
		setSize(100, 100);
		setLayout(new GridLayout(3,3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Border b = new LineBorder(Color.YELLOW);
		Font f = new Font("TimesNewRomanPSMT", Font.BOLD, 20);
		l1 = new JLabel("black");
		l2 = new JLabel("blue");
		l3 = new JLabel("cyan");
		l4 = new JLabel("green");
		l5 = new JLabel("magenta");
		l6 = new JLabel("orange");
		l1.setBorder(b);
		l2.setBorder(b);
		l3.setBorder(b);
		l4.setBorder(b);
		l5.setBorder(b);
		l6.setBorder(b);
		l1.setForeground(Color.BLACK);
		l2.setForeground(Color.BLUE);
		l3.setForeground(Color.CYAN);
		l4.setForeground(Color.GREEN);
		l5.setForeground(Color.MAGENTA);
		l6.setForeground(Color.ORANGE);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);
		l1.setToolTipText("black");
		l2.setToolTipText("blue");
		l3.setToolTipText("cyan");
		l4.setToolTipText("green");
		l5.setToolTipText("magenta");
		l6.setToolTipText("orange");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PE8();
	}
	
}
