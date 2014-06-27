package intro2java.chap15;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class PE21 extends JFrame {

	public PE21() {
		setSize(200, 200);
		setLayout(new GridLayout(3, 3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int x = 0; x < 9; x++) {
			add(new tictacPanel());
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		PE21 p = new PE21();
	}
	
}

class tictacPanel extends JPanel {
	
	public static Image getImage() {
		int i = (int)(Math.random() * 3);
		switch (i) {
		case 0: return new ImageIcon("x.gif").getImage();
		case 1: return new ImageIcon("o.gif").getImage();
		case 2: return new ImageIcon().getImage();
		default: return new ImageIcon().getImage();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(getImage(), 0, 0, getWidth(), getHeight(),
				this);
	}
}








