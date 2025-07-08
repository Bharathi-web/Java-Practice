package Practice;

abstract class Shapes{
	Shapes(){
		System.out.println("Shape is created");
	}
	abstract void draw();
	
}
class Circle extends Shapes{
	Circle(){
		super();
	}
	void draw() {
		System.out.println("Circle is drawn");
	}
}
class Rectangle extends Shapes{
	Rectangle(){
		super();
	}
	void draw() {
		System.out.println("Rectangle is drawn");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s=new Circle();
		s.draw();
		Shapes r=new Rectangle();
		r.draw();

	}

}
