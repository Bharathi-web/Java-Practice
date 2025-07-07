package interviews;

public class interview {

	public static void main(String[] args) {
		int a[]= {2,5,1,4,8,4,23,22};
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
		
			}
		}
		System.out.println("The Largest number in the array is:"+max);
		

	}

}
