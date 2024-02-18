package IterativeStatements;

import java.util.Scanner;

public class ForLoopStatement {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number[enter postive number]: ");
		int n = obj.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			sum += i;  // sum = sum + i
		}
		
		System.out.println("\nSum value: " + sum);

		obj.close();

	}

}
