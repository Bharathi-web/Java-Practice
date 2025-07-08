package Practice;

import java.util.ArrayList;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public void info() {
		System.out.println("Name: "+name);
	}
}

class Emp extends Person{
	
	 Emp(String name) {
		 super(name);		
	}
	 public void work() {
		 System.out.println(name+" is Working");
	 }
}

class Dev extends Emp{
	Dev(String name){
		super(name);
	}
	public void develop() {
		System.out.println(name+ " is Developing Software");
	}
}

class Manager extends Emp{
	Manager(String name){
		super(name);
	}
	public void manage() {
		System.out.println(name+" is Managing the team");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		/*Emp e=new Emp("Bharathi");
		e.info();
		e.work();
		Dev d=new Dev("Yoga");
		d.info();
		d.work();
		d.develop();
		Manager m=new Manager("Mohanaperumal");
		m.info();
		m.work();
		m.manage();*/
	ArrayList<Emp> al=new ArrayList<>();
	al.add(new Emp("Bharathi"));	
	al.add(new Dev ("Yoga"));
	al.add(new Manager("Mohan"));
	for (Emp e: al) {
	  e.info();
	  e.work();
	  
	  if(e instanceof Dev) {
		  ((Dev) e).develop();
	  }
	  else if (e instanceof Manager) {
		  ((Manager) e).manage();
	  }
		
	  System.out.println();
	}

	}}
