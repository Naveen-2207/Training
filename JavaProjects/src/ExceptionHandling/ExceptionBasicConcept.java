package ExceptionHandling;

public class ExceptionBasicConcept {

	public static void method() throws ArithmeticException {
		int a = 10;
		int b = 0;
		int c = a % b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println(e);
			throw e; 
		}

		finally {
			System.out.println("Finally Block");
		}
		System.out.println("Program completed");
	}

}
