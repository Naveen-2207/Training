package OopsConscepts;

class Vehicle {
	public void vehicleName() {
		System.out.println("It is Vehicle ");
	}
}

class Auto extends Vehicle {
	public void vehicleName() {
		System.out.println("It is Auto ");
	}
}

class Bus extends Vehicle {
	public void vehicleName() {
		System.out.println("It is Bus ");
	}
}

class Bike {
	public void vehicleName() {
		System.out.println("It is Bike ");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("Polymorphism Concept: ");
		Vehicle vehicle = new Vehicle();
		Vehicle auto = new Auto();
		Vehicle bus = new Bus();
		Bike bike = new Bike();
		vehicle.vehicleName();
		auto.vehicleName();
		bus.vehicleName();
		bike.vehicleName(); 
	}

}
