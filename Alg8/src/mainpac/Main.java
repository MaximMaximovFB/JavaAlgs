package mainpac;

/*
 * Алгоритм поиска в массиве
 * Ищем индекс в массиве
 */
public class Main {
	public static void main(String[] args) {
		int[] array = new int[] { 0, 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		printArray(array);
		System.out.println(searchLinear(array, 5));
		bubleSorting(array);
		System.out.println(searchBinaryRecursive(array, 0, array.length - 1, 8));

	}

	private static int searchBinaryRecursive(int[] array, int startInd, int endInd, int element) {
		if (endInd >= startInd) {
			int midInd = startInd + (endInd - startInd) / 2;

			if (array[midInd] == element) {
				return midInd;
			}

			if (array[midInd] >= element) {
				return searchBinaryRecursive(array, startInd, midInd - 1, element);
			} else {
				return searchBinaryRecursive(array, midInd + 1, endInd, element);
			}
		}
		return -1;
	}

	private static int searchBinaryNoneRecursive(int[] array, int element) {\
		int startInd = 0;
		int endInd = array.length-1;
		int midInd;
		while (endInd >= startInd) {
			midInd = startInd + (endInd-startInd)/2;
			
			if (array[midInd] == element) {
				return midInd;
			}
			
			if (array[midInd] >= element) {
				endInd = midInd - 1;
			} else {
				startInd = midInd +1;
			}
		}
		return -1;
	}

	private static void bubleSorting(int[] array) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					isSorted = false;
				}
			}

		}
		printArray(array);
	}

	private static int searchLinear(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.print("\n");
	}
}
