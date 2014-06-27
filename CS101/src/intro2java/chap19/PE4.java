package intro2java.chap19;

import java.io.*;
import java.util.*;

public class PE4 {

	public static void main(String[] args) throws Exception {
		File f1 = new File("f1.txt");
		PrintWriter p = new PrintWriter(f1);
		p.print("asked not to be named, described the scene this way: \"The party was at a warehouse" +
				" \nnear the LA river and way outside of any residential area. It was also well organized" +
				" \nand run, maybe 300 people were there and the crowd was mostly mid-20s, not underage" +
				" \nravers by any means, and there for the music.\" He continued: \"FIT played a great set" +
				" \nand literally as Omar-S was stepping up to take over, the lights went on and cops came" +
				" \nin the front. They shut off the music and told everyone to leave immediately. Walking " +
				"\noutside, there was a police helicopter circling the building and shining a spot light down." +
				" \nPeople left peacefully but it just felt really ridiculous.\" The promoter who runs JACK," +
				" \nwho also asked to remain anonymous, added: \"It's cost promoters thousands in losses and " +
				"\nartists paying gigs. It will also slow the traffic of talent ");
		p.close();

		File f2 = new File("f2.dat");
		Scanner s = new Scanner(f1);
		DataOutputStream output = new DataOutputStream(new FileOutputStream(f2));
		while (s.hasNext()) {
			output.writeUTF(s.next());
		}
		output.close();

		DataInputStream ip = new DataInputStream(new FileInputStream(f2));

		try {
			while (true) {
				System.out.print(ip.readUTF());
			}
		} catch (EOFException e) {
			System.out.println("finished reading");
		}
		
		System.out.println(f1.getTotalSpace());
		System.out.println(f2.getTotalSpace());
	}

}
