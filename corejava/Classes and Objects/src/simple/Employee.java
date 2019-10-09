package simple;

public class Employee {
	int id;
	String name;
	float basicsalary,hra,da;
	float salary;
	public Employee(int id, String name, float basicsalary) {
	
		this.id = id;
		this.name = name;
		this.basicsalary = basicsalary;
		
		
	}
	void calculate() {
		hra=(basicsalary*15)/100;
		da=(basicsalary*20)/100;
		salary=basicsalary+hra+da;
	}
    
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" +salary );
	}

}
