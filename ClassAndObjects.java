package Practice;

class Student{
	String name;
	int id;
	public Student(String n,int i){
		this.name=n;
		this.id=i;
		
	}
	void display() {
		System.out.println("The Student name "+name+" and rollNo "+id);
	}
}

public class ClassAndObjects {
	public static void main(String[] args) {
		Student s=new Student("Bharathi",101);
		s.display();
		

	}

}
