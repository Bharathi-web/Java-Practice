package project;

public class PalindromForNum {

	public static void main(String[] args) {
		int num=232;
		int n=num;
		int m=0;
		while(num>0) {
			int temp=num%10;
			m=m*10+temp;
			num=num/10;
		}
		System.out.println(m);
			if(n==m) {
				System.out.println("Is Palindrom");
				
			}
			else {
				System.out.println("Not a palindrom");
			}
		

	}

}
