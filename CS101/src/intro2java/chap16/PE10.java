package intro2java.chap16;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class PE10 extends JFrame {
	JTextField text = new JTextField();
	JLabel label = new JLabel();

	public PE10() {
		text.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					label.setText(text.getText());
				}
			}

		});
		
		add(text, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		PE10 frame = new PE10();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(150, 80);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}


