package OopsConscepts;

public class Car {
	String carName;
	int carYear;
	float carMileage;
	static int carCount;

	  Car() {
		carName = "BMW";
		carYear = 2020;
		carMileage = 12.52f;
		carCount++;
	}

	public Car(String name, int year, float mileage) {
		carName = name;
		carYear = year;
		carMileage = mileage;
		carCount++;
	}

	public Car(int carYear,String carName, float carMileage){
			this.carName = carName;
			this.carYear = carYear;
			this.carMileage = carMileage;
			carCount++;
	}

	public Car(Car obj) {
		carName = obj.carName;
		carYear = obj.carYear;
		carMileage = obj.carMileage;
		carCount++;
	}

	public static void main(String[] args) {
		Car nav1 = new Car();
		System.out.println(nav1.carName + " " + nav1.carYear + " " + nav1.carMileage);
		Car nav2 = new Car("Audi", 2021, 10.5f);
		System.out.println(nav2.carName + " " + nav2.carYear + " " + nav2.carMileage);
		Car nav3 = new Car("mini", 2023, 12.54f);
		System.out.println(nav3.carName + " " + nav3.carYear + " " + nav3.carMileage);
		Car nav4 = new Car("Etios", 2019, 28.5f);
		System.out.println(nav4.carName + " " + nav4.carYear + " " + nav4.carMileage);
		Car nav5 = new Car(nav3);
		System.out.println(nav5.carName + " " + nav5.carYear + " " + nav5.carMileage);
		Car nav6 = new Car(2025,"Innova",17.5f); 
		System.out.println(nav6.carName + " " + nav6.carYear + " " + nav6.carMileage);
		System.out.println(carCount);

	}

}
