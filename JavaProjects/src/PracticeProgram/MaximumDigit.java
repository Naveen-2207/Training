package PracticeProgram;

import java.util.Scanner;

public class MaximumDigit {

	public static void main(String[] args) {
		System.out.println("MAXIMUM DIGIT VALUE");
		System.out.print("\nEnter the Number: ");
		Scanner nav = new Scanner(System.in);
		int num = nav.nextInt();
		int d = 0;
		while (num > 0) {
			int r = num % 10;
			if (d < r) {
				d = r;
			}
			num = num / 10;
		}
		System.out.println("\nMaximum Largest Value is: "+d);
		nav.close();
	}

}
