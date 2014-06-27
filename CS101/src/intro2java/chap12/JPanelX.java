package intro2java.chap12;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelX extends JPanel {
	JButton jb1;
	JButton jb2;
	JButton jb3;

	public JPanelX() {
		setLayout(new FlowLayout());
		jb1 = new JButton("Button 1");
		add(jb1);
		jb2 = new JButton("Button 2");
		add(jb2);
		jb3 = new JButton("Button 3");
		add(jb3);
	}
	
	public JPanelX(String button1, String button2, String button3) {
		setLayout(new FlowLayout());
		jb1 = new JButton(button1);
		add(jb1);
		jb2 = new JButton(button2);
		add(jb2);
		jb3 = new JButton(button3);
		add(jb3);
	}
	
}
