package intro2java.chap11;

import java.util.ArrayList;
import java.util.Date;
import intro2java.chap10.PE11Circle2D;

import javax.swing.JFrame;

public class PE6 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Loan());
		list.add(new Date());
		list.add(new JFrame());
		list.add(new PE11Circle2D());
		System.out.println(list);
	}
	
}
