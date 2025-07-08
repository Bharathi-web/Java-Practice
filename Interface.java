package Practice;
interface Shapees{
	double getarea();
	
}
class Circless implements Shapees{
	double radius;
	Circless(double r){
		this.radius=r;
	}
	public double getarea() {
		return Math.PI*radius*radius;
	}
}
class Rectanglee implements Shapees{
	double length,breath;
	Rectanglee(double r,double b){
		this.length=r;
		this.breath=b;

	}
	public double getarea() {
		return length*breath;
	}
}class Triangle implements Shapees{
	double base,heigth;
	Triangle(double b,double h){
		this.base=b;
		this.heigth=h;
	}
	public double getarea() {
		return 0.5*heigth*base;
	}
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectanglee r=new Rectanglee(5,8);
		System.out.print(r.getarea());
		
		

	}

}
