package employee;

public class Permanent extends Employee {
	float bonus,salary;

	public Permanent(int id, String name, float bonus, float salary) {
		super(id, name);
		this.bonus = bonus;
		this.salary = salary;
	}
	public void print() {
		super.calculate(bonus, salary);
		//super.totalsalary=bonus+salary;
        super.print();
		System.out.println("Bonus= " +bonus);
		System.out.println("Salary= " + salary);
	}

	

}
