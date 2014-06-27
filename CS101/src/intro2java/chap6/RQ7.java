package intro2java.chap6;

import customLibrary.Math.RandomValues;

public class RQ7 {
	public static void main(String[] args) {
		//a
		double[] d = new double[10];
		//b
		d[9] = 5.5;
		//c
		System.out.println(d[0] + d[1]);
		//d
		double sum = 0;
		for (int i = 0; i < 10; i++)
			sum += d[i];
		System.out.println(sum);
		//e
		double[] d2 = {3,5,2.3,7,6.6,2};
		double min = d2[0];
		for (int i = 1; i < d2.length; i++) 
			if (d2[i] < min)
				min = d2[i];
		System.out.println(min);
		//f
		int randomIndex = RandomValues.RandomInteger(0, d2.length);
		System.out.println(d2[randomIndex]);
	}
}

