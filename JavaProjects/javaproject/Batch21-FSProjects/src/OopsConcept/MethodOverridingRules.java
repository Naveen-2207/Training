package OopsConcept;

//1. Overriding and Access Modifiers
//2. Final methods can not be overridden
//3. Static methods can not be overridden
//4. Private methods can not be overridden
//5. The overriding method must have the same return type

class AClassData {
	private void studentDetails() {
		System.out.println("Hello");
	}
	public void method() {   
		studentDetails();
	}
}
class DataClass1 extends AClassData {
	// Cannot override the static method from superclass
	private void studentDetails() {   
		System.out.println("World");
	}
}


public class MethodOverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataClass1 obj = new DataClass1();
		obj.method();
		
	}

}
