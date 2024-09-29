package mainpac;

//Сортировка пузырьком
public class Main {
	public static void main(String[] args) {
		int[] array = new int[] {21,31,2,321,31,23,12,3,123,23};
		printArray(array);
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i-1]) {
					int temp = array[i];
					array[i]= array[i-1];
					array[i-1] = temp;
					isSorted = false;
				}
			}
			
		}
		printArray(array);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(" "+array[i]+" ");
		}
		System.out.print("\n");
	}
}
