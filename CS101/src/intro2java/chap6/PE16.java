package intro2java.chap6;

import customLibrary.math.RandomValues;
import customLibrary.Time;
import java.util.Arrays;

public class PE16 {
	
	public static int linearSearch(int[] list, int key) {
	    for (int i = 0; i < list.length; i++) {
	      if (key == list[i])
	        return i;
	    }
	    return -1;
	  }
	
	public static int binarySearch(int[] list, int key) {
	    int low = 0;
	    int high = list.length - 1;

	    while (high >= low) {
	      int mid = (low + high) / 2;
	      if (key < list[mid])
	        high = mid - 1;
	      else if (key == list[mid])
	        return mid;
	      else
	        low = mid + 1;
	    }

	    return -low - 1; // Now high < low
	  }
	
	public static void main(String[] args) {
		int[] values = new int[10000000];
		for (int x = 0; x < 10000000; x++) {
			values[x] = RandomValues.RandomInteger(1, 100000);
		}
		long startTime = System.currentTimeMillis();
		System.out.println(linearSearch(values, 30));
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		Arrays.sort(values);
		startTime = System.currentTimeMillis();
		System.out.println(binarySearch(values, 3000));
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);
	}
	
}
