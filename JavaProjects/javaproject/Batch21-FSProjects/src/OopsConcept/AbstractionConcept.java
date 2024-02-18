package OopsConcept;

// using abstract class
abstract class NewClass{
	int a = 10;
	public void sayHello() {
		System.out.println("Hello...");
	}
	abstract void sayBye();
}

// abstract class in inherited and abstract method implementation is provided.
class NewClass1 extends NewClass{
	void sayBye() {
		System.out.println("Bye...");
	}

}

// using interface
interface InterfaceNew extends data{
	// can have only abstract methods
	// by default all attributes are static and final
	int a = 10; // a is static and final variable
	void sayGoodMorning();  // abstract method
}

interface data{
	void data(); 
}
class NewClass2 implements InterfaceNew{
	public void sayGoodMorning() {
		System.out.println("Good morning");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractionConcept {
	public static void main(String[] args) {
		System.out.println("Abstraction using Abstract Class");
		NewClass1 obj = new NewClass1();
		obj.sayHello();
		obj.sayBye();
		System.out.println("a = " +obj.a);
		
		System.out.println("Abstraction using interface");
		NewClass2 obj1 = new NewClass2();
		obj1.sayGoodMorning();
		System.out.println(NewClass2.a);

	}
}
