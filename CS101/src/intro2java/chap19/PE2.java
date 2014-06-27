package intro2java.chap19;

import java.io.*;

public class PE2 {
	
	public static void main(String[] args) throws Exception {
		DataOutputStream op = new DataOutputStream(new FileOutputStream("Exercise19_2.dat"));
		for (int x = 0; x < 2; x++) {
			int i = (int)(Math.random() * 100 + 1);
			op.writeInt(i);
		}
		op.close();
		
		int sum = 0;
		DataInputStream ip = new DataInputStream(new FileInputStream("cluster1_1"));
		
		try {
			while (true) {
				int i = ip.readInt();
				sum += i;
				System.out.println(i);
			}
		} catch (EOFException e) {
			System.out.println("sum = " + sum);
		}
	}

}
