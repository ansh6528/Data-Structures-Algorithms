package dataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder()); //for reversing the order of the Priority Queue
		
		queue.offer("Ansh");
		queue.offer("Tuffy");
		queue.offer("Nanha");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
