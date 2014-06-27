package intro2java.chap16;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;

public class PE2 extends JFrame {

	public PE2() {
		setLayout(new FlowLayout());
		addComponentListener(new ComponentListener() {

			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("Component Hidden");
			}

			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("Component Moved");
			}

			@Override
			public void componentResized(ComponentEvent e) {
				System.out.println("Component Resized");
			}

			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("Component Resized");
			}
			
		});
	}

	public static void main(String[] args) {
		PE2 frame = new PE2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class testPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

}
