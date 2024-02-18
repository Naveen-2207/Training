package Strings;

public class Const {

	Const(String name, int a, int b, float c, char d) {
//		Name = name;
//		A = a;
//		B = b;
//		C = c;
//		D = d;
	}

	Const() {
		System.out.println("Default Constuctor");
	}

	public static void main(String[] args) {
		Const n = new Const("Naveen", 10, 10, 10, 'a');
//		System.out.println("Perametered Constructor: " + n.name + " " + n.a + " " + n.b + " " + n.c + " " + n.d);
		Const d = new Const();
		System.out.println(Methods.a);
		Methods b = new Methods();
		System.out.println(b.b);
		b.fun();
		Methods.fun1();

	}

//	public static void Const() {
//		System.out.println("Naveen");
//
//	}
}
