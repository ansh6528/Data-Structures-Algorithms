package Algorithms;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 9, 5, 1, 4, 2, 6, 8, 7};
		
		selectionSort(arr);
		
		for(int each: arr) {
			System.out.print(each);
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp; 
		}
	}

//	private static void selectionSort(int[] arr) {
//		for(int i=0; i<arr.length-1; i++) {
//			int min = i;
//			
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j] < arr[min] ) {
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//	}


}
