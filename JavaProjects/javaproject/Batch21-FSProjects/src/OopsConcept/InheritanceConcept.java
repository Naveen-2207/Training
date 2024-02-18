package OopsConcept;

// single level inheritance
class AClass{
	private int b = 10;
	protected int c = 11;
	public void sayHello() {
		System.out.println("Hello!!!");
	}
}

class BClass extends AClass{
	int a = 10;
}


// Hierarchical inheritance

class PClass{
	private int b = 10;
	protected int c = 11;
	public void sayHello() {
		System.out.println("Hello!!!");
	}
}

class RClass extends PClass{
	int a = 10;
}

class QClass extends PClass{
	int a = 10;
}

// multilevel inheritance

class ParentClass{
	private int b = 10;
	protected int c = 11;
	public void sayHello() {
		System.out.println("Hello!!!");
	}
}

class SubParentClass extends ParentClass{
	public void sayBye() {
		System.out.println("Bye!!!");
	}
}

class childClass extends SubParentClass{
	public void sayWelcome() {
		System.out.println("Bye!!!");
	}
}


public class InheritanceConcept {

	public static void main(String[] args) {
		// Single inheritance
		System.out.println("Single inheritance");
		BClass objB = new BClass();
		System.out.println(objB.a + " " + objB.c);
		objB.sayHello();
		
		// Hierarchical inheritance
		System.out.println("Hierarchical inheritance");
		RClass objR = new RClass();
		System.out.println(objR.a + " " + objR.c);
		objR.sayHello();
		QClass objQ = new QClass();
		System.out.println(objQ.a + " " + objQ.c);
		objQ.sayHello();
		
		// multilevel inheritance
		System.out.println("Multilevel inheritance");
		childClass childObj = new childClass();
		childObj.sayHello();
		childObj.sayBye();
		childObj.sayWelcome();

	}

}
