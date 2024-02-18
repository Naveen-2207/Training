package SelectionStatements;

import java.util.Scanner;

public class IfElseLadderStatements {

	public static void main(String[] args) {
		// input from user [0-100]
		// 90 -100  -> grade A
		// 80 - 89 -> grade B
		// 70 - 79 -> grade C
		// 60 - 69 -> grade D
		// 50 - 59 -> grade E
		// < 50  -> Fail
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a mark: ");
		int mark = obj.nextInt();
		
		if (mark>=0 && mark<=100) {
			if (mark>=90 && mark<=100) {
				System.out.println("Grade A");
			}
			else if (mark>=80 && mark<=89) {
				System.out.println("Grade B");
			}else if (mark>=70 && mark<=79) {
				System.out.println("Grade C");
			}else if (mark>=60 && mark<=69) {
				System.out.println("Grade D");
			}else if (mark>=50 && mark<=59) {
				System.out.println("Grade E");
			}else {
				System.out.println("Fail");
			}
		}else {
			System.err.println("Enter a valid mark");
		}
		
		obj.close();
		
		
	}

}
