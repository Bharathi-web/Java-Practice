package Practice;

public class MoveAllZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,2,0,3};
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k++]=arr[i];
			}
		}
		while(k<arr.length) {
			arr[k++]=0;
		}
		for(int num:arr) {
			System.out.println(num);
			
		}

	}

}
