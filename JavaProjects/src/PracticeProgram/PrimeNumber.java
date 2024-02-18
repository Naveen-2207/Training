package PracticeProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Prime Number or not a Prime Number ");
		System.out.print("\nEnter a Number: ");
		Scanner nav = new Scanner(System.in);
		int a = nav.nextInt();
		boolean prime = true;
		if (a == 0 || a == 1) {
			System.out.println("\n" + a + " is not a Prime number");
		} else {
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					System.out.println("\n" + a + " is not a Prime number");
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println("\n" + a + " is  a prime number");
			}
		}
		nav.close();
	}
}
