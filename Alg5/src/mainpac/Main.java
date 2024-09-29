package mainpac;

// быстрая сортировка

public class Main {
	public static void main(String[] args) {

		int[] array = new int[] { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

		printArray(array);

		quickSort(array, 0, array.length - 1);
		
		printArray(array);
	}

	private static void quickSort(int[] arr, int from, int to) {
		if (from < to) {
			int divideIndex = partition(arr, from, to);

			quickSort(arr, from, divideIndex - 1);

			quickSort(arr, divideIndex, to);

		}
	}

	private static int partition(int[] arr, int from, int to) {
		int rightIndex = to;
		int leftIndex = from;
		int pivot = arr[from];
		
		while (leftIndex <= rightIndex) {

			while (arr[leftIndex] < pivot) {
				leftIndex++;
			}

			while (arr[rightIndex] > pivot) {
				rightIndex--;
			}

			if (leftIndex <= rightIndex) {
				swap(arr, rightIndex, leftIndex);
				leftIndex++;
				rightIndex--;
			}

		}
		printArray(arr);
		System.out.println(pivot);	
		return leftIndex;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.print("\n");
	}
}
