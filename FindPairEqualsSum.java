package Practice;

public class FindPairEqualsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int target=7;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
				
			}
		}
		

	}

}
