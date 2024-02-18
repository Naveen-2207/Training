package PracticeProgram;

import java.util.Scanner;

public class PatternTask7 {

	public static void main(String[] args) {
		System.out.println("PATTERN");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a Number: ");
		int size = nav.nextInt();
		System.out.println("\nprint the pattern \n");
		for (int i = 0; i < size; i++) {
			System.out.print("X ");
			for (int j = 1; j < size - 1; j++) {
				if (i == 0 || i == size - 1) {
					System.out.print("X ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("X ");
		}

		nav.close();
	}
}
