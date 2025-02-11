package project;
//logic first number + sec number = third number
//f(0)=0,f(1)=1,f(n)=f(n-1)+f(n-2) for n>1

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}

	}

}
