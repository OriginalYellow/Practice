package intro2java.chap9;

import java.io.*;
import java.util.*;

public class PE18 {
	
	public static void main(String[] args) throws Exception {
		
		File scores = new File("Exercise9_18.txt");
		Scanner s = new Scanner(scores);
		int count = 0;
		double sum = 0;
		while (s.hasNextDouble()) {
			sum += s.nextDouble();
			count++;
		}
		System.out.println("Number of scores: " + count);
		System.out.println("Average: " + (sum / count));
		
	}

}
