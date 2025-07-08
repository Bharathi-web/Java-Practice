package Practice;

import java.util.ArrayList;

class Calculator{
	Calculator(){
		System.out.println("Calculator Program");
	}
   public int adds(int a,int b) {
		return a+b;
	}
	
	public double adds(double a,double b) {
		return a+b;
	}
}

public class CompileTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator c=new Calculator();
		//System.out.println(c.add(5, 10));
		//System.out.println(c.add(5.55, 40.0));
		ArrayList<Calculator> a=new ArrayList<>();
		a.add(new Calculator());
		for(Calculator cal:a) {
			System.out.println(cal.adds(10,20));
		}

	}

}
