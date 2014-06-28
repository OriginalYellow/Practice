package intro2java.chap30;

import java.io.*;
import java.net.*;
import javax.swing.*;
import intro2java.chap19.Loan;

public class PE1Server extends JFrame {
	private DataInputStream input;
	private DataOutputStream output;
	private JTextArea area = new JTextArea(10, 20);
	private Loan loan;
	
	public PE1Server() {
		area.setEditable(false);
		add(new JScrollPane(area));
	}
	
	public void StartServer() throws IOException {
		ServerSocket server = new ServerSocket(9000);
		Socket socket = server.accept();
		input = new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						
						Thread.sleep(501);
						
						String[] data = input.readUTF().split(" ");
						loan = new Loan(Double.parseDouble(data[0]), Integer.parseInt(data[1]),
								Double.parseDouble(data[2]));
						area.append("\n" + loan.getTotalPayment());
						output.writeDouble(loan.getTotalPayment());
						
					} catch (EOFException e) {
						area.append("\nEnd of input.");
					} catch (IOException e) {
						e.printStackTrace();
						break;
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
					}
				}
			}

		});

		t.run();
	}

	public static void main(String[] args) throws IOException {
		PE1Server frame = new PE1Server();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.StartServer();

	}

}
