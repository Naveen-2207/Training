package JumpStatements;

import java.util.Scanner;

public class ReturnStatement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a age: ");
		int age = in.nextInt();
		
		in.close();
		
		if (age<=0) {
			System.err.println("Enter a valid age");
			return;
		}
		
		System.out.println("Helllo");
		
		if (age<18) {
			System.err.println("You are not eligible for voting");
		} else {
			System.out.println("You are eligible for voting");
		}

	}

}
