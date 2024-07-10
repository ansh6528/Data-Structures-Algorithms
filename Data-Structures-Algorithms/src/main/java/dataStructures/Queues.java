package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Ansh");
		queue.offer("Akshat");
		queue.offer("Tuffy");
		queue.offer("Satyendra");
		
		System.out.println("Queue -> " + queue);
		System.out.println("Element removed from Queue -> " + queue.poll());
		System.out.println("Queue after removal of element -> " + queue);
		System.out.println("Element at the head of the queue -> " + queue.peek());
	}

}
