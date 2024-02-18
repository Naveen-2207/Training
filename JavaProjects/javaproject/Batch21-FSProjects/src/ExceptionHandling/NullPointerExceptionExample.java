package ExceptionHandling;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		try {
			String s = null;
			String s1 = "Hello";
			System.out.println(s.length());  // exception thrown
			System.out.println(s.equals(s1)); // exception thrown
			System.out.println(s1.equals(s)); // exception not thrown
		} catch (NullPointerException e) {
			System.err.println(e);
		}
		System.out.println("Program Terminated");
		
	}
}
