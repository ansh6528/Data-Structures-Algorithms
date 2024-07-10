package Algorithms;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 9, 5, 1, 4, 2, 6, 8, 7};
		quickSort(arr, 0, arr.length - 1);
		
		for(int each: arr) {
			System.out.print(each + " ");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(end <= start) return;
		int pivot = partition(arr, start, end);
		
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
	}
	
	private static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int i = start-1;
		
		for(int j=start; j<=end-1; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		
		return i;
	}

}
