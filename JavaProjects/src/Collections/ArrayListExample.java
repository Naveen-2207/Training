package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	int Roll No;
	String Name;
	String Deg;
	String Place;
}

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> nav = new ArrayList<Integer>();
		ArrayList<Integer> nav1 = new ArrayList<Integer>();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the ArrayList: ");
		int size = a.nextInt();
		System.out.println("Enter ArrayList Elements: ");
		for (int i = 0; i < size; i++) {
			nav.add(a.nextInt());
		}
		nav1 = (ArrayList<Integer>) nav.clone();
		System.out.println("Initial Array: " + nav);
		nav.remove(2);
		System.out.println("Remove method: " + nav);
		nav.add(3, 70);
		System.out.println("Add Method: " + nav);
		System.out.println("Remove method: " + nav.contains(20));
		System.out.println("Remove method: " + nav.indexOf(10));
		nav.clear();
		System.out.println("Remove method: " + nav);
		System.out.println("Arraylist copy of Array2: " + nav1);
		System.out.println("Iterating using for each");

		for (Integer integer : nav1) {
			System.out.println(integer + ", ");
		}
		System.out.println("Iterating using Iterator");
		Iterator<Integer> ListIterator = nav1.iterator();
		while (ListIterator.hasNext()) {
			System.out.println(ListIterator.next() + ", ");
		}
		ArrayList<Student> stud = new ArrayList<Student>();
		System.out.println("Enter tcount of Students Data: ");
		int count = a.nextInt();
		for (int i = 1; i < count; i++) {
			Student obj = new Student();
			System.out.println("Enter Student data " + i + ": ");
			obj.Roll = a.nextInt();
			obj.Name = a.nextLine();
			obj.Deg = a.nextLine();
			obj.Place = a.nextLine();
			stud.add(obj);
		}
		System.out.println("Printing students data");
		for (Student student : stud) {
			System.out.println(student.Roll + ": " + student.Name + ": " + student.Deg + ": " + student.Place + ": ");
		}

	}

}
