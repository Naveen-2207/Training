package SelectionStatements;

import java.util.Scanner;

public class SwitchCaseStatements {
	public static void main(String[] args) {
//		get two number inputs from the user
//
//		ask for choice from the user
//		1. Add
//		2. Subtract
//		3. Multiply
//		4. Divide
//		5. Modulo
//
//		If the choice is 1
//		perform the addition of two number
//
//		If the choice is 2
//		perform the subtraction of two number
//
//		If the choice is 3
//		perform the multiplication of two number
//
//		If the choice is 4
//		perform the division of two number
//
//		If the choice is 5
//		perform the modulo of two number
//
//		else say the user as "Invalid choice"
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");

		int choice = obj.nextInt();
		
		switch (choice) {
		case 1: 
			System.out.println("Addition of two number: " + (num1 + num2) );
			break;
		case 2:
			System.out.println("Subtraction of two number: " + (num1 - num2) );
			break;
		case 3:
			System.out.println("Multiplication of two number: " + (num1 * num2) );
			break;
		case 4:
			System.out.println("Division of two number: " + (num1 / num2) );
			break;	
		case 5:
			System.out.println("Modulus of two number: " + (num1 % num2) );
			break;
		default:
			System.out.println("Choice is invalid");
		}
		
		obj.close();		
	}
}
