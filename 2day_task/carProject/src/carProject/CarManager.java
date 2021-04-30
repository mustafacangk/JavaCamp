package carProject;

public class CarManager {
	

	public static void addCar(Car car) {
		System.out.println("Yeni Araba Bilgileri Eklendi\n"+car.getMakeCar()+"\n"+car.getMakeCar());
	}
	
	public void deleteCar(Car car) {
		System.out.println("Araba Bilgileri silindi\n"+car.getMakeCar()+"\n"+car.getMakeCar());
	}
	
	public static void addCarMultiple(Car[] cars) {
 		for(Car car: cars) {
 			addCar(car);
 		}
 	}
	
	
	}

