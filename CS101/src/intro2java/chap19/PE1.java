package intro2java.chap19;

import java.io.File;
import java.io.PrintWriter;

public class PE1 {
	
	public static void main(String[] args) throws Exception {
		PrintWriter p = new PrintWriter("Exercise19_1");
		for (int x = 0; x < 100; x++) {
			p.print((int)((Math.random() * 100) + 1));
			p.print(' ');
		}
		p.close();
	}

}
