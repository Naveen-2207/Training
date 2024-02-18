package JumpStatements;

import java.util.Scanner;

public class ContinueStatements {

	public static void main(String[] args) {
		System.out.println("Enter the num: ");
		Scanner nav= new Scanner(System.in);
		int a = nav.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println("Naveen");
				continue;
			}
			System.out.println(i);
		}
		nav.close();
	}

}
