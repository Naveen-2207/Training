package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
//		Queue<Integer> queueData = new PriorityQueue<Integer>();
//		Queue<Integer> arrayDeque = new ArrayDeque<Integer>();
		queue.add(20);
		queue.add(40);
		queue.add(30);
		queue.add(50);
		queue.add(10);
		System.out.println("Initial Queue: " + queue);
		
		queue.poll();
		System.out.println("After Poll: " + queue);
		
		System.out.println("Peek method: " + queue.peek());
		System.out.println("size method: " + queue.size());
		
	}

}
