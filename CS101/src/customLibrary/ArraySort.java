package customLibrary;
import java.util.Arrays;

public class ArraySort {

	public static void bubbleSort(double[] list) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] > list[j]) {
					notSorted = true;
					double jTemp = list[j];
					list[j] = list[i];
					list[i] = jTemp;
				}
			}
		}
	}

	public static void bubbleSortTied(int[] list, int[] list2) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] > list[j]) {
					notSorted = true;
					int jTemp = list[j];
					int jTemp2 = list2[j];
					list[j] = list[i];
					list2[j] = list2[i];
					list[i] = jTemp;
					list2[i] = jTemp2;
				}
			}
		}
	}
	
	//Overloads bubbleSortTied to sort a 1D array while tying it 
	//to the rows of a 2D array
	public static void bubbleSortTied(int[] list, int[][] list2) {
		boolean notSorted = true;
		while(notSorted) {
			notSorted = false;
			for(int i = 0, j = 1; i < list.length - 1; i++, j++) {
				if (list[i] > list[j]) {
					notSorted = true;
					int jTemp = list[j];
					int[] jTemp2 = list2[j];
					list[j] = list[i];
					list2[j] = list2[i];
					list[i] = jTemp;
					list2[i] = jTemp2;
				}
			}
		}
	}
	
	//Test space
	public static void main(String[] args) {
		int[][] array1 = {{1,3},
				{4,2},
				{4,1},
				{1,2}};
		int[] array2 = {3,2,1,2};
		bubbleSortTied(array2, array1);
		System.out.println(Arrays.deepToString(array1));
	}
	
}