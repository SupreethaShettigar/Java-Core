package employee;

public class Consultant extends Employee{
int days;
float charges;
public Consultant(int id, String name, int days, float charges) {
	super(id, name);
	this.days = days;
	this.charges = charges;
}
public void print() {
	super.calculate(days, charges);
	//super.totalsalary=days*charges;
    super.print();
	System.out.println("No of days= " +days);
	System.out.println("Charges per day= " + charges);
}
}
