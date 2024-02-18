package Strings;

public class StringBasic {

	public static void main(String[] args) {
		String s="naveen";
		String s1="Kutty";
//		System.out.println(s.compareTo(s1));
//		System.out.println(s.codePointAt(2));
//		System.out.println(s.codePointBefore(5));
//		System.out.println(s.codePointCount(0, 4));
		System.out.println(s + s1);
		System.out.println(s.contentEquals(s1));
//		System.out.println(s.copyValueOf(null));
		System.out.println(String.format("%sLoves%s", s1,s));

	}

}
