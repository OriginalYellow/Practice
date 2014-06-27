package intro2java.chap29;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class PE5 extends JFrame {
	Fan f = new Fan();
	JButton start;
	JButton stop;
	JButton reverse;
	JScrollBar scroll;

	public PE5() {
		JPanel p1 = new JPanel();
		start = new JButton("Start");
		stop = new JButton("Stop");
		reverse = new JButton("Reverse");
		scroll = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 0, 10);

		start.addActionListener(new fanButtonListener());
		stop.addActionListener(new fanButtonListener());
		reverse.addActionListener(new fanButtonListener());

		scroll.addAdjustmentListener(new AdjustmentListener() {

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				f.changeSpeed(e.getValue()); 
			}

		});

		p1.setLayout(new FlowLayout());
		p1.add(start);
		p1.add(stop);
		p1.add(reverse);
		setTitle("Fan Control");
		add(f);
		add(p1, BorderLayout.NORTH);
		add(scroll, BorderLayout.SOUTH);
	}

	/** Main method */
	public static void main(String[] args) {
		PE5 frame = new PE5();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public class fanButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == start) {
				f.resume();
			} else if (e.getSource() == stop) {
				f.stop();
			} else if (e.getSource() == reverse) {
				f.reverse();
			}

		}

	}

}

// The class for drawing arcs on a panel
class Fan extends JPanel {
	private int degree = 0;
	private int speed = 3;// change back to zero once control added
	private boolean fanRunning = false;
	private boolean fanReverse = true;
	//Timer t;
	Thread t;

	public Fan() {

		t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (fanRunning) {
						if (fanReverse) {
							degree -= speed;
						} else {
							degree += speed;
						}
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		});
		
		t.start();

		/*
		t = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (fanRunning) {
					if (fanReverse) {
						degree -= speed;
					} else {
						degree += speed;
					}
				}
				repaint();
				System.out.println(degree);
			}

		});
		t.start();
		 */
	}

	// Draw four blades of a fan
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

		int x = xCenter - radius;
		int y = yCenter - radius;

		g.fillArc(x, y, 2 * radius, 2 * radius, 0 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 90 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 180 + degree, 30);
		g.fillArc(x, y, 2 * radius, 2 * radius, 270 + degree, 30);
	}

	public void resume() {
		fanRunning = true;
	}

	public void stop() {
		fanRunning = false;
	}

	public void reverse() {
		fanReverse = !fanReverse;
	}

	public void changeSpeed(int speed) {
		this.speed = speed;
	}

}












