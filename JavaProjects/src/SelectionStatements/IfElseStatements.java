package SelectionStatements;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int age = obj.nextInt();
		if(a==b) {
			System.out.println("is equal");
		}
		if(age>=18) {
			System.out.println("is Eligible");
		}
		else {
			System.out.println("is not Eligible");
		}
		String value=(age>=18)?"eligible":"not eligible";
		System.out.println((age>=18)?"eligible":"not eligible");
		System.out.println(value);
		obj.close();
	}

}
