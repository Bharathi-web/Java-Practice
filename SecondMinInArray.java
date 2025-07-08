package Practice;

public class SecondMinInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,6,7,8};
		int m1=arr[0],m2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<m1) {
				m1=arr[i];
			}}
			boolean ismin=false;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=m1) {
					if(arr[i]<m2 || !ismin) {
						m2=arr[i];
						ismin=true;
						
					}
					
				}
			}
			
		if(ismin) {	
    System.out.println("The second min "+m2);
		}
		else {
			System.out.println("No second largest");
		}

	}

}
