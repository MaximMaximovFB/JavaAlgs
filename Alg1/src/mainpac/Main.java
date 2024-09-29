package mainpac;
/*
 * Поиск наименьшего 
 */


public class Main {
	public static void main(String[] args) {
		int[] array = new int[] {21,31,2,321,31,23,12,3,123,23};
		
		int minVal = array[0];
		int minIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minVal) {
				minVal = array[i];
				minIndex = i;
			}
		}
		
		System.out.println(minVal);
		
		
	}
}
