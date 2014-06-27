package intro2java.chap6;

import java.util.Arrays;

public class RQ21 {

	public static void insertionSort(double[] list) {
	    for (int i = 1; i < list.length; i++) {
	      /** insert list[i] into a sorted sublist list[0..i-1] so that
	           list[0..i] is sorted. */
	      double currentElement = list[i];
	      int k;
	      for (k = i - 1; k >= 0 && list[k] < currentElement; k--) {
	        list[k + 1] = list[k];
	      }

	      // Insert the current element into list[k+1]
	      list[k + 1] = currentElement;
	    }
	  }
	
	public static void main(String[] args) {
		double[] d = {1,3,6,3,7,8,3,5,};
		insertionSort(d);
		System.out.println(Arrays.toString(d));
	}
	
}
