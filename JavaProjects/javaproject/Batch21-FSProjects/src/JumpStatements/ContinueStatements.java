package JumpStatements;

import java.util.Scanner;

public class ContinueStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println("continued");
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Program completed");
		in.close();
	}

}
