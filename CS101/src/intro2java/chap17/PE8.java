package intro2java.chap17;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class PE8 extends JFrame {

	public PE8() {
		add(new fontPanel());
	}

	public static void main(String[] args) {
		PE8 frame = new PE8();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class fontPanel extends JPanel {
		GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = g.getAvailableFontFamilyNames();
		JComboBox fontBox = new JComboBox(fontNames);
		Integer[] sizes = {10, 12, 14, 16, 18, 20, 22, 24};
		JComboBox fontSize = new JComboBox(sizes);
		boolean bold = false;
		boolean italic = false;
		String fontName = "Lucida Grande";
		int size = 12;
		boolean centered = true;
		JCheckBox CBCentered = new JCheckBox("Centered", true);
		JCheckBox CBBold = new JCheckBox("Bold");
		JCheckBox CBItalic = new JCheckBox("Italic");

		public fontPanel() {
			setPreferredSize(new Dimension(600, 300));
			setLayout(new BorderLayout());
			JPanel bottomPanel = new JPanel();
			JPanel topPanel = new JPanel();
			JLabel nameLabel = new JLabel("Font Name:");
			JLabel sizeLabel = new JLabel("Font Size:");
			CheckBoxListener CBListener = new CheckBoxListener();
			CBCentered.addItemListener(CBListener);
			CBBold.addItemListener(CBListener);
			CBItalic.addItemListener(CBListener);
			topPanel.add(nameLabel);
			topPanel.add(fontBox);
			topPanel.add(sizeLabel);
			topPanel.add(fontSize);
			bottomPanel.add(CBCentered);
			bottomPanel.add(CBBold);
			bottomPanel.add(CBItalic);
			add(topPanel, BorderLayout.NORTH);
			add(bottomPanel, BorderLayout.SOUTH);
			fontBox.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					fontName = (String)fontBox.getSelectedItem();
					repaint();
				}

			});
			fontSize.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					size = (Integer)fontSize.getSelectedItem();
					repaint();
				}

			});

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int style;
			if (bold || italic) {
				style = ((bold) ? Font.BOLD : 0) + ((italic) ? Font.ITALIC : 0);
			} else {
				style = Font.PLAIN;
			}
			setFont(new Font(fontName, style, size));
			FontMetrics m = g.getFontMetrics();
			int x = 0;
			int y = (getHeight() / 2);
			if (centered) {
				x = (getWidth() / 2) - (m.stringWidth("Java is cool!") / 2);
			}
			g.drawString("Java is cool!", x, y);
		}

		public class CheckBoxListener implements ItemListener {

			@Override
			public void itemStateChanged(ItemEvent e) {
				boolean selected = e.getStateChange() == ItemEvent.SELECTED;
				if (e.getSource() == CBBold) {
					bold = selected;
				} else if (e.getSource() == CBItalic) {
					italic = selected;
				} else if (e.getSource() == CBCentered) {
					centered = selected;
				}
				repaint();
			}

		}


	}

}


