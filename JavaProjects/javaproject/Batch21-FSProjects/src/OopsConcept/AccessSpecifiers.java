package OopsConcept;

class A{
	private int a = 10;
	protected int b = 11;
	public int c = 12;
	int d = 13;
	
	private void method() {
		System.out.println(a + b + c + d);
	}
	protected void method1() {
		method();
		System.out.println(a + b + c + d);
	}
	public void method2() {
		System.out.println(a + b + c + d);
	}
}

public class AccessSpecifiers {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.b + obj.c + obj.d);
		obj.method1();
		obj.method2();
	}

}
