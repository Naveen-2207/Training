package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
//		Queue<Integer> deque = new ArrayDeque<Integer>();
		deque.add(20);
		deque.add(40);
		deque.add(30);
		deque.add(50);
		deque.add(10);
		System.out.println("Initial Queue: " + deque);
		
		System.out.println("Peek method: " + deque.peek());
		System.out.println("size method: " + deque.size());
		
		deque.poll();
		System.out.println("After Poll: " + deque);
		
	}

}
