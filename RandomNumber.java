package project;
import java.lang.Math;
public class RandomNumber {

	public static void main(String[] args) {
		double a=Math.random();
		System.out.println(a);
		int min=1000;
		int max=9999;
		int b=(int) (Math.random()*(max-min+1)+min);
		System.out.println(b);

	}

}
