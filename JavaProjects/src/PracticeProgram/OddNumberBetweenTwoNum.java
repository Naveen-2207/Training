package PracticeProgram;

import java.util.Scanner;

public class OddNumberBetweenTwoNum {

	public static void main(String[] args) {
		System.out.println("Odd NUMBERS BETWEEN TWO NUMBERS");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a num1: ");
		int num1 = nav.nextInt();
		System.out.print("\nEnter a num2: ");
		int num2 = nav.nextInt();
		for (int i = num1; i < num2; i++) {
			if (i % 2 == 1) {
				System.out.print(i+" ");
			}
		}
	}

}
