package intro2java.chap29;

import java.awt.*;
import javax.swing.*;

public class PE13 extends JFrame {
	int[] ints1;
	int[] ints2;
	int[] ints3;
	int[] ints4;

	public PE13() {
		ints1 = new int[50];
		ints2 = new int[50];
		ints3 = new int[50];
		ints4 = new int[50];
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new BorderLayout());
		JLabel l1 = new JLabel("Selection Sort", JLabel.CENTER);
		JLabel l2 = new JLabel("Insertion Sort", JLabel.CENTER);
		JLabel l3 = new JLabel("Bubble Sort", JLabel.CENTER);

		for (int x = 0; x < 50; x++) {
			ints1[x] = x + 1;
		}
		
		shuffle(ints1);
		System.arraycopy(ints1, 0, ints2, 0, ints1.length);
		System.arraycopy(ints1, 0, ints3, 0, ints1.length);
		System.arraycopy(ints1, 0, ints4, 0, ints1.length);
		
		Font f = new Font("Arial", Font.PLAIN, 20);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);

		p1.add(new sortPanel(ints2));
		p2.add(new sortPanel(ints3));
		p3.add(new sortPanel(ints4));
		p1.add(l1, BorderLayout.NORTH);
		p2.add(l2, BorderLayout.NORTH);
		p3.add(l3, BorderLayout.NORTH);
		
		setLayout(new FlowLayout());
		add(p1);
		add(p2);
		add(p3);
		
		new Thread(new SelectionAnimate(ints2)).start();
		new Thread(new InsertionAnimate(ints3)).start();
		new Thread(new BubbleAnimate(ints4)).start();

	}

	public static void main(String[] args) {
		PE13 frame = new PE13();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void shuffle(int[] vals) {
		for (int x = 0; x < 50; x++) {
			int temp = vals[x];
			int swapIndex = (int)(Math.random() * 50);
			vals[x] = vals[swapIndex];
			vals[swapIndex] = temp;
		}
	}

	class sortPanel extends JPanel {
		int[] vals;

		public sortPanel(int[] vals) {
			this.vals = vals;
			setPreferredSize(new Dimension(375, 375));
			setBackground(Color.DARK_GRAY);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.magenta);
			paintSort(g, vals);
		}

		public void paintSort(Graphics g, int[] ints) {
			double increment = (.8/vals.length) * getWidth();
			int x = (int)(.1 * getWidth());
			int y = (int)(.9 * getHeight());
			for (int i = 0; i < vals.length; i++, x += increment) {
				int height = (int)(getHeight() * (.014 * vals[i])); 
				g.drawRect(x, y - height, (int)increment, height);
			}
		}

	}

	class SelectionAnimate implements Runnable {
		int[] vals;

		public SelectionAnimate(int[] vals) {
			this.vals = vals;
		}

		@Override
		public void run() {
			int iMin;
			for (int j = 0; j < vals.length; j++) {
				iMin = j;
				for (int i = j + 1; i < vals.length; i++) {
					if (vals[i] < vals[iMin]) {
						iMin = i;
					}
				}
				if (iMin != j) {
					int temp = vals[j];
					vals[j] = vals[iMin];
					vals[iMin] = temp;
				}
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	class InsertionAnimate implements Runnable {
		int[] vals;
		
		public InsertionAnimate(int[] vals) {
			this.vals = vals;
		}

		@Override
		public void run() {
			for (int i = 1; i < vals.length; i++) {
				int j = i;
				while ((j > 0) && (vals[j - 1] > vals[j])) {
					int temp = vals[j];
					vals[j] = vals[j - 1];
					vals[j - 1] = temp;
					j = j - 1;
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	class BubbleAnimate implements Runnable {
		int[] vals;
		
		public BubbleAnimate(int[] vals) {
			this.vals = vals;
		}

		@Override
		public void run() {
			for (int x = 0; x < vals.length; x++) {
				for (int j = 0; j < vals.length - 1; j++) {
					if (vals[j] > vals[j + 1]) {
						int temp = vals[j];
						vals[j] = vals[j + 1];
						vals[j + 1] = temp;
					}
					repaint();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}


