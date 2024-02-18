package PracticeProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("FIBONACCI SERIES");
		System.out.print("\nFibonacci Series: ");
		Scanner nav = new Scanner(System.in);
		int lnum = nav.nextInt();
		int a = 0, b = 1, c, fnum;
		System.out.print("\nFibonacci Series: " + a + " " + b);
		for (fnum = 2; fnum < lnum; fnum++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		nav.close();
	}

}
