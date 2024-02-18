package JumpStatements;

import java.util.Scanner;

public class ReturnStatementUsingMethod {
	
	public static boolean isDivisibleByThree(int num) {
		if (num % 3 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a num: ");
		int num = in.nextInt();
		
		in.close();
				
		System.out.println(isDivisibleByThree(num));
		
		System.out.println("Program completed");

	}

}
