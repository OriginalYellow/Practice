package intro2java.chap29;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PE2 extends JFrame {
	private int x1 = 0;
	private int x2 = 0;
	private int speed1;
	private int speed2;
	private JTextField field1;
	private JTextField field2;
	private JButton change;
	private TestPanel animation;

	public PE2() {
		JPanel p = new JPanel();
		field1 = new JTextField(4);
		field2 = new JTextField(4);
		change = new JButton("Change Speed");
		change.addActionListener(new SpeedListener());
		p.setLayout(new FlowLayout());
		animation = new TestPanel();
		animation.setSize(400, 200);
		add(animation);
		p.add(field1);
		p.add(field2);
		p.add(change);
		add(p, BorderLayout.NORTH);

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					x1 += speed1;
					if (x1 > getWidth() - 50) {
						x1 = 0;
					}
					x2 += speed2;
					if (x2 > getWidth() - 50) {
						x2 = 0;
					}
					repaint();
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		
		t1.start();
	}

	public static void main(String[] args) {
		PE2 frame = new PE2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public class TestPanel extends JPanel {
		int y1;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			y1 = 40;
			int y2 = y1 + 40;
			paintCar(g, x1, y1);
			paintCar(g, x2, y2);
		}

		public void paintCar(Graphics g, int x, int y) {
			g.setColor(Color.CYAN);
			g.fillRect(x, y-20, 50, 10);
			g.setColor(Color.BLACK);
			g.fillOval(x + 10, y - 10, 10, 10);
			g.fillOval(x + 30, y - 10, 10, 10);
			g.setColor(Color.BLUE);
			int[] tri1x = {x + 10, x + 20, x + 20};
			int[] tri1y = {y - 20, y - 20, y - 30};
			g.fillPolygon(tri1x, tri1y, 3);
			int[] tri2x = {x + 30, x + 40, x + 30};
			int[] tri2y = {y - 20, y - 20, y - 30};
			g.fillPolygon(tri2x, tri2y, 3);
			g.fillRect(x + 20, y - 30, 10, 10);
		}

	}

	public class SpeedListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			speed1 = Integer.parseInt(field1.getText());
			speed2 = Integer.parseInt(field2.getText());
		}

	}

}


