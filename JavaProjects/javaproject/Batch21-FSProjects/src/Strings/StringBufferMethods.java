package Strings;

public class StringBufferMethods {

	public static void main(String[] args) {
		// String - Immutable
		// String buffer - Mutable
		
		System.out.println("String Buffer Methods");
		// when amount of string manipulation is more StringBuffer can be used
		StringBuffer stringBufferObj = new StringBuffer("Hello World");
		
		System.out.println("Printing string: " + stringBufferObj);
        
		// append() method is used to add characters or other data to the 
		//end of the current string buffer.
		stringBufferObj.append("Good Morning");
		System.out.println("\nAppend method: " + stringBufferObj);

		// insert() method is used to insert characters or other data
		//into a StringBuffer at a specified index position. 
		stringBufferObj.insert(6, "Java ");
        System.out.println("\nInsert Method: " +stringBufferObj);

        // replace() method in the StringBuffer class is used to replace 
        //a portion of characters 
        //within the StringBuffer with a new sequence of characters.
        stringBufferObj.replace(6, 11, "Today");
        System.out.println("\nReplace Method: " +stringBufferObj);

        // delete() method is used to remove a sequence of characters from 
        //the StringBuffer.
        // Delete characters from index 6 to index 10
        stringBufferObj.delete(6, 11);
        System.out.println("\nDelete Method: " +stringBufferObj);
        
        // charAt() method is used to return the char in the specified index of the string buffer object
        System.out.println("\nCharAt Method: " + stringBufferObj.charAt(3));

        // length() method is used to return the length of the string buffer object
        System.out.println("\nlength Method: " +stringBufferObj.length());

        // to extract a substring starting from index 6 (inclusive) to the end of the original StringBuffer.
        System.out.println("\nSubstring method: " + stringBufferObj.substring(6));
        System.out.println("\nSubstring method: " + stringBufferObj.substring(0, 5));

        // used to reverse the string buffer object
        System.out.println("\nReverse method: " + stringBufferObj.reverse());

        StringBuffer stringBufferObj1 = new StringBuffer();
        
        // used to retrieve the current capacity of a StringBuffer Object.
        // method returns an integer value representing the current capacity of the StringBuffer.
        // capacity = [initial capacity + 1] *2
        System.out.println("\nCapacity Method: " +stringBufferObj1.capacity());
        stringBufferObj1.append("Hello Everyone Good Morning");
        System.out.println("\nCapacity Method: " +stringBufferObj1.capacity());

	}

}
