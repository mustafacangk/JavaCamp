package work3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		 
		Scanner scan = new Scanner(System.in);			 
		Student student1 = new Student();
		Student student2 = new Student();	 		
		System.out.println("1.Öðrencinin ismini gir: ");
		student1.setId(1);			 
		String studentName1 = scan.nextLine();
		student1.setFirstName(studentName1);
		student2.setId(2);
		System.out.println("2.Öðrencinin ismini gir: ");
		String studentName2 = scan.nextLine();
		student2.setFirstName(studentName2);		 	 
		Student[] students = {student1,student2};			
		System.out.println(">Öðrenci Listesi<");
		for (Student stundents : students) {

			System.out.println(stundents.getId()+". Öðrenci: "+stundents.getFirstName());
		}	
		 	 		 
			Instructor ýnstructor1 = new Instructor();
			Instructor ýnstructor2 = new Instructor();
			System.out.println("1.Eðitmenin adýný gir: ");
			ýnstructor1.setId(1);			 
			String firstName1 = scan.nextLine();
			ýnstructor1.setFirstName(firstName1);
			ýnstructor2.setId(2);
			System.out.println("2.Eðitmenin adýný gir: ");
			String firstName2 = scan.nextLine();
			ýnstructor2.setFirstName(firstName2);	
			
			
			Instructor[] ýnstructors = {ýnstructor1,ýnstructor2};
				 	
			System.out.println(">Eðitimci Listesi<");
			for (Instructor car : ýnstructors) {

				System.out.println(+car.getId()+". Araba: "+car.getFirstName());
			}	
			 
			scan.close();
 
		 
	}

}
