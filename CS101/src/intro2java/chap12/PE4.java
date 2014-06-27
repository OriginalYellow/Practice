package intro2java.chap12;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JPanelX panel1 = new JPanelX("Button 1", "Button 2", "Button 3");
		JPanelX panel2 = new JPanelX("Button 4", "Button 5", "Button 6");

		frame.add(panel1);
		frame.add(panel2);
		
		frame.setVisible(true);
	}
	
}
