package Strings;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Using Literals
		
		
		String s1 = "Hello";       // SCP -> String Constant Pool
		// 2. Using new keyword
		String s2 = new String("Hello");  // Heap Memory
		
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.compareTo(s2));  // 0
		
		String string1 = "Sam";
		String string2 = "Sam";
		System.out.println(string1.compareTo(string2));  // 0
		
		string2 = "Zim";
		System.out.println(string1.compareTo(string2));  // negative string1 < string2
		
		string2 = "Ey";
		System.out.println(string1.compareTo(string2));  // positive string1 > string2
		
		string2 = "Ram";
		System.out.println(string1.compareTo(string2));  // positive
		
		string2 = "Zam";
		System.out.println(string1.compareTo(string2));  // negative

	}

}
