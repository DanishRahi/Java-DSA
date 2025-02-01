package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student("danish");
		System.out.println(s1.name);
		System.out.println(s1.getRollNumber);
		s1.print();

		Student s2 = new Student("asad" , 121);
		s2.print();
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.getRollNUmber());
		
		
	}

}
