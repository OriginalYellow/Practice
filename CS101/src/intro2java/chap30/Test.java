package intro2java.chap30;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getAllByName("localhost").toString());
		System.out.println("sfda");
	}

}
