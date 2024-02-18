package Operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void toAddTwoNumbers(int num1, int num2)
	{
		System.out.println("Sum of two number: " + (num1+num2));
	}
	
	public static void toSubractTwoNumber(int num1, int num2)
	{
		System.out.println("Difference of two number: " + (num1-num2));
	}
	
	public static void toMultiplyTwoNumber(int num1, int num2)
	{
		System.out.println("Product of two number: " + (num1*num2));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1 value: ");
		int num1 = input.nextInt();
		System.out.println("Enter num2 value: ");
		int num2 = input.nextInt();
		
		toAddTwoNumbers(num1, num2);
		toSubractTwoNumber(num1, num2);
		toMultiplyTwoNumber(num1, num2);
		toDivideTwoNumber(num1, num2);
		toModuloTwoNumber(num1, num2);
		
		input.close();

	}
	
	public static void toDivideTwoNumber(int num1, int num2)
	{
		System.out.println("Quotient of two number: " + (num1/num2));
	}
	
	public static void toModuloTwoNumber(int num1, int num2)
	{
		System.out.println("Remainder of two number: " + (num1%num2));
	}

}
