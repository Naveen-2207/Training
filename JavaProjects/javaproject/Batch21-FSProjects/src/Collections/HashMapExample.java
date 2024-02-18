package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> studentData = new HashMap<Integer, String>();		
		System.out.println("Program using HashMap");
		studentData.put(21, "Priya");
		studentData.put(1, "Arun");
		studentData.put(10, "Haripriya");
		studentData.put(18, "Pranesh");
		studentData.put(30, "Vikram");
		
		System.out.println(studentData);
		System.out.println("Student name whose roll no is 10: " + studentData.get(10));
		
		System.out.println("Printing using entrySet: " + studentData.entrySet());
		System.out.println("Printing using keySet: " + studentData.keySet());

		System.out.println("Printing hashMap using enhanced for: \n" + studentData.keySet());
		for (Map.Entry<Integer, String> student : studentData.entrySet()) {
			System.out.println(student.getKey() + ": " + student.getValue());
		}
	}

}
