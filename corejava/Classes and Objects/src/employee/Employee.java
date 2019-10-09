package employee;

public class Employee {
	protected int id;
	protected String name;
	protected float totalsalary;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println("Id= " + id);
		System.out.println("Name= " + name);
		System.out.println("Totalsalary= " + totalsalary);
	}
	

	public void calculate(float bonus, float salary) {
		// TODO Auto-generated method stub
		totalsalary=bonus+salary;
	}
	public void calculate(int days, float charges) {
		// TODO Auto-generated method stub
		totalsalary=(days*charges);
	}
}
