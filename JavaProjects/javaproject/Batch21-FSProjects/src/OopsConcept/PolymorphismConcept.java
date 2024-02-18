package OopsConcept;

class Vehicle{
	public void vehicleName() {
		System.out.println("It is a Vehicle");
	}
}

class Auto extends Vehicle{
	public void vehicleName() {
		System.out.println("It is an Auto");
	}
}

class Bus extends Vehicle{
	public void vehicleName() {
		System.out.println("It is a Bus");
	}
}

class Bike{
	public void vehicleName() {
		System.out.println("It is a Bike");
	}
}


public class PolymorphismConcept {
	public static void main(String[] args) {
		System.out.println("Polymorphism Concept");
		Vehicle vehicle = new Vehicle();
		Vehicle auto = new Auto();
		Vehicle bus = new Bus();
		Bike bike = new Bike();
		//implementation of Vehicle class
		vehicle.vehicleName();
		//implementation of Auto class
		auto.vehicleName();
		//implementation of Bus class
		bus.vehicleName();
		//implementation of Bike class
		bike.vehicleName();
		
	}

}
