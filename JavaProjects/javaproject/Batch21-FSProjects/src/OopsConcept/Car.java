package OopsConcept;

public class Car {
	String carName;
	int carYear;
	float carMileage;
		
	public Car() {
		carName = "Honda";
		carYear = 2022;
		carMileage = 9.5f;
	}
	public Car(int year, String name, float mileage) {
		carName = name;
		carYear = year;
		carMileage = mileage;
	}
	public Car(String carName, int carYear, float carMileage) {
		this.carName = carName;
		this.carYear = carYear;
		this.carMileage = carMileage;
	}
	public Car(Car obj) {
		carName = obj.carName;
		carYear = obj.carYear;
		carMileage = obj.carMileage;
	}
	
	public static void main(String[] args) {
		Car carA = new Car();    // calls default constructor
		System.out.println(carA.carName + " " + carA.carYear + " " + carA.carMileage);
		
		Car carB = new Car("Alto", 2008, 17.5f);   // calls Parameterized Constructor
		System.out.println(carB.carName + " " + carB.carYear + " " + carB.carMileage);
		
		Car carC = new Car(2012, "Ford", 20.5f);   // calls Parameterized Constructor
		System.out.println(carC.carName + " " + carC.carYear + " " + carC.carMileage);
		
		Car carD = new Car(carB);   // calls copy constructor
		System.out.println(carD.carName + " " + carD.carYear + " " + carD.carMileage);
		
		
	}

}
