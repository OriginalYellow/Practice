package intro2java.chap16;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PE13 extends JFrame {
	int slideNum = 0;
	ImageIcon i = new ImageIcon("slide0.jpg");
	JLabel l = new JLabel(i);

	public PE13() {
		add(l);
		Timer t = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				slideNum++;
				if (slideNum > 24) {
					slideNum = 0;
				}
				l.setIcon(new ImageIcon("slide" + slideNum + ".jpg"));
			}

		});
		t.start();
	}

	public static void main(String[] args) {
		PE13 frame = new PE13();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}


