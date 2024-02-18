package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();

		queue.add(20);
		queue.add(40);
		queue.add(30);
		queue.add(50);
		queue.add(10);
		System.out.println("Initial Queue: " + queue);
		
		System.out.println("Peek method: " + queue.peek());
		System.out.println("size method: " + queue.size());
		
		queue.poll();
		System.out.println("After Poll: " + queue);
		
		queue.poll();
		System.out.println("After Poll: " + queue);
		
		queue.poll();
		System.out.println("After Poll: " + queue);
		
		queue.poll();
		System.out.println("After Poll: " + queue);
		
	}

}
