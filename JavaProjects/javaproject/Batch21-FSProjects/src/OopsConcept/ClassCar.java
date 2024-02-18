package OopsConcept;

public class ClassCar {

	String carName;
	int carYear;
	float carMileage;
	
	static int carCount = 0;
		
	public ClassCar() {
		carName = "Honda";
		carYear = 2022;
		carMileage = 9.5f;
		carCount++;
	}
	public ClassCar(int year, String name, float mileage) {
		carName = name;
		carYear = year;
		carMileage = mileage;
		carCount++;
	}
	public ClassCar(String carName, int carYear, float carMileage) {
		this.carName = carName;
		this.carYear = carYear;
		this.carMileage = carMileage;
		carCount++;
	}
	
	public static void main(String[] args) {
		ClassCar carA = new ClassCar();    // calls default constructor
		System.out.println(carA.carName + " " + carA.carYear + " " + carA.carMileage);
		
		ClassCar carB = new ClassCar("Alto", 2008, 17.5f);   // calls Parameterized Constructor
		System.out.println(carB.carName + " " + carB.carYear + " " + carB.carMileage);
		
		ClassCar carC = new ClassCar(2012, "Ford", 20.5f);   // calls Parameterized Constructor
		System.out.println(carC.carName + " " + carC.carYear + " " + carC.carMileage);
		
		System.out.println(carCount);
		
	}

}
