package CollectionsCREDApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//CRUD - Create, Remove, Update, Display
//Search functionality
//ArrayList And HashMap

class Student {
	int studid;
	String studName;
	String studDept;
	char studGrade;
	long studMobileNumber;

	static HashMap<Integer, Student> studentDatabase = new HashMap<Integer, Student>();

	static int studcount = 1;

	public static void toCreateStudent() {
		System.out.println("\nCreating a New Student");
		Scanner a = new Scanner(System.in);
		Student obj = new Student();
		obj.studid = studcount;
		System.out.println("\nStudent Id: " + obj.studid);

		System.out.print("\nStudent Name: ");
		obj.studName = a.next();

		System.out.print("\nStudent Department: ");
		obj.studDept = a.next();

		System.out.print("\nStudent Grade: ");
		obj.studGrade = a.next().charAt(0);

		System.out.println("\nStudent Mobile Number: ");
		obj.studMobileNumber = a.nextLong();
		studentDatabase.put(obj.studid, obj);
		studcount++;
		System.out.println("Student Creation Sucessfully!!!\n");
	}

	public static void toRemoveStudent() {
		System.out.println("\nRemoving a Student");
		Scanner a = new Scanner(System.in);

		System.out.println("\nEnter an S.Id to be Removed: ");
		int id = a.nextInt();

		if (studentDatabase.containsKey(id)) {
			studentDatabase.remove(id);
			System.out.println("\nStudent with " + id + " is Removed Successfully!!!");
		} else {
			System.err.println("\nStudent with " + id + " does not exist!!!");
		}
	}

	public static void toUpdateStudent() {
		System.out.println("\nUpdating a Student");
		Scanner a = new Scanner(System.in);

		System.out.println("Enter an S.Id to be Ubdated: ");
		int id = a.nextInt();

		if (studentDatabase.containsKey(id)) {
			System.out.println("\n1. Ubdate Name");
			System.out.println("2. Ubdate Department");
			System.out.println("3. Ubdate Grade");
			System.out.println("4. Update Mobile Number");
			System.out.print("\nEnter a Choice: ");
			int choice = a.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Ubdated name: ");
				studentDatabase.get(id).studName = a.next();
				System.out.println("Student Name is Ubdated sucessfully!!!!");
				break;
			case 2:
				System.out.println("Enter Ubdated Department: ");
				studentDatabase.get(id).studDept = a.next();
				System.out.println("Student Department is Ubdated sucessfully!!!!");
				break;
			case 3:
				System.out.println("Enter Ubdated Grade: ");
				studentDatabase.get(id).studGrade = a.next().charAt(0);
				System.out.println("Student Grade is Ubdated sucessfully!!!!");
				break;
			case 4:
				System.out.println("Enter Ubdated Mobile Number: ");
				studentDatabase.get(id).studMobileNumber = a.nextLong();
				System.out.println("Student Mobilr Number is Ubdated sucessfully!!!!");
				break;

			default:
				System.err.println("Enter a Valid choise!!!");
				break;
			}
		} else {
			System.err.println("\nStudent with " + id + " does not exist!!!");
		}

	}

	public static void toDisplayStudentDatabase() {
		System.out.println("\nDisplaying Student Database");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("S.Id \t\t S.Name \t S.Department \t S.Grade \t S.M.Number");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		for (Map.Entry<Integer, Student> StudentEntry : studentDatabase.entrySet()) {
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

		if (studentDatabase.containsKey(id)) {
			Student stobj = studentDatabase.get(id);
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
}

public class StudentDatabaseManagement {

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
