package OopsConcept;

class Hello{
	// static variable
	static int count = 0;
	// non-static variable
	int data;
	
	// static method
	public static void printHello() {
		System.out.println("Print Hello!!!");
	}
	// non-static method
	public void sayHello() {
		System.out.println("Say hello!!!");
	}
}

public class CarClass1 {
	public static void main(String[] args) {
		System.out.println("Implementing using static keyword");
		Hello.printHello();
		System.out.println(Hello.count);
		
		Hello obj = new Hello();
		System.out.println("Implementing without using static keyword");
		obj.sayHello();
		obj.data = 5;
		System.out.println(obj.data);
	}
}
