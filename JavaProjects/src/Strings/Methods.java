package Strings;

public class Methods {
	static int a=19;
	int b=18;
	public void fun() {
		int a=10;
		System.out.println(a);
	}
	public static void fun1() {
		int a=10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Methods b =new Methods();
		System.out.println(a);
		System.out.println(b.b);
		b.fun();
		fun1();
		Const.Const();
		
	}

}
