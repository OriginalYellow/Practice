package intro2java.chap19;

import java.io.*;
import java.util.Date;

public class PE5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("Exercise19_5.dat")));
		
		output.writeInt(1);
		output.writeInt(2);
		output.writeInt(3);
		output.writeInt(4);
		output.writeInt(5);
		output.writeObject(new Date(System.currentTimeMillis()));
		output.writeDouble(5.5);
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("Exercise19_5.dat")));
		
		System.out.println(input.readInt());
		System.out.println(input.readInt());
		System.out.println(input.readInt());
		System.out.println(input.readInt());
		System.out.println(input.readInt());
		System.out.println((Date)input.readObject());
		System.out.println(input.readDouble());
	}
	
}
