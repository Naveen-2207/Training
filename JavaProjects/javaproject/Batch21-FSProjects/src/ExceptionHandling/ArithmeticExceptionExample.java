package ExceptionHandling;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.err.println(e);
		}
		System.out.println("Program completed");
	}

}
