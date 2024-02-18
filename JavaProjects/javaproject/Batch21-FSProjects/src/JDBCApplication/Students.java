package JDBCApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Students {
	int studId;
	String studName;
	String studDepartment;
	char studGrade;
	long studMobileNumber;

	public static void toCreateAStudent() {
		System.out.println("Creating a new Student");
		Students studentData = new Students();
		Scanner input = new Scanner(System.in);

		System.out.println("Student Name: ");
		studentData.studName = input.next();

		System.out.println("Student Department: ");
		studentData.studDepartment = input.next();

		System.out.println("Student Grade: ");
		studentData.studGrade = input.next().charAt(0);

		System.out.println("Student Mobile Number: ");
		studentData.studMobileNumber = input.nextLong();

		DbOperations.toAddStudent(studentData);
	}

	public static void toRemoveAStudent() {
		System.out.println("Removing a Student");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ID to be removed: ");
		int id = input.nextInt();

		if (DbOperations.studentExists(id)) {
			DbOperations.toRemoveStudent(id);
		} else {
			System.err.println("Student with id " + id + " does not exist!!!");
		}
	}

	public static void toUpdateAStudent() {
		System.out.println("Updating a Student");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ID to be updated: ");
		int id = input.nextInt();

		if (DbOperations.studentExists(id)) {
			System.out.println("1. Update Name");
			System.out.println("2. Update Department");
			System.out.println("3. Update Grade");
			System.out.println("4. Update Mobile Number");
			System.out.println("Enter a choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter updated name: ");
				DbOperations.toUpdateName(id, input.next());
				break;
			case 2:
				System.out.println("Enter updated department: ");
				DbOperations.toUpdateDepartment(id, input.next());
				break;
			case 3:
				System.out.println("Enter updated grade: ");
				DbOperations.toUpdateGrade(id, input.next().charAt(0));
				break;
			case 4:
				System.out.println("Enter updated mobile number: ");
				DbOperations.toUpdateMobileNumber(id, input.nextLong());
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
		HashMap<Integer, Students> studentDB = DbOperations.toGetAllStudentData();
		System.out.println("Displaying all Students data");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("ID \t Name \t Department \t Grade \t Mobile Number");
		System.out.println("-------------------------------------------------------------------");
		for (Map.Entry<Integer, Students> studentEntry : studentDB.entrySet()) {
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

		if (DbOperations.studentExists(id)) {
			Students studentObj = DbOperations.toSearchStudent(id);
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
