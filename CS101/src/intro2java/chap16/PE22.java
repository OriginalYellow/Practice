package intro2java.chap16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;

public class PE22 extends JFrame {

	public PE22() {
		add(new beanPanel(200));
	}

	public static void main(String[] args) {
		PE22 frame = new PE22();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class beanPanel extends JPanel {
	int step;
	int ballx;
	int bally;
	int[] slots;
	int ballNum;
	int maxBeans;
	boolean full;
	int[] debug; 
	Timer t;

	public beanPanel(int maxBeans) {
		setPreferredSize(new Dimension(400, 400));
		ballx = 200;
		bally = 60;
		ballNum = 0;
		step = 1;
		slots = new int[9];
		full = false;
		debug = new int[9];
		this.maxBeans = maxBeans;
		t = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				step++;
				repaint();
			}

		});
		t.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		drawPegs(g);
		drawSlots(g);
		if (ballNum < maxBeans && !full) {
			drawBall(g);
			debug[step - 1] = ballx;
		}
		
	}

	private void drawPegs(Graphics g) {
		int pegx = 200;
		int pegy = 70;
		g.setColor(Color.GRAY);
		for (int i = 0; i < 7; i++) {
			int pegxMove = pegx;
			for (int a = 0; a <= i; a++) {
				g.fillOval(pegxMove, pegy, 10, 10);
				pegxMove += 20;
			}
			pegy += 20;
			pegx -= 10;
		}
	}

	private void drawBall(Graphics g) {
		g.setColor(Color.BLACK);
		if (step == 1) {
			ballx = 200;
			bally = 60;
			g.fillOval(ballx, bally, 10, 10);
		} else if (step < 9) {
			ballAnimate(g);
		} else {
			setSlot();
			ballNum++;
			step = 1;
			repaint();
		}
	}

	private void ballAnimate(Graphics g) {
		if (new Random().nextBoolean()) {
			ballx -= 10;
		} else {
			ballx += 10;
		}
		bally += 20;
		g.fillOval(ballx, bally, 10, 10);
	}

	private void drawSlots(Graphics g) {
		g.setColor(Color.BLACK);
		int slotBallx = 130;
		for (int x = 0; x < slots.length; x++) {
			int slotBally = 260;
			for (int y = 0; y < slots[x]; y++) {
				g.fillOval(slotBallx, slotBally, 10, 10);
				slotBally -= 10;
				if (slots[x] > 6) {
					full = true;
				}
			}
			slotBallx += 20;
		}
	}

	private void setSlot() {
		int slot;
		if (ballx == 130) {
			slot = 0;
		} else if (ballx == 150) {
			slot = 1;
		} else if (ballx == 170) {
			slot = 2;
		} else if (ballx == 190) {
			slot = 3;
		} else if (ballx == 210) {
			slot = 4;
		} else if (ballx == 230) {
			slot = 5;
		} else if (ballx == 250) {
			slot = 6;
		} else if (ballx == 270) {
			slot = 7;
		} else {
			slot = 8;
		}
		slots[slot]++;
	}

}


