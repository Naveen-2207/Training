package IterativeStatements;

import java.util.Scanner;

public class WhileloopStatements {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number[enter postive number]: ");
		int n = obj.nextInt();
		int i = 1, sum = 0;
		while (i <= n) {
			sum += i; // sum = sum + i
			System.out.println(i++);
		}
		
		System.out.println("Sum value: " + sum);
		
		obj.close();

	}

}
