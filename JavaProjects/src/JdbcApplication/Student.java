package JdbcApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	int studid;
	String studName;
	String studDept;
	char studGrade;
	long studMobileNumber;

	public static void toCreateStudent() {
		System.out.println("\nCreating a New Student");
		Scanner a = new Scanner(System.in);
		Student obj = new Student();

		System.out.print("\nStudent Name: ");
		obj.studName = a.next();

		System.out.print("\nStudent Department: ");
		obj.studDept = a.next();

		System.out.print("\nStudent Grade: ");
		obj.studGrade = a.next().charAt(0);

		System.out.println("\nStudent Mobile Number: ");
		obj.studMobileNumber = a.nextLong();
		DbOperation.toAddStudent(obj);
	}

	public static void toRemoveStudent() {
		System.out.println("\nRemoving a Student");
		Scanner a = new Scanner(System.in);

		System.out.println("\nEnter an S.Id to be Removed: ");
		int id = a.nextInt();

		if (DbOperation.studentExists(id)) {
			DbOperation.toRemoveStudent(id);
		} else {
			System.err.println("\nStudent with " + id + " does not exist!!!");
		}
	}

	public static void toUpdateStudent() {
		System.out.println("\nUpdating a Student");
		Scanner a = new Scanner(System.in);

		System.out.print("\nEnter an S.Id to be Ubdated: ");
		int id = a.nextInt();

		if (DbOperation.studentExists(id)) {
			System.out.println("\n1. Ubdate Name");
			System.out.println("2. Ubdate Department");
			System.out.println("3. Ubdate Grade");
			System.out.println("4. Update Mobile Number");
			System.out.print("\nEnter a Choice: ");
			int choice = a.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\nEnter Ubdated name: ");
				DbOperation.toUpdateName(id, a.next());
				break;
			case 2:
				System.out.println("\nEnter Ubdated Department: ");
				DbOperation.toUpdateDept(id, a.next());
				break;
			case 3:
				System.out.println("\nEnter Ubdated Grade: ");
				DbOperation.toUpdateGrade(id, a.next().charAt(0));
				break;
			case 4:
				System.out.println("\nEnter Ubdated Mobile Number: ");
				DbOperation.toUpdateMobileNumber(id, a.nextLong());
				break;
			default:
				System.err.println("\nEnter a Valid choise!!!");
				break;
			}
		} else {
			System.err.println("\nStudent with " + id + " does not exist!!!");
		}

	}

	public static void toDisplayStudentDatabase() {
		HashMap<Integer, Student> studentDb = DbOperation.toGetAllStudentData();
		System.out.println("\nDisplaying Student Database");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("S.Id \t\t S.Name \t S.Department \t S.Grade \t S.M.Number");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		for (Map.Entry<Integer, Student> StudentEntry : studentDb.entrySet()) {
			System.out.println(StudentEntry.getKey() + "\t\t " + StudentEntry.getValue().studName + "\t\t "
					+ StudentEntry.getValue().studDept + "\t\t " + StudentEntry.getValue().studGrade + "\t\t "
					+ StudentEntry.getValue().studMobileNumber);
			System.out.println(
					"---------------------------------------------------------------------------------------------");

		}
	}

	public static void toSearchStudent() {
		System.out.println("\nSearch a Student.....");
		Scanner a = new Scanner(System.in);

		System.out.println("Enter an S.Id to be Searched: ");
		int id = a.nextInt();

		if (DbOperation.studentExists(id)) {
			Student stobj = DbOperation.toSearchStudent(id);
			System.out.println("Student Id             : " + stobj.studid);
			System.out.println("Student Name           : " + stobj.studName);
			System.out.println("Student Department     : " + stobj.studDept);
			System.out.println("Student Grade          : " + stobj.studGrade);
			System.out.println("Student Mobile Number  : " + stobj.studMobileNumber);
			System.out.println("Student Data Printed Sucessfully");
		} else {
			System.err.println("\nStudent with " + id + " does not exist!!!");
		}
	}

	public static void main(String[] args) {

	}

}
