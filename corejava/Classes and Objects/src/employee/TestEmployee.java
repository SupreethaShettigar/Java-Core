package employee;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Permanent p=new Permanent(2, "John", 3000, 5000);
//p.print();
//Consultant c=new Consultant(5, "Ronak", 5, 1000);
//c.print();
		
		//Employee[]  emp=new Employee[2];
		//emp[0]=new Permanent(2, "John", 3000, 5000);
		//emp[0].print();
		//emp[1]=new Consultant(5, "Ronak", 5, 1000);
		//emp[1].print();
		//for(Employee e1:emp)
			//e1.print();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of employee:");
		Employee[]  emp=new Employee[scan.nextInt()];
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("1:Permanent Employee\n 2.Consultant Employee");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter employee id name bonus salary:\n");;
			       emp[i]=new Permanent(scan.nextInt(),scan.next(),scan.nextFloat(),scan.nextFloat());
			       break;
			case 2:System.out.println("Enter employee id name days charges:\n");;
		           emp[i]=new Consultant(scan.nextInt(),scan.next(),scan.nextInt(),scan.nextFloat());
		    default:System.out.println();
			}
		}
		System.out.println("--------Employee details----");
		for(Employee e1:emp)
		{
			e1.print();
			System.out.println("------------------------");
		}
			
		
		
	}

}
