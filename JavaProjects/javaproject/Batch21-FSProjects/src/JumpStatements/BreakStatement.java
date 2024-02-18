package JumpStatements;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = in.nextInt(); //15
		int i = 1;   //2, 3, 4, 5, 6, 7
		while (true) {
			System.out.println(i);
			if (i==num/2) {    //7
				break;
			}
			i++;
		}
		System.out.println(i);
		in.close();
	}

}
