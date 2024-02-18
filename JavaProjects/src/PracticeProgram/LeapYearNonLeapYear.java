package PracticeProgram;

import java.util.Scanner;

public class LeapYearNonLeapYear {

	public static void main(String[] args) {
		System.out.print("Enter the year: ");
		Scanner nav = new Scanner(System.in);
		int a = nav.nextInt();
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("This is Leap Year");
		} else {
			System.out.println("This is Not a Leap Year");
		}
		nav.close();

	}

}
