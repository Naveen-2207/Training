package SelectionStatements;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		if(age>0) {
			if(age>=18) {
				System.out.println("Eligible");
			}
			System.out.println("check valid age");
		}
		obj.close();
	}

}
