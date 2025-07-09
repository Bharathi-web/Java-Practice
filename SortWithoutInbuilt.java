package Practice;

public class SortWithoutInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,6,8,4,5,9,5};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
		
	}

}
