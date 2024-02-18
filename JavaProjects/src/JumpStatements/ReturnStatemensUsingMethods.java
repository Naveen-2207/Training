package JumpStatements;

import java.util.Scanner;

public class ReturnStatemensUsingMethods {
	public static boolean isdiv(int a) {
		if(a%3==0) {
			return true;	
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner nav = new Scanner(System.in);
		int a = nav.nextInt();
//		System.out.println(isdiv(a));
		boolean data=((a%3==0)? true: false);
		System.out.println(data);
		nav.close();
	}

}
