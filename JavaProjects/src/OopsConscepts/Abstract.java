package OopsConscepts;
//Abstract class:
//abstract class in inherited and abstract method implementation is provided
abstract class Animal {
	int a = 10;
public void sleep() {
	System.out.println("Zeee");
}
abstract void animelsound();
}
class Dog extends Animal {
	void animalsound() {
		System.out.println("Lol lol lol..");
	}
}
//Using Interface:
interface New {
	//Can have only Abstract Methods
	//by default all attributes are Static And Final Attributes
	
	int a = 10;  //Static variable
	final int b = 11;  //Final variable
	void sayGoodMorning(); //Abstract Method
}
class Dogs implements New {
	public void sayGoodMorning(){
		 System.out.println("Good Morning");    
	}
}

public class Abstract {
	public static void main(String[] args) {
		Dog nav = new Dog();
		nav.sleep();
		nav.animalsound();
		System.out.println("a = "+nav.a);
		System.out.println("Abstraction using Interface0");
		Dogs nav1 = new Dogs();
		nav1.sayGoodMorning();
		System.out.println(nav1.a + nav1.b);
	}

} 
 