package work3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		 
		Scanner scan = new Scanner(System.in);			 
		Student student1 = new Student();
		Student student2 = new Student();	 		
		System.out.println("1.��rencinin ismini gir: ");
		student1.setId(1);			 
		String studentName1 = scan.nextLine();
		student1.setFirstName(studentName1);
		student2.setId(2);
		System.out.println("2.��rencinin ismini gir: ");
		String studentName2 = scan.nextLine();
		student2.setFirstName(studentName2);		 	 
		Student[] students = {student1,student2};			
		System.out.println(">��renci Listesi<");
		for (Student stundents : students) {

			System.out.println(stundents.getId()+". ��renci: "+stundents.getFirstName());
		}	
		 	 		 
			Instructor �nstructor1 = new Instructor();
			Instructor �nstructor2 = new Instructor();
			System.out.println("1.E�itmenin ad�n� gir: ");
			�nstructor1.setId(1);			 
			String firstName1 = scan.nextLine();
			�nstructor1.setFirstName(firstName1);
			�nstructor2.setId(2);
			System.out.println("2.E�itmenin ad�n� gir: ");
			String firstName2 = scan.nextLine();
			�nstructor2.setFirstName(firstName2);	
			
			
			Instructor[] �nstructors = {�nstructor1,�nstructor2};
				 	
			System.out.println(">E�itimci Listesi<");
			for (Instructor car : �nstructors) {

				System.out.println(+car.getId()+". Araba: "+car.getFirstName());
			}	
			 
			scan.close();
 
		 
	}

}
