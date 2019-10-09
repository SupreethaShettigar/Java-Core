package encapsulation;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Employee e1=new Employee();
System.out.println("Enter id");
e1.setId(scan.nextInt());
System.out.println("Enter name");
e1.setName(scan.next());
System.out.println("enter salary");
e1.setSalary(scan.nextFloat());
System.out.println("enter id name salary");
Employee e2=new Employee(scan.nextInt(),scan.next(),scan.nextFloat());
e1.print();
e2.print();
	}

}
