package Algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 6, 23, 34, 9, 8, 1, 0, 7, 3, 10, 11, 18};
		
		int index = linearSearch(array, 2);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}
	}

	private static int linearSearch(int[] array, int value) {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length; i++) {
			if(array[i] == value) {
                return i;
            }
		}
		return -1;
	}
}
