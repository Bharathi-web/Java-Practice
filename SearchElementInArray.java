package Practice;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int search,index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Search element: ");
		search=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				index=i;
				found=true;
			}
		
		}
		if(found) {
			System.out.println("the element found at the index of "+index);
		}
		else {
			System.out.print("No element found");
		}

	}

}
