package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		int target = 42;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		//int index = Arrays.binarySearch(arr, target);
		int index = binarySearch(arr, target);
		
		if(index == -1) {
			System.out.println(target + " not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			int val = arr[mid];
			
			if(val < target) {
				low = mid + 1;
			} else if(val > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

}
