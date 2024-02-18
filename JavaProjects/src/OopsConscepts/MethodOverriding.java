package OopsConscepts;

class StudentData {
	public void studentDetails() {
		System.out.println("Name: " + "Hello");
		System.out.println("Roll No: " + "123");
	}
}

class Navee extends StudentData {
	public void studentDetails() {
		super.studentDetails();
		System.out.println("Name: " + "Navee");
		System.out.println("Roll No: " + "1");
	}
}

class Jasir extends StudentData {
	public void studentDetails() {
		System.out.println("Name: " + "Jasir");
		System.out.println("Roll No: " + "12");

	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		System.out.println("Method Overriding: ");
		Navee nav = new Navee();
		nav.studentDetails();
		Jasir nav1 = new Jasir();
		nav1.studentDetails();

	}

}
