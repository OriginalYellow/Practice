package intro2java.chap19;

import java.io.*;

public class PE8 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("PE8.dat", "rw");
		raf.seek(0);
		if (raf.length() != 0) {
			int i = raf.readInt() + 1;
			raf.seek(0);
			raf.writeInt(i);
		} else {
			raf.writeInt(1);
		}
		raf.seek(0);
		System.out.println(raf.readInt());
		raf.close();

	}

}
