package OopsConcept;

class StudentData {
	public void studentDetails() {
		System.out.println("Name: " + "Hello");
		System.out.println("Roll No: " + "123");
	}
}

class Aruna extends StudentData {
	public void studentDetails() {
		System.out.println("Name: " + "Aruna");
		System.out.println("Roll No: " + "1");
		System.out.println("Calling super class method: ");
		super.studentDetails();
	}
}

class Madhan extends StudentData {
	public void studentDetails() {
		System.out.println("Name: " + "Madhan");
		System.out.println("Roll No: " + "12");
	}
}

public class MethodOverriddingConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method Overridding");
		Aruna obj = new Aruna();
		obj.studentDetails();
		
		Madhan obj1 = new Madhan();
		obj1.studentDetails();
	}

}
