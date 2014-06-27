package intro2java.chap19;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;

import javax.swing.*;

public class PE21 extends JFrame {
	JTextArea area = new JTextArea(10, 10);
	JButton save = new JButton("Save the bits to the file");
	JButton load = new JButton("Load file");
	JLabel label = new JLabel("Enter a file:");
	JTextField field = new JTextField(10);
	String file;

	public PE21() {	
		save.addActionListener(new ButtonListener());
		load.addActionListener(new ButtonListener());

		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		JPanel top = new JPanel(new FlowLayout());
		JScrollPane scroll = new JScrollPane(area);

		top.add(label);
		top.add(field);
		top.add(load);

		setLayout(new BorderLayout());
		add(top, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
		add(save, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		PE21 frame = new PE21();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == load) {
				String s = "";
				//System.out.println("s: " + s);//PH
				file = field.getText();
				try {
					s = convertToHex(file);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				area.setText(s);
			} else if (e.getSource() == save) {
				try {
					writeHex(file, area.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	public String convertToHex(String filename) throws IOException {
		DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));
		String fullHex = "";

		try {
			while (true) {
				String hex = Integer.toHexString(input.readInt());
				fullHex += (hex + " ");
			}
		} catch (EOFException e) {}

		return fullHex;
	}

	public static void writeHex(String filename, String hexString) throws IOException {
		DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
		String[] hexNums = hexString.split(" ");

		for (String s: hexNums) {
			output.writeInt(Integer.parseInt(s, 16));
		}

		output.close();
	}

}
