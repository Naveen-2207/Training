package JumpStatements;

import java.util.Scanner;

public class ReturnStatements {

	public static void main(String[] args) {
		System.out.println("Enter the Age: ");
		Scanner nav = new Scanner(System.in);
		int age = nav.nextInt();
		nav.close();
		if(age<=0) {
			System.err.println("Enter a valid age");
			return;
		}
		if(age<18) {
			System.err.println("You are not eligible for voting");
		}
		else {
			System.out.println("You are eligible for voting");
		}

	}

}
