package Strings;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// String - Immutable
		// String buffer - Mutable
		
		System.out.println("String Builder Methods");
		// when amount of string manipulation is more StringBuilder can be used
		StringBuilder stringBuilderObj = new StringBuilder("Hello World");
		
		System.out.println("Printing string: " + stringBuilderObj);
        
		// append() method is used to add characters or other data to the end of the current StringBuilder.
		stringBuilderObj.append("Good Morning");
		System.out.println("\nAppend method: " + stringBuilderObj);

		// insert() method is used to insert characters or other data
		//into a StringBuilder at a specified index position. 
		stringBuilderObj.insert(6, "Java ");
        System.out.println("\nInsert Method: " +stringBuilderObj);

        // replace() method in the StringBuilder class is used to replace a portion of characters 
        //within the StringBuilder with a new sequence of characters.
        stringBuilderObj.replace(6, 11, "Java");
        System.out.println("\nReplace Method: " +stringBuilderObj);

        // delete() method is used to remove a sequence of characters from the StringBuilder.
        // Delete characters from index 6 to index 10
        stringBuilderObj.delete(6, 11);
        System.out.println("\nDelete Method: " +stringBuilderObj);
        
        // charAt() method is used to return the char in the specified index of the StringBuilder object
        System.out.println("\nCharAt Method: " + stringBuilderObj.charAt(3));

        // length() method is used to return the length of the StringBuilder object
        System.out.println("\nlength Method: " +stringBuilderObj.length());

        // to extract a substring starting from index 6 (inclusive) to the end of the original StringBuilder.
        System.out.println("\nSubstring method: " + stringBuilderObj.substring(6));
        System.out.println("\nSubstring method: " + stringBuilderObj.substring(0, 5));
        
        // used to reverse the StringBuilder object
        System.out.println("\nReverse method: " + stringBuilderObj.reverse());
        
        //indexOf method is used to return the index of the string/ character
        System.out.println("\nIndexOf method: " + stringBuilderObj.indexOf("Hello"));

        StringBuilder stringBuilderObj1 = new StringBuilder();
        
        // used to retrieve the current capacity of a StringBuilder Object.
        // method returns an integer value representing the current capacity of the StringBuilder.
        System.out.println("\nCapacity Method: " +stringBuilderObj1.capacity());
        stringBuilderObj1.append("Hello Everyone Good Morning");
        System.out.println("\nCapacity Method: " +stringBuilderObj1.capacity());
        stringBuilderObj1.trimToSize();
        System.out.println("\nCapacity Method: " +stringBuilderObj1.capacity());
        
	}

}
