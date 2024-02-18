package PracticeProgram;

import java.util.Scanner;

public class PatternTask2 {

	public static void main(String[] args) {
		System.out.println("PATTERN");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a Number: ");
		int size = nav.nextInt();
		System.out.println("\nprint the pattern \n");
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + i);
			}
			System.out.println("\n");
		}
		nav.close();
	}

}
