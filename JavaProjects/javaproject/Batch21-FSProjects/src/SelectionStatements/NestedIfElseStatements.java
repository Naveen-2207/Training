package SelectionStatements;

import java.util.Scanner;

public class NestedIfElseStatements {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter an age: ");
		int age = obj.nextInt();

		if (age > 0) {
			if (age >= 18) {
				System.out.println("Eligible for voting");
			} else {
				System.out.println("Not Eligible for voting");
			}
		} else {
			System.err.println("Enter a valid age");
		}
		obj.close();
	}
}
