package intro2java.chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PE7 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("Exercise19_7.dat")));

		int i = (int)(Math.random() * 10 + 1);
		for (int x = 0; x < i; x++) {
			output.writeObject(new Loan(0, 1, x));
		}

		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("Exercise19_7.dat")));
		
		try {
			while (true) {
				System.out.println(((Loan)input.readObject()).getLoanAmount());
			}
		} catch (EOFException e) {
			System.out.println("Done Reading");
		}
	}

}
