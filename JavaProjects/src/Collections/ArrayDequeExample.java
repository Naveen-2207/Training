package Collections;

import java.util.ArrayDeque;
import java.util.Deque; 

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		Deque<Integer> data = new ArrayDeque<Integer>();
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
