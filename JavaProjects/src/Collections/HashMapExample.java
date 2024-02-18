package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Student1{
	String Name;
	String Dname;
	char Section;
}

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, Student1> hashMap1 = new HashMap<Integer, Student1>();
		
		hashMap.put(24, "Navee");
		hashMap.put(23, "Jasir");
		hashMap.put(25, "Padma");
		hashMap.put(10, "John");
		Student1 obj = new Student1();
		hashMap1.put(24, obj);
		
		System.out.println("\n"+hashMap);
		
		System.out.println("\nStudents name whose roll no is 10: " + hashMap.get(10));
		
		System.out.println("\nPrinting using entrySEt: " + hashMap.entrySet());
		System.out.println("\nPrinting using keySEt: " + hashMap.keySet());

		
		for (Map.Entry<Integer, String> student : hashMap.entrySet()) {
			
			System.out.println("\n"+student.getKey() + ": " + student.getValue());
		}
		System.out.println("\n"+hashMap1);
		
		System.out.println("\nStudents name whose roll no is 10: "+ hashMap1.get(10));
		
		for (Entry<Integer, Student1> student2 : hashMap1.entrySet()) {
			
			System.out.println("\n"+student2.getKey() + ": " + student2.getValue());
		}
	} 

}
