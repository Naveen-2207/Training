package JDBCApplication;

import java.util.Scanner;

public class StudentManagementSystem {

	private static void printMenu() {
		System.out.println("\n1. Student Creation");
		System.out.println("2. Remove a Student");
		System.out.println("3. Update a Student");
		System.out.println("4. Display all Student Data");
		System.out.println("5. Search a Student");
		System.out.println("6. Exit Application");
		System.out.println("Enter a choice: ");
	}

	public static void main(String[] args) {

		System.out.println("\t\t\t\tStudent Management System\n");

		while (true) {
			Scanner input = new Scanner(System.in);
			printMenu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				Students.toCreateAStudent();
				break;
			case 2:
				Students.toRemoveAStudent();
				break;
			case 3:
				Students.toUpdateAStudent();
				break;
			case 4:
				Students.toDisplayStudentDatabase();
				break;
			case 5:
				Students.toSearchAStudent();
				break;
			case 6:
				System.out.println("Application Exited!!!");
				input.close();
				return;
			default:
				System.err.println("Enter a valid choice: ");
				break;
			}
		}
	}
}