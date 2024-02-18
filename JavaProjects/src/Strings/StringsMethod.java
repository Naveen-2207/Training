package Strings;

public class StringsMethod {

	public static void main(String[] args) {
		StringBuilder ss=new StringBuilder("Navee");
		System.out.println("StringBuilder Methods-->");
		System.out.println(ss);
		
		ss.append("Navee");
		System.out.println("Append String: "+ss);
		
		ss.insert(1, "Kutty");
		System.out.println("Insert String: "+ss);
		
		
		ss.delete(1, 5);
		System.out.println("Delete String: "+ss);
		
		
		ss.replace(1, 4, "kutty");
		System.out.println("Replace String: "+ss);
		
		
		ss.reverse();
		System.out.println("Reverse String: "+ss);
		
		System.out.println("Capacity of String: "+ss.capacity()); 
		

	}

}
