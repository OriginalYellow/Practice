package intro2java.chap17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class PE4 extends JFrame {
	TextArea area = new TextArea(20, 50);
	JTextField fileField = new JTextField(30);
	JLabel fileLabel = new JLabel("File Name:");
	JButton fileButton = new JButton("View");
	String fileContents = "";

	public PE4() {
		JPanel p = new JPanel();
		fileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Scanner s = null;
				File f = new File(fileField.getText());
				try {
					s = new Scanner(f);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				while (s.hasNextLine()) {
					fileContents += s.nextLine() + "\n";
				}
				area.setText(fileContents);
			}

		});
		p.add(fileLabel);
		p.add(fileField);
		p.add(fileButton);
		add(area, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		PE4 frame = new PE4();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class testPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}

	}

}


