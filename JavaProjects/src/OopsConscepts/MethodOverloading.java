package OopsConscepts;

class Addition{
	public void toAddNumber(int a, int b) {
		System.out.println("Sum of two number: "+(a+b));
	}
	public void toAddNumber(int a, int b, int c) {
		System.out.println("Sum of two number: "+(a+b+c));
	}
	public void toAddNumber(float a, int b, double c) {
		System.out.println("Sum of two number: "+(a+b+c));
	}
	public void toAddNumber(float a, double b, long c) {
		System.out.println("Sum of two number: "+(a+b+c));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("Method Overloading:");
	Addition nav = new Addition();
	System.out.println("By Changing the number of arguments");
	nav.toAddNumber(25, 50);
	nav.toAddNumber(25, 45, 65);
	System.out.println("By Changing the type of arguments");
	nav.toAddNumber(10.25f, 55, 25.25);
	nav.toAddNumber(25.75f, 45.5, 25862578);

	}

}
