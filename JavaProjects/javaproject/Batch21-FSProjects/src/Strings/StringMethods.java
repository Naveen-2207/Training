package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println("String Methods\n");

		String string1 = "Hello Everyone";

		String string2 = "Good morning";

		// returns the char value at the 3th index
		System.out.println("chatAt method: " + string1.charAt(3));

		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		// 0 because both are equal
		System.out.println("\ncompare To method" + s1.compareTo(s2));
		// -5 because "h" is 5 times lower than "m"
		System.out.println("compare To method" + s1.compareTo(s3));
		// -1 because "l" is 1 times lower than "m"
		System.out.println("compare To method" + s1.compareTo(s4));
		// 2 because "h" is 2 times greater than "f"
		System.out.println("compare To method" + s1.compareTo(s5));

		// return the ASCII value of the char at that index
		System.out.println("\ncode point At: " + string1.codePointAt(2));
		// return the ASCII value of the char at that before index
		System.out.println("code point before: " + string1.codePointBefore(2));
		// return the count of characters in between the from index and two index
		System.out.println("code point count: " + string1.codePointCount(2, 10));

		// The string1 does not get changed, even though it is invoking the method
		// concat(), as it is immutable. Therefore, the explicit assignment is required
		// here.
		System.out.println("\nconcat method: " + string1.concat(string2));

		// searches the sequence of characters in this string1.
		// returns true if the sequence of char values is found in this string otherwise
		// returns false.
		System.out.println("\ncontains method: " + string1.contains("ver"));
		System.out.println("contains method: " + string1.contains("vr"));

		// It checks if the content of the StringBuffer or StringBuilder object is equal
		// to the content of the specified CharSequence.
		// If the content is equal, it returns true; otherwise, it returns false.
		System.out.println("\ncontent equals: " + string1.contentEquals(string2));

		char[] arr = { 'H', 'E', 'L', 'L', 'O' };
		// The copyValueOf() method takes a char array (data) as its parameter
		// returns a new String that contains the characters of the specified array.
		String string4 = String.copyValueOf(arr);
		System.out.println("\ncopy value of: " + string4);

		string4 = String.copyValueOf(arr, 1, 3);
		System.out.println("copy value of using offset and count: " + string4);

		// method checks if this string ends with a given suffix.
		// It returns true if this string ends with the given suffix; else returns
		// false.
		System.out.println("\nends with method: " + string1.endsWith("one"));
		System.out.println("ends with method: " + string1.endsWith("oe"));

		String st1 = "java";
		String st2 = "java";
		String st3 = "JAVA";
		String st4 = "python";
		System.out.println("\nequals method: " + st1.equals(st2));// true because content and case is same
		System.out.println("equals method: " + st1.equals(st3));// false because case is not same
		System.out.println("equals method: " + st1.equals(st4));// false because content is not same
		System.out.println("equalsIgnorecase method: " + st1.equalsIgnoreCase(st3));// true because content is same
																					// ignoring cases

		// used to specify the format in which the string need to be displayed/ stored
		System.out.println("\nFormatting string: " + String.format("%s - %s", string1, string2));

		// used to get the bytes of each char in the string
		String stringData = "ABCDEFG";
		System.out.println("\nget Bytes method: ");
		byte[] barr = stringData.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.print(barr[i] + " ");
		}

		// getChars() method copies the content of this string into a specified char array
		String str = new String("hello every one how r u");
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println("\n\nget Chars method: " + Arrays.toString(ch));
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		// method returns an integer hash code value for the object based on its internal state.
		String str1 = "Hello";
		System.out.println("\nHashCode for str1: " + str1.hashCode());
		
		// method returns the index of the given char in the string if present else returns -1
		System.out.println("\nIndex of method: " + str.indexOf('e'));
		
		// The intern() method returns the canonical representation of the String object, 
		// which means that calling intern() on two equal strings will return the same reference 
		// if they are already interned.
		String strA = new String("hello").intern();
		String strB = "hello";

		System.out.println("\nintern method: " + (strA == strB)); // Output: true
		
		// returns true if the length of the string is 0 else returns false
		String strData = "";
		System.out.println("\nis empty method: " +strData.isEmpty()); // Output: true
		
		// returns true if the string contains only spaces else returns false
		strData = "  ";
		System.out.println("\nis blank method: " + strData.isBlank()); // Output: true
		System.out.println("is empty method: " + strData.isEmpty()); // Output: false

		str1 = "Hello";
		// method returns the index of the given char in the string which check from the last if present else returns -1
		System.out.println("\nlast Index of method: " + str1.lastIndexOf('l'));
		System.out.println("\nlast Index of method: " + str1.lastIndexOf('a'));
		
		// method returns the length of the string
		System.out.println("\nlength method: " + str1.length());
		
		String string5="java is a very important stack"; 
		//replaces all occurrences of 'a' to 'e' 
		System.out.println("\nstring before using replace method: " + string5);
		String replaceString = string5.replace('a','e'); 
		System.out.println("string after using replace method: " + replaceString);

		// This method replaces all occurrences of substrings in the string 
		// that match the specified regular expression (regex) with the specified replacement string (replacement).
		string5="Say Hello to All"; 
		System.out.println("\nstring before using replaceAll method: " + string5);
		replaceString = string5.replaceAll("l+","e"); 
		System.out.println("string after using replaceAll method: " + replaceString);
		
		str1 = "Hello world";
		// split() method splits this string against given regular expression and returns a char array
		String[] strArray = str1.split(" ");
		System.out.println("\nsplit method: " +Arrays.toString(strArray));

		strArray = str1.split("");
		System.out.println("split method: " + Arrays.toString(strArray));
		
		
		// method checks if this string starts with a given prefix.
		// It returns true if this string starts with the given prefix; else returns false.
		System.out.println("\nstarts with method: " + string1.startsWith("Hel"));
		System.out.println("starts with method: " + string1.startsWith("Hle"));
		
		// substring() method returns a part of the string.
		s1="javaclass";  
		System.out.println("\nsubstring method using start index and end index: " + s1.substring(2,4));//returns va  
		System.out.println("substring method using start index: " + s1.substring(2)); //returns vaclass  

		// toCharArray method convert the string to a character array
		char[] arrayChar = s1.toCharArray();
		System.out.println("\nto char array method: " + Arrays.toString(arrayChar));//returns char array  

		// toLowerCase method convert the string to lower case
		s2= "HELLO";
		System.out.println("\nOriginal string: " + s2);
		System.out.println("to lower case method: " + s2.toLowerCase());
		
		// toUpperCase method convert the string to upper case
		s2= "hello";
		System.out.println("\nOriginal string: " + s2);
		System.out.println("to upper case method: " + s2.toUpperCase());
		
		// trim method removes the white spaces in the end of the string
		s2 = "hello all   ";
		System.out.println("\nLength of string before trim: " + s2.length());
		System.out.println("Length of string after trim: " + s2.trim().length());
		
		// valueOf method converts a data type value to a string value
		int value = 30;
		String strValue = String.valueOf(value); // changing the integer variable value to string
		System.out.println("\nvalue of method: " + strValue);

	}

}
