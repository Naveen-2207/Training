package OopsConcept;
// Two ways to implement method overloading

// 1. By changing the number of arguments
// 2. By changing the data type

class Addition {
	public void toAddTwoNumber(int a, int b) {
		System.out.println("Sum of two number: " + (a + b));
	}

	public void toAddTwoNumber(int a, int b, int c) {
		System.out.println("Sum of three number: " + (a + b + c));
	}

	public void toAddTwoNumber(double a, double b) {
		System.out.println("Sum of two double number: " + (a + b));
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method overloading");
		Addition obj = new Addition();
		System.out.println("By changing the number of arguments");
		obj.toAddTwoNumber(5, 6); // 1st method
		obj.toAddTwoNumber(5, 6, 7); // 2st method
		System.out.println("By changing the type of arguments");
		obj.toAddTwoNumber(5.0, 6.0); // 3rd method

	}

}
