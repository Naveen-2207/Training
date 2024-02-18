package SelectionStatements;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		char a =obj.next().charAt(0);
		int n = obj.nextInt();
		if(n==5+5) {
			System.out.println("Is Valid");
		}
		if(a=='N') {
			System.out.println("Welcome Sir");
		}
		else {
			System.out.println("Nothing");
		}
		obj.close();
	}
}
