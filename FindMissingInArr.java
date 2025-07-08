package Practice;

public class FindMissingInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5,6,7};
		for(int i=0;i<a.length-1;i++) {
			int b=a[i+1];
			if(b!=a[i]+1) {
				System.out.println(a[i]+1);
			}

	}}

}
