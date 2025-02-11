package project;

public class FindCount {

	public static void main(String[] args) {
		int num=15300;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println(count);

	}

}
