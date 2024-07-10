package Algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 9, 1, 0, 6, 3, 7, 5, 8};

		bubbleSort(arr);

		for (int each : arr) {
			System.out.print(each);
		}
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

//	private static void bubbleSort(int[] arr) {
//		for (int i=0; i<arr.length - 1; i++) {
//			for(int j=0; j<arr.length - 1 - i; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//	}



}
