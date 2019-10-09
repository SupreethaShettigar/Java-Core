package grades;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter student id");
		int id=scan.nextInt();
		System.out.println("enter student name");
		String name=scan.next();
		System.out.println("enter the percentage");
		int per=scan.nextInt();
		Student s= new Student(id,name,per);
		s.print();
		s.display(per);	
		

	}

}
