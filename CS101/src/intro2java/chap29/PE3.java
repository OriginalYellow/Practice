package intro2java.chap29;

import java.awt.*;
import javax.swing.*;


public class PE3 extends JFrame {
	private ImageIcon i;
	private Image im;
	private int y = 300;

	public PE3() {
		i = new ImageIcon("india.gif");
		im = i.getImage();
		add(new testPanel());
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					y -= 3;
					if (y < 0) {
						y = 300;
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}).start();
	}

	public static void main(String[] args) {
		PE3 frame = new PE3();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class testPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 50, y, this);
		}

	}

}


