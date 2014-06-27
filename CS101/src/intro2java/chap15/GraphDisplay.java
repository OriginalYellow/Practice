package intro2java.chap15;

import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

/* The file format expected here is different than the one in the textbook. All
 * you need to write in the file is a point per line, starting with the x and y
 * values and then listing all its edges. You don't need to enter the point number
 * or the number of total points.
 */

public class GraphDisplay extends JFrame {

	public GraphDisplay(String fileName) {
		add(new GraphPanel(fileName));
	}

	public static void main(String[] args) {
		GraphDisplay frame = new GraphDisplay("Graph.txt");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class GraphPanel extends JPanel {
	File f;

	public GraphPanel(String fileName) {
		f = new File(fileName);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ArrayList<Integer[]> points = new ArrayList<Integer[]>();
		ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
		Scanner s = null;
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		while (s.hasNextLine()) {
			Scanner line = new Scanner(s.nextLine());
			Integer[] point = {line.nextInt(), line.nextInt()};
			points.add(point);
			ArrayList<Integer> pointEdges = new ArrayList<Integer>();
			while (line.hasNextInt()) {
				pointEdges.add(line.nextInt());
			}
			edges.add(pointEdges);
		}
		drawEdges(g, points, edges);
		drawVertices(g, points);
	}

	private void drawEdges(Graphics g, ArrayList<Integer[]> points,
			ArrayList<ArrayList<Integer>> edges) {
		for (int a = 0; a < points.size(); a++) {
			for (int b = 0; b < edges.get(a).size(); b++) {
				int x1 = points.get(edges.get(a).get(b))[0];
				int y1 = points.get(edges.get(a).get(b))[1];
				int x2 = points.get(a)[0];
				int y2 = points.get(a)[1];
				g.drawLine(x1, y1, x2, y2);
			}
		}
		
	}
	
	private void drawVertices(Graphics g, ArrayList<Integer[]> points) {
		for (int x = 0; x < points.size(); x++) {
			g.fillOval(points.get(x)[0] - 7, points.get(x)[1] - 7, 14, 14);
			g.drawString("" + x, points.get(x)[0] - 11, points.get(x)[1] - 7);
		}
	}

}


