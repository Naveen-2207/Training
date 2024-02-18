package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student1{
	int roll;
	String name;
}
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Enter array list size: ");
		int size = scannerObj.nextInt();
		
		System.out.println("Enter array list elements: ");
		for (int i = 0; i < size; i++) {
			arrayList.add(scannerObj.nextInt());
		}
		
//		arrayList1 = arrayList;
		
		arrayList1 = (ArrayList<Integer>) arrayList.clone();
		System.out.println("Initial Array: " + arrayList);
		
		arrayList.remove(2);
		System.out.println("Remove method: " +arrayList);

		System.out.println("Contains method: " + arrayList.contains(20));
		
		arrayList.add(3, 70);
		System.out.println("Add method specifying index: " + arrayList);
		
		System.out.println("Index of " + arrayList.indexOf(10));
		
		arrayList.clear();
		System.out.println("Clear method: " + arrayList);
		
		System.out.println("Arraylist1 [copy of arrayList] :" +arrayList1);
		
		System.out.println("Iterating using For each");
		for (Integer obj : arrayList1) {
			System.out.print(obj + ", ");
		}
		
		System.out.println("Iterating using Iterator");
		Iterator<Integer> listIterator = arrayList1.iterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + ", ");
		}
		
		ArrayList<Student1> studentData = new ArrayList<>();
		
		System.out.println("Enter count of students Data: ");
		int count = scannerObj.nextInt();
		for (int i = 0; i < count; i++) {
			Student1 obj = new Student1();
			System.out.println("Enter student data " + i + ": ");
			obj.roll = scannerObj.nextInt();
			obj.name = scannerObj.nextLine();
			studentData.add(obj);
		}
		
		System.out.println("Printing students data");
		for (Student1 student : studentData) {
			System.out.println(student.roll + ": " + student.name);
		}
		scannerObj.close();
	}
}















