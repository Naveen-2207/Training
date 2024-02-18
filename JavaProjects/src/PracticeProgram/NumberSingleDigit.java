package PracticeProgram;

import java.util.Scanner;

public class NumberSingleDigit {

	public static void main(String[] args) {
		System.out.println("NUMBER AS SINGLE DIGIT");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a Number: ");
		int num = nav.nextInt();
		while (num > 0) {
			int r = num % 10;
			System.out.println(r+" ");
			num = num / 10;
		}
		nav.close();
	}

}
