package SelectionStatements;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		int n=10;
		Scanner input = new Scanner(System.in);
		
		char ch1 = input.next().charAt(0);
		
		if (n == 5+5)
			System.out.println("Is equal");		
		if (n>5) {
			System.out.println("Is greater");
		}
		
		if (ch1 == 'A') {
			System.out.println("ch value is equal");		
		}
		
		input.close();
	}

}
