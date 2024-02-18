package Strings;

public class StringsMethods {
	static int a = 10;

	public static void main(String[] args) {

		System.out.println(a);
		StringBuffer st = new StringBuffer("Naveen");
		System.out.println("StringBuffer Methods-->");
		System.out.println(st);

		st.append("Kutty");
		System.out.println("Append String: " + st);

		st.insert(1, "Kutty");
		System.out.println("Insert String: " + st);


		st.replace(1, 4, "kutty");
		System.out.println("Replace String: " + st);

		st.reverse();
		System.out.println("Reverse of String: " + st);
		
		st.append("StringBuffer Methods");
		
		st.delete(1, 30);
		System.out.println("Delete String: " + st);
		
		System.out.println("String Capacity: " + st.capacity());
		System.out.println("String Substring: " + st.substring(6));
		System.out.println("Index of String: "+st);
		

	} 

}
