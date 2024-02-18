package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackListExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Character> nstack = new Stack<Character>();
		System.out.println("Enter no of elements: ");
		int n = input.nextInt();
		System.out.println("Enter the stack elements");
		for (int i = 0; i < n; i++) {
			nstack.push(input.next().charAt(0));
		}
		System.out.println(" ");

	}

}
