package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> data1 = new PriorityQueue<Integer>();
//		data1.add(20);
//		data1.add(10);
//		data1.add(50);
//		data1.add(40);
//		data1.add(30);
		System.out.println("\nInitial Queue: " + data1);
		data1.poll();
		System.out.println("\nAfter poll: " + data1);
		System.out.println("\npeek method: " + data1.peek());
		System.out.println("\nAfter poll: " + data1.poll());
		System.out.println("\npeek method: " + data1.peek());
		System.out.println("\nAfter poll: " + data1.poll());
		System.out.println("\npeek method: " + data1.peek());
		System.out.println("\nAfter poll: " + data1.poll());
		System.out.println("\npeek method: " + data1.peek());
		System.out.println("\nAfter poll: " + data1.poll());
		System.out.println("\npeek method: " + data1.peek());
		System.out.println("\nAfter poll: " + data1.poll());
		System.out.println("\nsize method: " + data1.size());

	}

}
