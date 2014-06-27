package intro2java.chap19;

import java.io.*;

public class PE14 {
	
	public static void main(String[] args) throws IOException {
		encrypt("source.dat", "encryptedSource.dat");
		decrypt("encryptedSource.dat", "decryptedSource.dat");
		
		DataInputStream sourceInput = new DataInputStream(new BufferedInputStream(
				new FileInputStream("decryptedSource.dat")));
		for (int x = 0; x < 10000; x++) {
			System.out.println(sourceInput.readInt());
		}
	}
	
	public static void encrypt(String source, String encryptedFileName) throws IOException {
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(encryptedFileName));
		
		try {
			while (true) {
				output.write(input.read() + 5);
			}
		} catch (EOFException e) {
			System.out.println("Done writing.");
		}
		
	}
	
	public static void decrypt(String source, String decryptedFileName) throws IOException {
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(decryptedFileName));
		
		try {
			while (true) {
				output.write(input.read() - 5);
			}
		} catch (EOFException e) {
			System.out.println("Done writing.");
		}
	}

}
