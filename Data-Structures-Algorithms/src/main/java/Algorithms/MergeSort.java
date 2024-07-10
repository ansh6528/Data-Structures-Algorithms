package Algorithms;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int arr[] = {3, 9, 5, 1, 4, 2, 6, 8, 7};
		
		mergeSort(arr);
		
		for(int each: arr) {
			System.out.print(each);
		}
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length;
		
		if(length <= 1) return;
		
		int middle = length/2;
		int [] leftArray = new int[middle];
		int [] rightArray = new int[length - middle];
		
		int i=0;
		int j=0;
		
		for(; i<length; i++) {
			
			if(i < middle) {
				leftArray[i] = arr[i];
			} else {
				rightArray[j] = arr[i];
				j++;
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, arr);
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
		// TODO Auto-generated method stub
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		int i=0, l=0, r=0;
		
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				arr[i] = leftArray[l];
				i++;
				l++;
			} else {
				arr[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			arr[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
            arr[i] = rightArray[r];
            i++;
            r++;
		}
	}

//	//method for dividing the array into small parts until the size of each part is one.....using recursion
//	private static void mergeSort(int[] arr) {
//		// TODO Auto-generated method stub
//		int length  = arr.length;
//		if(length <= 1) return; //base case
//		
//		int middle = length/2;
//		
//		int[] leftArray = new int[middle];
//		int[] rightArray = new int[length - middle];
//		
//		int i=0; //left array
//		int j=0; //right array
//		
//		for(; i<length; i++) {
//			if(i < middle) {
//				leftArray[i] = arr[i];
//			} else {
//				rightArray[j] = arr[i];
//				j++;
//			}
//		}
//		mergeSort(leftArray); //recursive call
//		mergeSort(rightArray); //recursive call
//		merge(leftArray, rightArray, arr);
//	}
//
//	//method for merging the smaller arrays on basis of size
//	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
//		// TODO Auto-generated method stub
//		int leftSize = arr.length/2;
//		int rightSize = arr.length - leftSize;
//		int i = 0, l = 0, r = 0; //indices
//		
//		//check the conditions for merging
//		
//		while(l < leftSize && r < rightSize) {
//			if(leftArray[l] < rightArray[r]) {
//				arr[i] = leftArray[l];
//				i++;
//				l++;
//			} else {
//				arr[i] = rightArray[r];
//				i++;
//				r++;
//			}
//		}
//		
//		while(l < leftSize) {
//			arr[i] = leftArray[l];
//			i++;
//			l++;
//		}
//		while(r < rightSize) {
//			arr[i] = rightArray[r];
//			i++;
//			r++;
//		}
//	}
}
