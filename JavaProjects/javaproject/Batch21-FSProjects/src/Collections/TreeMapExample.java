package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> studentData = new TreeMap<Integer, String>();		
		System.out.println("Program using TreeHashMap");
		studentData.put(21, "Priya");
		studentData.put(1, "Arun");
		studentData.put(10, "Haripriya");
		studentData.put(18, "Pranesh");
		studentData.put(30, "Vikram");
		
		System.out.println(studentData);
		System.out.println("Student name whose roll no is 10: " + studentData.get(10));
		
		System.out.println("Printing using entrySet: " + studentData.entrySet());
		System.out.println("Printing using keySet: " + studentData.keySet());

		System.out.println("Printing TreehashMap using enhanced for: \n" + studentData.keySet());
		for (Map.Entry<Integer, String> student : studentData.entrySet()) {
			System.out.println(student.getKey() + ": " + student.getValue());
		}
	}

}
