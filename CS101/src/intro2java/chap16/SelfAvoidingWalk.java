package intro2java.chap16;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class SelfAvoidingWalk extends JFrame {
	walkPanel walk = new walkPanel(30, 200);

	public SelfAvoidingWalk() {
		setBackground(Color.black);
		setTitle("The Amazing Self-Avoiding Walk");
		setBackground(Color.DARK_GRAY);
		JLabel deadEnds = new JLabel();
		JLabel deadEndPercent = new JLabel();
		deadEnds.setText("Dead Ends: 0");
		deadEndPercent.setText("     Percentage of Dead Ends: " + "0 %");
		walk.addObserver(deadEnds);
		walk.addObserver(deadEndPercent);
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton b = new JButton("Start");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				walk.startWalk();	
			}

		});
		add(walk);
		p.add(b);
		p.add(deadEnds);
		p.add(deadEndPercent);
		add(p, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		SelfAvoidingWalk frame = new SelfAvoidingWalk();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class walkPanel extends JPanel {
		private ArrayList<Point> crossedPoints = new ArrayList<Point>();
		private int gridSideCells;
		private int gridSide;
		private int lineInterval = 20;
		private int deadEnds = 0;
		private int numberOfWalks;
		private int walks = 0;
		boolean wait = false;
		boolean go = false;
		private int observers = 0;
		private Object observer1 = null;
		private Object observer2 = null;
		private Timer t = new Timer(4, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (wait) {
					wait = false;
					go = true;
					return;
				} else if (go) {
					go = false;
					repeatWalk();
					repaint();
					return;
				}

				Point p = getNextPoint();

				//dead end
				if (p == null) {
					setDeadEnds(getDeadEnds() + 1);
					setWalks(getWalks() + 1);
					wait = true;

					//edge reached
				} else if (p.x < 19 || p.y < 19
						|| p.x >= gridSide - 1 || p.y >= gridSide - 1) {
					setWalks(getWalks() + 1);
					crossedPoints.add(p);
					wait = true;
					repaint();

					//keep extending path
				} else {
					crossedPoints.add(p);
					repaint();
				}

			}

		});

		public walkPanel(int gridSideCells, int numberOfWalks) {
			this.numberOfWalks = numberOfWalks;
			this.gridSideCells = gridSideCells;
			gridSide = gridSideCells * 20;
			setPreferredSize(new Dimension(gridSide, 
					gridSide + 1));
		}

		public void startWalk() {
			crossedPoints.clear();
			crossedPoints.add(new Point(lineInterval * (int)(gridSideCells / 2),
					lineInterval * (int)(gridSideCells / 2)));
			t.start();
		}

		public boolean addObserver(Object o) {
			if (observers < 1) {
				observer1 = o;
				observers++;
				return true;
			} else if (observers < 2) {
				observer2 = o;
				observers++;
				return true;
			} else {
				return false;
			}
		}

		private void observeDeadEnds() {
			((JLabel)observer1).setText("Dead Ends: " + getDeadEnds());
		}

		private void observeWalks() {
			long percentage = ((long)(((double)deadEnds) / walks * 100));
			((JLabel)observer2).setText("     Percentage of Dead Ends: " 
					+ percentage + " %");
		}

		private void setWalks(int walks) {
			this.walks = walks;
			observeWalks();
		}
		
		private int getWalks() {
			return walks;
		}

		private void setDeadEnds(int deadEnds) {
			this.deadEnds = deadEnds;
			observeDeadEnds();
		}

		public int getDeadEnds() {
			return deadEnds;
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawGrid(g);
			drawPath(g);
		}

		private void repeatWalk() {
			if (walks < numberOfWalks) {
				t.stop();
				startWalk();
			} else {
				t.stop();
			}
		}

		private void drawGrid(Graphics g) {
			g.setColor(Color.blue);
			for (int y = 20; y <= gridSide; y += 20) {
				g.drawLine(0, y, gridSide, y);
			}
			for (int x = 0; x < gridSide; x += 20) {
				g.drawLine(x, 0, x, gridSide);
			}
		}

		private void drawPath(Graphics g) {
			if (crossedPoints.size() < 2) {
				return;
			}
			g.setColor(Color.PINK);
			Point lastPoint = crossedPoints.get(0);
			for (int i = 1; i < crossedPoints.size(); i++) {
				Point currentPoint = crossedPoints.get(i);
				g.drawLine(lastPoint.x, lastPoint.y, currentPoint.x, currentPoint.y);
				lastPoint = currentPoint;
			}
		}

		private Point getNextPoint() {
			Point p = crossedPoints.get(crossedPoints.size() - 1);
			ArrayList<Point> possiblePoints = new ArrayList<Point>();
			Point[] surroundingPoints = new Point[4];
			surroundingPoints[0] = new Point(p.x - 20, p.y);
			surroundingPoints[1] = new Point(p.x, p.y - 20);
			surroundingPoints[2] = new Point(p.x + 20, p.y);
			surroundingPoints[3] = new Point(p.x, p.y + 20);
			for (int i = 0; i < surroundingPoints.length; i++) {
				boolean free = true;
				for (int c = 0; c < crossedPoints.size(); c++) {
					if (surroundingPoints[i].equals(crossedPoints.get(c))) {
						free = false;
					}
				}
				if (free) {
					possiblePoints.add(surroundingPoints[i]);
				}
			}
			if (possiblePoints.size() < 1) {
				return null;
			} else {
				return possiblePoints.get((int)(possiblePoints.size() * Math.random()));
			}
		}

	}

}


