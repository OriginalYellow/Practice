package intro2java.chap30;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class ChatClient extends JFrame {
	private DataInputStream input;
	private DataOutputStream output;
	private JTextField chatField = new JTextField(20);
	private JTextArea area = new JTextArea(7, 25);
	private JButton send = new JButton("Send");

	public ChatClient() throws UnknownHostException, IOException {
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		area.setEditable(false);

		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel(new BorderLayout());
		JScrollPane scroll = new JScrollPane(area);
		
		p1.add(chatField, BorderLayout.CENTER);
		p1.add(send, BorderLayout.EAST);
		add(p1, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);

		/*
		Socket socket = new Socket("10.0.0.3", 9000);
		input = new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());
		*/

		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = chatField.getText();
				try {
					output.writeUTF(data);
					area.append("\nClient: " + data + "\nServer: " + input.readUTF());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});

	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		ChatClient frame = new ChatClient();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
