package intro2java.chap30;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println(InetAddress.getLocalHost());
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("PCAddress"));
		output.writeObject(InetAddress.getByName("localhost"));
	}

}
