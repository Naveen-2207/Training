package JdbcApplication;

import java.util.Scanner;

public class StudentManagementSystem {
	private static void printMenu() {
		System.out.println("\n1. Student Creation");
		System.out.println("2. Remove a Student");
		System.out.println("3. Ubdate a Student");
		System.out.println("4. Display all Student Data");
		System.out.println("5. Search a Student");
		System.out.println("6. Exit Application");
		System.out.print("\nEnter a Choice: ");
	}

	public static void main(String[] args) {
		System.out.println("\t\t\tStudent Management System");
		Scanner nav = new Scanner(System.in);
		while (true) {
			printMenu();
			int choice = nav.nextInt();
			switch (choice) {
			case 1:
				Student.toCreateStudent();
				break;
			case 2:
				Student.toRemoveStudent();
				break;
			case 3:
				Student.toUpdateStudent();
				break;
			case 4:
				Student.toDisplayStudentDatabase();
				break;
			case 5:
				Student.toSearchStudent();
				break;
			case 6:
				System.out.println("\nApplication Exited");
				nav.close();
				return;
			default:
				System.err.println("\nEnter a Valid Choice");
				break;
			}

		}

	}

}
