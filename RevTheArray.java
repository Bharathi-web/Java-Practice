package project;

public class RevTheArray {

	public static void main(String[] args) {
		int arr[]= {1,5,7,8,4,2};
		String s[]= {"Bharathi","vasanth","Yoga","Vishnu"};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
