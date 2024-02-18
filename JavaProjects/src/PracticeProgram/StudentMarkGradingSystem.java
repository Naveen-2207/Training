package PracticeProgram;

import java.util.Scanner;

public class StudentMarkGradingSystem {
	public static void def(int a) {
		if (a <= 100 && a >= 90) {
			System.out.println("\nGrade:A");
		} else if (a < 90 && a >= 80) {
			System.out.println("\nGrade:B");
		} else if (a < 80 && a >= 70) {
			System.out.println("\nGrade:C");
		} else if (a < 70 && a >= 60) {
			System.out.println("\nGrade:E");
		} else if (a < 60 && a >= 0) {
			System.out.println("\nFail");
		} else {
			System.err.println("\nenter a correct mark");
		}
	}

	public static void main(String[] args) {
		System.out.println("STUDENTS MARK GRADING SYSTEM");
		Scanner nav = new Scanner(System.in);
		System.out.print("\nEnter your Mark: ");
		int a = nav.nextInt();
		def(a);
		nav.close();
	}
}
