package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> thashMap = new TreeMap<Integer, String>();

		thashMap.put(24, "Navee");
		thashMap.put(23, "Jasir");
		thashMap.put(25, "Padma");
		thashMap.put(10, "John");

		System.out.println("\n" + thashMap);

		System.out.println("\nStudents name whose roll no is 10: " + thashMap.get(10));

		System.out.println("\nPrinting using entrySEt: \n\n" + thashMap.entrySet());
		
		System.out.println("\nPrinting using keySEt: \n\n" + thashMap.keySet());

		for (Map.Entry<Integer, String> student : thashMap.entrySet()) {

			System.out.println("\n" + student.getKey() + ": " + student.getValue());
		}
	}

}
