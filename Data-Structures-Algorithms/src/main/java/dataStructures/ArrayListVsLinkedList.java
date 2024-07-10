package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for(int i=0; i<1000000; i++) {
			arrayList.add(i);
	        linkedList.add(i);
		}
		
		Long startTime;
		Long endTime;
		Long elapsedTime;
		
		//******ArrayList operations******
		startTime = System.nanoTime();
		
		//arrayList.get(0);
		//arrayList.get(500000);
		//arrayList.get(999999);
		//arrayList.add(0, 1);
		//arrayList.add(500000, 1);
		//arrayList.add(1000000, 1);
		//arrayList.remove(500000);
		arrayList.remove(999999);
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("ArrayList time: \t" + elapsedTime);
		
		//******LinkedList operations******
		startTime = System.nanoTime();
		
		//linkedList.get(0);
		//linkedList.get(500000);
		//linkedList.get(999999);
		//linkedList.add(0, 1);
		//linkedList.add(500000, 1);
		//linkedList.add(1000000, 1);
		//linkedList.remove(500000);
		linkedList.remove(999999);
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("LinkedList time: \t" + elapsedTime);
    }
}
