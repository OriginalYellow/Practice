package intro2java.chap19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PE6 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		new Loan(0, 1, 1);
		
		ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("Exercise19_6.dat")));
		
		output.writeObject(new Loan());
		output.close();
		
		ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("Exercise19_6.dat")));
		
		Loan l = (Loan)input.readObject();
		System.out.println(l.getAnnualInterestRate());
	}

}
