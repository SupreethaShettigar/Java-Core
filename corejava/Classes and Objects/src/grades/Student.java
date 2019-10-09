package grades;

public class Student {
	int id;
	String name;
	int per;
	public Student(int id, String name, int per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
	}
	void display(int per) {
	  if(per>=90 && per<=100)
		  System.out.println("Grade obtained by student is:S+");
	  else if(per>=80 && per<=89)
		  System.out.println("Grade obtained by student is:S");
	  else if(per>=70 && per<=79)
		  System.out.println("Grade obtained by student is:A");
	  else if(per>=60 && per<=69)
		  System.out.println("Grade obtained by student is:B");
	  else if(per>=50 && per<=59)
		  System.out.println("Grade obtained by student is:C");
	  else if(per>=40 && per<=49)
		  System.out.println("Grade obtained by student is:D");
	  else if(per>=35 && per<=39)
		  System.out.println("Grade obtained by student is:E");
	  else 
		  System.out.println("FAIL");
	  

}
}
