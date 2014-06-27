package intro2java.chap16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class BaloonGame extends JFrame {

	public BaloonGame() {
		add(new BaloonPanel());
	}

	public static void main(String[] args) {
		BaloonGame frame = new BaloonGame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class BaloonPanel extends JPanel {
		private int gunRadius = 40;
		private int bulletRadius = gunRadius;
		private int explosionRadius = 20;
		private int gunDegree = 180;
		private int bulletDegree;
		private int baloonx = (int)(Math.random() * 400 - 35);
		private int baloony = 0;
		private boolean bulletAnimating = false;
		private boolean baloonAnimating = true;
		private boolean explosionAnimating = false;
		private long animationStartTime = 0;
		private long animationEllapsedTime = 0;
		private KeyAdapter k = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					gunDegree += 5;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					gunDegree -= 5;
				} else if (e.getKeyCode() == KeyEvent.VK_SPACE && !bulletAnimating) {
					bulletAnimating = true;
					bulletDegree = gunDegree;
					repaint();
				}
			}

		};

		public BaloonPanel() {
			setFocusable(true);
			requestFocusInWindow();
			Timer t = new Timer(100, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					repaint();
				}

			});
			addKeyListener(k);
			t.start();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawGun(g);
			if (bulletAnimating) {
				animateBullet(g);
			}
			if (baloonAnimating) {
				animateBaloon(g);
			}
			if (explosionAnimating) {
				animateExplosion(g);
			}
		}

		private void drawGun(Graphics g) {
			g.setColor(Color.BLACK);
			int x1 = (int)(getWidth() / 2.0);
			int y1 = (int)(getHeight());
			int x2 = (int) (Math.sin(gunDegree * (Math.PI / 180)) * gunRadius
					+ (getWidth() / 2.0));
			int y2 = (int)(Math.cos(gunDegree * (Math.PI / 180)) * gunRadius
					+ getHeight());
			int displacement = 3;
			for (int i = 0; i < 6; i++) {
				g.drawLine(x1 - displacement, y1, x2 - displacement, y2);
				displacement++;
			}
		}

		private void animateBullet(Graphics g) {
			g.setColor(Color.RED);
			bulletRadius += 10;
			int x = (int) (Math.sin(bulletDegree * (Math.PI / 180)) * bulletRadius
					+ (getWidth() / 2.0)) - 5;
			int y = (int)(Math.cos(bulletDegree * (Math.PI / 180)) * bulletRadius
					+ getHeight());
			g.fillOval(x, y, 10, 10);
			if (isHit(x, y) || x > getWidth() || x < 0
					|| y > getHeight() || y < 0) {
				bulletAnimating = false;
				bulletRadius = gunRadius;
				if (isHit(x, y)) {
					baloonAnimating = false;
					explosionAnimating = true;
					animationStartTime = System.currentTimeMillis();
				}
			}
		}

		private void animateBaloon(Graphics g) {
			g.setColor(Color.BLACK);
			if (baloonx > getWidth() - 35) {
				baloonx = 0;
			}
			g.drawOval(baloonx, baloony, 35, 35);
			baloonx += 5;
		}
		
		private boolean isHit(int x, int y) {
			Rectangle2D.Float baloonBox = new Rectangle2D.Float(baloonx, baloony, 35, 35);
			Rectangle2D.Float bulletBox = new Rectangle2D.Float(x, y, 10, 10);
			return baloonBox.intersects(bulletBox);
		}
		
		private void animateExplosion(Graphics g) {
			g.setColor(Color.BLACK);
			animationEllapsedTime = System.currentTimeMillis() - animationStartTime;
			if (animationEllapsedTime > 1000) {
				baloonx = (int)(Math.random() * 400 - 35);
				explosionRadius = 20;
				explosionAnimating = false;
				baloonAnimating = true;
				return;
			}
			explosionRadius += 10;
			int baloonCenterx = baloonx + 17;
			int baloonCentery = baloony + 17;
			for (int degree = 45; degree <= 360; degree += 45) {
				int x = (int) (Math.cos(degree * (Math.PI / 180)) * explosionRadius
						+ (baloonCenterx));
				int y = (int)(Math.sin(degree * (Math.PI / 180)) * explosionRadius
						+ baloonCentery);
				g.drawOval(x, y, 7, 7);
			}
		}

	}


}


