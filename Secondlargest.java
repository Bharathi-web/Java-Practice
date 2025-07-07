package Practice;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,8,5};
		int max1=Integer.MAX_VALUE,max2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]<max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println("SEcond largest:"+max2);

	}

}
