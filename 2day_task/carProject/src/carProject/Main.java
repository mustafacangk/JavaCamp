package  carProject;

import java.util.Scanner;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);			 
		Category category1 = new Category();
		Category category2 = new Category();
		CategoryManager categoryManager = new CategoryManager();	 			
		System.out.println("1.Kategori ismini gir: ");
		category1.setId(1);			 
		String categoryName = scan.nextLine();
		category1.setCategoryName(categoryName);
		category2.setId(2);
		System.out.println("2.Kategori ismini gir: ");
		String categoryName2 = scan.nextLine();
		category2.setCategoryName(categoryName2);		 	 
		Category[] categories = {category1,category2};
		categoryManager.addCategoryMultiple(categories);		
		Category[] categorys = { category1, category2 };	
		System.out.println(">Kategori Listesi<");
		for (Category category : categorys) {

			System.out.println(+category.getId()+". Kategori: "+category.getCategoryName());
		}	
		 	 		 
			Car car1 = new Car();
			Car car2 = new Car();
			System.out.println("1.Arabanın markasını gir: ");
			car1.setId(1);			 
			String makeName1 = scan.nextLine();
			car1.setMakeCar(makeName1);
			car2.setId(2);
			System.out.println("2.Arabanın ismini gir: ");
			String makeName2 = scan.nextLine();
			car2.setMakeCar(makeName2);	
			
			
			Car[] cars = {car1,car2};
				 	
			System.out.println(">Araba Listesi<");
			for (Car car : cars) {

				System.out.println(+car.getId()+". Araba: "+car.getMakeCar());
			}	
			 
			scan.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/*
		//Car car1 = new Car(1,1,"Opel","Astra","100.000","10");
		Car car1 = new Car();
		car1.setId(2);
		car1.setMakeCar("Alfa");
		car1.setModalCar("156");
		car1.setCarPrice(123.20);
		car1.setDiscount(10.0);	 
		System.out.println(car1.getUnitPriceAfterDiscount());
		System.out.println(car1.getMakeCar());
		Car car2 = new Car();
		car2.setId(2);
		car2.setMakeCar("Alfa");
		car2.setModalCar("156");
		car2.setCarPrice(123.20);
		car2.setDiscount(10.0);	 
		System.out.println(car2.getUnitPriceAfterDiscount());
		System.out.println(car2.getMakeCar());

		/*CarManager carManager = new CarManager();
		Car[] cars = { car1,car2 };
				
		System.out.println(">Araba Listesi<");
		for (Car car : cars) {
			System.out.println(car.makeCar+car.modalCar);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println(">Eklendi Bilgi EkranÄ±<");
		
		carManager.addCar(car1);
		carManager.addCar(car2);

		System.out.println("------------------------------------------------------------------------");
		System.out.println(">Silindi Bilgi EkranÄ±<");
		
		carManager.deleteCar(car1);
		carManager.deleteCar(car2);

		System.out.println("------------------------------------------------------------------------");
		
		System.out.println(">Son Araba Listesi<");
		for (Car car : cars) {
			System.out.println(car.makeCar+car.modalCar);
		}
		*/
	}

}