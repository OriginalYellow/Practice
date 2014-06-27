package intro2java.chap17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class PE2 extends JFrame {
	FigurePanel fig = new FigurePanel(FigurePanel.LINE);
	JRadioButton RLine = new JRadioButton("Line");
	JRadioButton RRectangle = new JRadioButton("Rectangle");
	JRadioButton ROval = new JRadioButton("Oval");
	JCheckBox CBFilled = new JCheckBox("Filled");

	public PE2() {
		RLine.setSelected(true);//doesn't trigger event
		ButtonGroup group = new ButtonGroup();
		JPanel p = new JPanel();
		toggleListener tog = new toggleListener();
		fig.setBorder(new LineBorder(Color.black));
		p.setBorder(new LineBorder(Color.black));
		RLine.addItemListener(tog);
		ROval.addItemListener(tog);
		RRectangle.addItemListener(tog);
		CBFilled.addItemListener(tog);
		group.add(RLine);
		group.add(RRectangle);
		group.add(ROval);
		p.add(RLine);
		p.add(RRectangle);
		p.add(ROval);
		p.add(CBFilled);
		add(p, BorderLayout.SOUTH);
		add(fig, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		PE2 frame = new PE2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class toggleListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			boolean selected = (e.getStateChange() == ItemEvent.SELECTED);
			if (e.getSource() == CBFilled) {
				fig.setFilled(selected);
			} else if (!selected) {
				return;
			} else if (e.getSource() == RLine) {
				fig.setType(FigurePanel.LINE);
			} else if (e.getSource() == RRectangle) {
				fig.setType(FigurePanel.RECTANGLE);
			} else if (e.getSource() == ROval) {
				fig.setType(FigurePanel.OVAL);
			} 
		}

	}

}


