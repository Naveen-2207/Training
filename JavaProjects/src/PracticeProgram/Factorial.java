package PracticeProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("FACTORIAL OF THE GIVEN NUMBER");
		System.out.print("\nEnter the num: ");
		@SuppressWarnings("resource")
		Scanner nav = new Scanner(System.in);
		int a = nav.nextInt();
		int i, fact = 1;
		for (i = 1; i <= a; i++) {
			fact *= i;
		}
		System.out.println("\nFactorial of " + a + " is: " + fact);
		nav.close();
	}

}
