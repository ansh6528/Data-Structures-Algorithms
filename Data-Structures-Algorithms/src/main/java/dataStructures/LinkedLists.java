package dataStructures;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();
		
//		linkedList.push("A");
//		linkedList.push("B");
//		linkedList.push("C");
//		linkedList.push("D");
//		linkedList.push("F");
//		linkedList.pop();
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll();
		
		linkedList.add(4, "E");
		linkedList.remove("E");
		System.out.println(linkedList.peekLast());
		
		System.out.println(linkedList.indexOf("D"));
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList);
		
	}

}
