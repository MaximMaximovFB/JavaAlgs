package mainpac;

import java.util.Iterator;

public class Main {
//сортировка выбором
	public static void main(String[] args) {

		int[] array = new int[] {9, 1, 8, 2, 7, 3, 6, 4, 6, 5};

		for (int step = 0; step < array.length; step++) {
			printArray(array);
			int index = min(array, step);
			int temp = array[step];
			array[step] = array[index];
			array[index] = temp;
		}

		printArray(array);

	}

	private static int min(int[] array, int start) {
		int minVal = array[start];
		int minIndex = start;

		for (int i = start + 1; i < array.length; i++) {
			if (array[i] < minVal) {
				minVal = array[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.print("\n");
	}
}
