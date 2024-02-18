package ExceptionHandling;

public class NullPointExceptionExample {

	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.err.println(e);
		}
		System.out.println("Program Terminated");
	}

}
 