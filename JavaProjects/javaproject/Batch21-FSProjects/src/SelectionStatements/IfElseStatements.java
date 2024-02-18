package SelectionStatements;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}else {
			System.out.println(num2 + " is not equal " + num1);
		}
		
		System.out.println("Enter an age: ");
		int age = obj.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Not Eligible for voting");
		}
		
		String value = (age>=18)? "Eligible for voting": "Not Eligible for voting";
		
		System.out.println(value);
		
		System.out.println((age>=18)? "Eligible for voting": "Not Eligible for voting");
		
		
		obj.close();

	}

}
