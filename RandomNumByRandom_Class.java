package project;
import java.util.Random;
import java.util.Random.*;

public class RandomNumByRandom_Class {

	public static void main(String[] args) {
		Random random = new Random();   
		int x = random.nextInt(50);   
		int y = random.nextInt(1000,9999);   
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y);   
		
		//if ask for dice game
		int e=random.nextInt(6)+1;
		System.out.println(e);
		boolean m=random.nextBoolean();  
		System.out.println(m);


	}

}
