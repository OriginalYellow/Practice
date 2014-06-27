package intro2java.chap16;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PE5 extends JFrame {
	double investmentAmountVal = 0;
	double yearsVal = 0;
	double monthlyInterestRateVal = 0;

	JLabel investmentAmount = new JLabel("Investment Amount");
	JLabel years = new JLabel("Years");
	JLabel monthlyInterestRate = new JLabel("monthly Interest Rate");
	JLabel futureValue = new JLabel("Future Value");
	JTextField IAText = new JTextField();
	JTextField YText = new JTextField();
	JTextField AIRText = new JTextField();
	JTextField FVText = new JTextField();
	JButton calculate = new JButton("Calculate");


	public PE5() {
		JPanel topPanel = new JPanel((new GridLayout(4, 2)));
		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		topPanel.add(investmentAmount);
		topPanel.add(IAText);
		topPanel.add(years);
		topPanel.add(YText);
		topPanel.add(monthlyInterestRate);
		topPanel.add(AIRText);
		topPanel.add(futureValue);
		topPanel.add(FVText);
		bottomPanel.add(calculate);
		add(topPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);

		investmentListener investListen = new investmentListener();
		IAText.addActionListener(investListen);
		YText.addActionListener(investListen);
		AIRText.addActionListener(investListen);
		calculate.addActionListener(investListen);
		FVText.setEditable(false);
	}

	public static void main(String[] args) {
		PE5 frame = new PE5();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class investmentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == calculate) {
				FVText.setText("" + (Double.parseDouble(IAText.getText())
						* Math.pow((1 + Double.parseDouble(AIRText.getText())), (Double.parseDouble(YText.getText()) * 12))));
			}
		}

	}

}

