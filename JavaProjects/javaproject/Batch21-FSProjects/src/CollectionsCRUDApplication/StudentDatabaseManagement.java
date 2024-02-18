package CollectionsCRUDApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// CRUD - Create, Remove, Update, Display 
// Search functionality
// ArrayList and HashMap
class Student {
	int studId;
	String studName;
	String studDepartment;
	char studGrade;
	long studMobileNumber;

	static HashMap<Integer, Student> studentDatabase = new HashMap<Integer, Student>();

	static int studentIdCount = 1;

	public static void toCreateAStudent() {
		System.out.println("Creating a new Student");
		Student studentData = new Student();
		Scanner input = new Scanner(System.in);
		studentData.studId = studentIdCount; // to set student id
		System.out.println("Student Id: " + studentData.studId);

		System.out.println("Student Name: ");
		studentData.studName = input.next();

		System.out.println("Student Department: ");
		studentData.studDepartment = input.next();

		System.out.println("Student Grade: ");
		studentData.studGrade = input.next().charAt(0);

		System.out.println("Student Mobile Number: ");
		studentData.studMobileNumber = input.nextLong();

		studentDatabase.put(studentData.studId, studentData);
		studentIdCount++;
		System.out.println("Student creation successful!!!\n");
	}

	public static void toRemoveAStudent() {
		System.out.println("Removing a Student");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ID to be removed: ");
		int id = input.nextInt();

		if (studentDatabase.containsKey(id)) {
			studentDatabase.remove(id);
			System.out.println("Student with id " + id + " is removed successfully!!!");
		} else {
			System.err.println("Student with id " + id + " does not exist!!!");
		}
	}

	public static void toUpdateAStudent() {
		System.out.println("Updating a Student");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ID to be updated: ");
		int id = input.nextInt();

		if (studentDatabase.containsKey(id)) {
			System.out.println("1. Update Name");
			System.out.println("2. Update Department");
			System.out.println("3. Update Grade");
			System.out.println("4. Update Mobile Number");
			System.out.println("Enter a choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter updated name: ");
				studentDatabase.get(id).studName = input.next();
				System.out.println("Student name is updated successfully!!!");
				break;
			case 2:
				System.out.println("Enter updated department: ");
				studentDatabase.get(id).studDepartment = input.next();
				System.out.println("Student department is updated successfully!!!");
				break;
			case 3:
				System.out.println("Enter updated grade: ");
				studentDatabase.get(id).studGrade = input.next().charAt(0);
				System.out.println("Student grade is updated successfully!!!");
				break;
			case 4:
				System.out.println("Enter updated mobile number: ");
				studentDatabase.get(id).studMobileNumber = input.nextLong();
				System.out.println("Student mobile number is updated successfully!!!");
				break;
			default:
				System.err.println("Enter a valid choice!!!");
				break;
			}
		} else {
			System.err.println("Student with id " + id + " does not exist!!!");
		}
	}

	public static void toDisplayStudentDatabase() {
		System.out.println("Displaying all Students data");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("ID \t Name \t Department \t Grade \t Mobile Number");
		System.out.println("-------------------------------------------------------------------");
		for (Map.Entry<Integer, Student> studentEntry : studentDatabase.entrySet()) {
			System.out.print(studentEntry.getKey() + "\t");
			System.out.print(studentEntry.getValue().studName + "\t\t");
			System.out.print(studentEntry.getValue().studDepartment + "\t");
			System.out.print(studentEntry.getValue().studGrade + "\t");
			System.out.println(studentEntry.getValue().studMobileNumber);
			System.out.println("-------------------------------------------------------------------");
		}

	}

	public static void toSearchAStudent() {
		System.out.println("Searching a Student");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ID to be searched: ");
		int id = input.nextInt();

		if (studentDatabase.containsKey(id)) {
			Student studentObj = studentDatabase.get(id);
			System.out.println("Student ID            : " + studentObj.studId);
			System.out.println("Student Name          : " + studentObj.studName);
			System.out.println("Student Department    : " + studentObj.studDepartment);
			System.out.println("Student Grade         : " + studentObj.studGrade);
			System.out.println("Student Mobile Number : " + studentObj.studMobileNumber);
			System.out.println("Student data printed successfully!!!\n");
		} else {
			System.err.println("Student with id " + id + " does not exist!!!");
		}
	}
}

public class StudentDatabaseManagement {
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
				Student.toCreateAStudent();
				break;
			case 2:
				Student.toRemoveAStudent();
				break;
			case 3:
				Student.toUpdateAStudent();
				break;
			case 4:
				Student.toDisplayStudentDatabase();
				break;
			case 5:
				Student.toSearchAStudent();
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
