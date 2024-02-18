package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> data = new LinkedList<Integer>();
		data.add(20);
		data.add(10);
		data.add(50);
		data.add(40);
		data.add(30);
		System.out.println("\nInitial Queue: " + data);
		System.out.println("\npeek method: " + data.peek());
		System.out.println("\nAfter poll: " + data.poll());
		System.out.println("\npeek method: " + data.peek());
		System.out.println("\nAfter poll: " + data.poll());
		System.out.println("\npeek method: " + data.peek());
		System.out.println("\nAfter poll: " + data.poll());
		System.out.println("\npeek method: " + data.peek());
		System.out.println("\nAfter poll: " + data.poll());
		System.out.println("\npeek method: " + data.peek());
		System.out.println("\nAfter poll: " + data.poll());
		System.out.println("\nsize method: " + data.size());

	}

}
 