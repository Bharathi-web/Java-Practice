package project;

public class RevNumStoring {

	public static void main(String[] args) {
		int num=678;
		int m=0;
		while(num>0) {
			int temp=num%10;
			m=m*10+temp;
			num=num/10;
		}
		System.out.println("The value stored in m "+m);

	}

}
