package mainpac;

public class Main {
	public static void main(String[] args) {

		int[] array = new int[] { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		
		mergeSort(array);

	}

	private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {

		int index1 = src1Start;
		int index2 = src2Start;

		int src1End = Math.min(src1Start + size, src1.length);
		int src2End = Math.min(src2Start + size, src2.length);

		int iterationCount = src1End - src1Start + src2End - src2Start;

		for (int i = destStart; i < destStart + iterationCount; i++) {
			if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
				dest[i] = src1[index1];
				index1++;
			} else {
				dest[i] = src2[index2];
				index2++;
			}
		}
	}
	
	public static int[] mergeSort(int[] array) {
		int[] temp;
		int[] currentSrc = array;
		int[] currentDest = new int[array.length];
		
		int size = 1;
		
		while (size < array.length) {
			for (int i = 0; i < array.length; i += 2*size) {
				merge(currentSrc, i, currentSrc, i+size, currentDest, i, size);
			}
			temp = currentSrc; 
			currentSrc = currentDest;
			currentDest = temp;
			size = size * 2; 
			
			printArray(array);	
		}
		
		return currentSrc;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.print("\n");
	}
}
