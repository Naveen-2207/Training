package PracticeProgram;

import java.util.Scanner;

public class SumOfTheDigit {

	public static void main(String[] args) {
		System.out.println("SUM OF THE DIGIT");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a Number: ");
		int num = nav.nextInt();
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum += r;
			num = num / 10;
		}
		System.out.println("\nSum Of The Digits: "+sum);
		nav.close();

	}

}
