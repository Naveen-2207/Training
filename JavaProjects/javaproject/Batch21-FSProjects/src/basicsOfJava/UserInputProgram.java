package basicsOfJava;

import java.util.Scanner;

public class UserInputProgram {
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = inputObj.nextInt();
		System.out.println("Hello World: " + n);
		inputObj.close();
	}
}
