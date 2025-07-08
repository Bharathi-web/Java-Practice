package Practice;

class Employee{
	String name;
	double sal;
	Employee(String n,double s){
		this.name=n;
		this.sal=s;
	}
	public double calsal() {
		return sal;
	}
}

class Man extends Employee{
	double intensive;
	Man(String n,double s,double intensive){
		super(n,s);
		this.intensive=intensive;
		
	}
	public double calsal() {
		return sal+intensive;
	}
}

class Programmer extends Employee{
	double overtime;
	Programmer(String n,double s, double ot){
		super(n,s);
		this.overtime=ot;
	}
	public double calsal() {
		return sal+overtime;
	}

	
}

public class RunTimePoly {

	public static void main(String[] args) {
		Employee m=new Man("Bharathi",20000,3000);
		System.out.println(m.calsal());
	}

}
