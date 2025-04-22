package Interview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SecondLarElem {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int index=0;
		System.out.println("Enter the index value: ");
		index=sc.nextInt();
		int arr[]=new int[index];
		System.out.println("Enter the array values:");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			}
		TreeSet <Integer> t=new TreeSet<>(Comparator.reverseOrder()) ;
			for(Integer c:arr) {
				t.add(c);
			}
			
			Iterator i=t.iterator();{
				i.next();
				i.next();
				int ThirdLar=(int) i.next();
				System.out.println("The Third Largest Number is:");
				System.out.println(ThirdLar);

			}
			
		}
		
	
		
	

}
