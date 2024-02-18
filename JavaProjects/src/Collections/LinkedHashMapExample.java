package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
	Map<Integer, String> lhashMap = new LinkedHashMap<Integer, String>();
		
		lhashMap.put(24, "Navee");
		lhashMap.put(23, "Jasir");
		lhashMap.put(25, "Padma");
		lhashMap.put(10, "John");
		
		
		System.out.println("\n"+lhashMap);
		
		System.out.println("\nStudents name whose roll no is 10: " + lhashMap.get(10));
		
		System.out.println("\nPrinting using entrySEt: " + lhashMap.entrySet());
		
		System.out.println("\nPrinting using keySEt: " + lhashMap.keySet());

		
		for (Map.Entry<Integer, String> student : lhashMap.entrySet()) {
			
			System.out.println("\n"+student.getKey() + ": " + student.getValue());
		}
		

	}

}
