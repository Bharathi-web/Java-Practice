package project;

public class ReverseTheNum {

	public static void main(String[] args) {
		int num=150;
		int count=0;
		while(num>0) {
			int n=num%10;
			System.out.print(n);
			num=num/10;
			
		}

	}

}
