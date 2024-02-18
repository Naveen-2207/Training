package PracticeProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4,div");
		System.out.println("5.mod");
		System.out.println("choose option 1 to 5:");
		int opt = obj.nextInt();	
		System.out.println("1st num:");		
		int a = obj.nextInt();
		System.out.println("2st num:");		
		int b = obj.nextInt();
		int sum;
		switch(opt){
			case 1:
				System.out.println("Add:");
				sum=a+b;
				System.out.println(sum);
				break;
			case 2:
				System.out.println("Sub:");
				sum=a-b;
				System.out.println(sum);
				break;
			case 3:
				System.out.println("Mul:");
				sum=a*b;
				System.out.println(sum);
				break;
			case 4:
				System.out.println("Div:");
				sum=a/b;
				System.out.println(sum);
				break;
			case 5:
				System.out.println("Mod:");
				sum=a%b;
				System.out.println(sum);
				break;
			default:
				System.err.println("chose correct option");
				break;
		}
			
		obj.close();

	}

}
