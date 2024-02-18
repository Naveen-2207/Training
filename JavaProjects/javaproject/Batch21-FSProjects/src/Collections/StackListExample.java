package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackListExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Stack<Character> newStackList = new Stack<>();

        System.out.println("Enter no of elements: ");
        int n = input.nextInt();

        System.out.println("Enter stack elements");
        for (int i = 0; i < n; i++) {
            newStackList.push(input.next().charAt(0));
        }
        System.out.println(newStackList);

        System.out.println(newStackList.peek());
        System.out.println(newStackList);

        System.out.println(newStackList.pop());
        System.out.println(newStackList);

        System.out.println(newStackList.empty());
        input.close();
	}

}
