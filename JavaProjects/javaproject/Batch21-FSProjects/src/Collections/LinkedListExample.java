package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedlistBoys = new LinkedList<String>();
		linkedlistBoys.add("Gowtham");
		linkedlistBoys.add("Arun");
		linkedlistBoys.add("Siva");
		
		System.out.println("Boys list: " + linkedlistBoys);
		
		LinkedList<String> linkedlistGirls = new LinkedList<String>();
		linkedlistGirls.add("Haripriya");
		linkedlistGirls.add("Umavathi");
		linkedlistGirls.add("Jenitha");
		
		System.out.println("Girls list: " + linkedlistGirls);
		
		LinkedList<String> linkedlistStudents = new LinkedList<String>();
		
		linkedlistStudents.addAll(linkedlistBoys);
		linkedlistStudents.addAll(linkedlistGirls);
		
		System.out.println("Students list: " + linkedlistStudents);
		
		linkedlistStudents.removeLast();
		System.out.println("Remove last: " + linkedlistStudents);
		
		linkedlistStudents.removeFirst();
		System.out.println("Remove first: " + linkedlistStudents);

	}

}
