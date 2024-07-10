package Algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 9, 1, 0, 6, 3, 7, 5, 8};
		
		insertionSort(arr);
		
		for(int each : arr) {
			System.out.print(each + " ");
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int j= i-1;
			
			while(j >=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

//	private static void insertionSort(int[] arr) {
//		
//		for(int i=1; i<arr.length; i++) {
//			int temp = arr[i];
//			int j = i-1;
//			
//			while(j >= 0 && arr[j] > temp) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = temp;
//		}
//	}

}
