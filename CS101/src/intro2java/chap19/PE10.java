package intro2java.chap19;

import java.io.*;

public class PE10 {

	public static void main(String[] args) throws IOException {

		DataOutputStream sourceOutput = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("source.dat")));
		for (int x = 0; x < 100; x++) {
			sourceOutput.writeInt(x);
		}
		sourceOutput.close();

		/*
		splitFile("source.dat", 9, "ClusterNum.dat");
		buildFile("rebuild.dat", getLastClusterNum("ClusterNum.dat"));
		
		DataInputStream sourceInput = new DataInputStream(new BufferedInputStream(
				new FileInputStream("rebuild.dat")));
		for (int x = 0; x < 100; x++) {
			System.out.println(sourceInput.readInt());
		}
		*/
	}

	/**name: source file's name
	 * pieces: number of pieces to split into
	 * clusterNumFileName: name of the file that determines the split files' names**/
	public static void splitFile(String name, int pieces, String clusterNumFileName) throws IOException {

		DataInputStream source = new DataInputStream(new BufferedInputStream(new FileInputStream(name)));
		int clusterNum = getNewClusterNum(clusterNumFileName);
		int size = source.available();
		int pieceSize = size / pieces;

		if (size % pieces != 0) {
			pieces++;
		}

		for (int x = 0; x < pieces; x++) {
			String fileName = "cluster" + clusterNum + "_" + (x+1) + ".dat";
			DataOutputStream sourceOutput = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(fileName)));

			try {
				for (int i = 0; i < pieceSize; i++) {
					sourceOutput.writeByte(source.readByte());
				}
			} catch (EOFException e) {}
			sourceOutput.close();
		}

	}

	/**outputName: name of new file to build
	 * clusterNum: the number associated with the split files to rebuild from**/
	public static void buildFile(String outputName, int clusterNum) throws IOException {

		DataOutputStream sourceOutput = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream(outputName)));

		int i = 0;
		try {
			while (true) {
				String inputName = "cluster" + clusterNum + "_" + (i+1) + ".dat";

				DataInputStream sourceInput = new DataInputStream(new BufferedInputStream(
						new FileInputStream(inputName)));

				try {
					while (true) {
						sourceOutput.writeByte(sourceInput.readByte());
					}
				} catch (EOFException e) {}
				
				i++;
			}
		} catch (FileNotFoundException e) {}
		
		sourceOutput.close();
	}

	private static int getNewClusterNum(String fileName) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
		raf.seek(0);
		if (raf.length() != 0) {
			int i = raf.readInt() + 1;
			raf.seek(0);
			raf.writeInt(i);
		} else {
			raf.writeInt(1);
		}
		raf.seek(0);
		int num = raf.readInt();
		raf.close();
		return num;
	}

	private static int getLastClusterNum(String fileName) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
		raf.seek(0);
		int num = raf.readInt();
		raf.close();
		return num;
	}

}
