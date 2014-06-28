package intro2java.chap30;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class PE1Client extends JFrame {
	private DataInputStream input;
	private DataOutputStream output;
	private JTextField annualInterestRateField = new JTextField(20);
	private JTextField numberOfYearsField = new JTextField(20);
	private JTextField loanAmountField = new JTextField(20);
	private JLabel annualInterestRateLabel = new JLabel("Annual Interest Rate");
	private JLabel numberOfYearsLabel = new JLabel("Number Of Years");
	private JLabel loanAmountLabel = new JLabel("Number Of Years");
	private JTextArea area = new JTextArea(7, 25);
	private JButton submit = new JButton("Submit");

	public PE1Client() throws UnknownHostException, IOException {
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		area.setEditable(false);

		JPanel p1 = new JPanel(new GridLayout(3, 1));
		JPanel p2 = new JPanel(new GridLayout(3, 1));
		JPanel p3 = new JPanel(new BorderLayout());
		JPanel p4 = new JPanel(new BorderLayout());
		JScrollPane scroll = new JScrollPane(area);

		p1.add(annualInterestRateLabel);
		p2.add(annualInterestRateField);
		p1.add(numberOfYearsLabel);
		p2.add(numberOfYearsField);
		p1.add(loanAmountLabel);
		p2.add(loanAmountField);
		p3.add(p1, BorderLayout.WEST);
		p3.add(p2, BorderLayout.CENTER);
		p4.add(p3, BorderLayout.CENTER);
		p4.add(submit, BorderLayout.EAST);
		add(p4, BorderLayout.NORTH);
		add(scroll, BorderLayout.SOUTH);

		Socket socket = new Socket("10.0.0.3", 9000);
		input = new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = annualInterestRateField.getText() + " " + 
						numberOfYearsField.getText() + " " + loanAmountField.getText();
				try {
					output.writeUTF(data);
					area.append("\nTotal payment: " + input.readDouble());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
			}

		});

	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		PE1Client frame = new PE1Client();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		/*
		Socket socket = new Socket("localhost", 9000);
		DataInputStream input = new DataInputStream(socket.getInputStream());
		DataOutputStream output = new DataOutputStream(socket.getOutputStream());

		output.writeInt(555);
		System.out.println(input.readInt());
		output.writeInt(666);
		System.out.println(input.readInt());
		 */
	}

}
