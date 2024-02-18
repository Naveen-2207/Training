package PracticeProgram;

import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		System.out.println("ARMSTRONG NUMBER OR NOT");
		int sum = 0, a, temp;
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter a Number: ");
		int num = nav.nextInt();
		temp = num;
		while (num > 0) {
			a = num % 10;
			sum += (a * a * a);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("\n" + temp + " is a ArmstrongNUmber "+sum);
		}
		else {
			System.out.println("\n" + temp + " is Not a ArmstrongNUmber "+sum);
		}
		nav.close();
	}

}
