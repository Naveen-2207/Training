package ExceptionHandling;

//concept of today
//Method Overloading and Method overriding 
//Exception handling basic concept

public class ExceptionBasicConcept {
	public static void method() throws ArithmeticException{
		int a = 10;
		int b = 0;

		int c = a / b;
		System.out.println(c);
	}
	public static void main(String[] args){		
		try {
			method();
		}catch (ArithmeticException e) {
			System.out.println(e);
//			throw e;
		}
		System.out.println("Program completed");
	}
}
