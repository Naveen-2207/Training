package IterativeStatements;

import java.util.Scanner;

public class DoWhileLoopStatement {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number[enter postive number]: ");
		int n = obj.nextInt();
		int i = 1, sum = 0;
		do {
			sum += i; // sum = sum + i
			System.out.println(i++);
		}
		while(i<=n);
		
		System.out.println("Sum value: " + sum);
		
		obj.close();

	}

}
